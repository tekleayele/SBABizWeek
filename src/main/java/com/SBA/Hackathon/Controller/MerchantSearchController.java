package com.SBA.Hackathon.Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.pojo.ApiStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;
import com.SBA.Hackathon.Service.MerchantSearchService;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

@RestController
@Api(
        name = "Merchant Measurement API",
        description = "Provides a list of methods to search merchants using different attributes.",
        stage = ApiStage.RC)
@RequestMapping(value = "/api/merchant")
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8181"})
public class MerchantSearchController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MerchantSearchService merchantSearchService;
		
	private List<MerchantLocatorServiceResponse> merchantLocatorServiceResponseList;
	
	@PostConstruct
	public void init() throws JsonSyntaxException, JsonIOException, IOException{
		
		ApplicationContext springAppCtx = new ClassPathXmlApplicationContext();
		List<String> fileNameList = new ArrayList<String>();
		fileNameList.add("file:C:\\opt\\Merchant1.json");
		fileNameList.add("file:C:\\opt\\Merchant2.json");
		fileNameList.add("file:C:\\opt\\Merchant3.json");
		fileNameList.add("file:C:\\opt\\Merchant4.json");
		fileNameList.add("file:C:\\opt\\Merchant5.json");
		fileNameList.add("file:C:\\opt\\Merchant6.json");
		fileNameList.add("file:C:\\opt\\Merchant7.json");
		fileNameList.add("file:C:\\opt\\Merchant8.json");
		fileNameList.add("file:C:\\opt\\Merchant9.json");
		Gson gson = new Gson();
		merchantLocatorServiceResponseList = new ArrayList<MerchantLocatorServiceResponse>();
		for(String fileName : fileNameList) {
			// Get external resource from local file.
			Resource resource = springAppCtx.getResource(fileName);
			InputStream inputStream = resource.getInputStream();	
			StringBuilder sb = new StringBuilder();
			String line;
		    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		    while ((line = br.readLine()) != null) {
		        sb.append(line);
		    }
	    	merchantLocatorServiceResponseList.add(gson.fromJson(sb.toString(), MerchantLocatorServiceResponse.class));
		}

	}
	
	@RequestMapping(value = "/getAllMerchantData", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiMethod(description = "Get all merchants data.")
	public List<MerchantLocatorServiceResponse>  getAllMerchantData() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		logger.info("searchMerchantByZipCode called" );
		return merchantLocatorServiceResponseList;
		
	}
	
	@RequestMapping(value = "/searchByZipCode/{zipCode}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiMethod(description = "Search merchants by zip code.")
	public List<MerchantLocatorServiceResponse> searchMerchantByZipCode(@ApiPathParam(name = "zipCode")  @PathVariable Long zipCode) {
		logger.info("searchMerchantByZipCode called" );
		List<MerchantLocatorServiceResponse> result = new ArrayList<MerchantLocatorServiceResponse>();
		for(MerchantLocatorServiceResponse temp :  merchantLocatorServiceResponseList) {
			if(!temp.getRequestData().getPostalCodeList().isEmpty()) {
				for(String postalCode :  temp.getRequestData().getPostalCodeList()) {
					if(String.valueOf(zipCode).equals(postalCode)) {
						result.add(temp);
					}
				}
			}
		}
		return result;
	}
	
	@RequestMapping(value = "/searchByCategoryCode/{categoryCode}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiMethod(description = "Search merchants by Category Code.")
	public MerchantLocatorServiceResponse searchMerchantByCategoryCode(@ApiPathParam(name = "categoryCode")  @PathVariable long categoryCode) {
		logger.info("searchMerchantByCategoryCode called" );
		return merchantSearchService.searchMerchantByCategoryCode(categoryCode);
		
	}
	
	@RequestMapping(value = "/searchByDistance/{distance}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiMethod(description = "Search merchants by Distance.")
	public MerchantLocatorServiceResponse searchMerchantByDistance(@ApiPathParam(name = "distance")  @PathVariable float distance) {
		logger.info("searchMerchantByDistance called" );
		return merchantSearchService.searchMerchantByDistance(distance);
		
	}
	
	@RequestMapping(value = "/searchByName/{name}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiMethod(description = "Search merchants by Name.")
	public MerchantLocatorServiceResponse searchMerchantByName(@ApiPathParam(name = "name")  @PathVariable String name) {
		logger.info("searchMerchantByName called" );
		return merchantSearchService.searchMerchantByName(name);
		
	}
	
	@RequestMapping(value = "/searchByCountryCode/{countryCode}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiMethod(description = "Search merchants by Country Code.")
	public MerchantLocatorServiceResponse searchMerchantByCountryCode(@ApiPathParam(name = "countryCode")  @PathVariable Long countryCode) {
		logger.info("searchMerchantByCountryCode called" );
		return merchantSearchService.searchMerchantByCountryCode(countryCode);
		
	}
	
}
