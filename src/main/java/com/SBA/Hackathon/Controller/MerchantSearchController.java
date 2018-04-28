package com.SBA.Hackathon.Controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServlet;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.pojo.ApiStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SBA.Hackathon.Service.MerchantSearchService;

@RestController
@Api(
        name = "Merchant Search API",
        description = "Provides a list of methods to search merchants using different attributes.",
        stage = ApiStage.RC)
@RequestMapping(value = "/api/merchant")
public class MerchantSearchController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MerchantSearchService merchantSearchService;
		
	@PostConstruct
	public void init(){
		
	}
	
	@RequestMapping("/home")
    public String home(){
        return "SBA BIZ WEEK!";
    }
	
	@RequestMapping(value = "/search/{zipCode}", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiMethod(description = "Search merchants by zip code.")
	public Object searchMerchantByZipCode(HttpServlet response, @ApiPathParam(name = "zipCode")  @PathVariable String zipCode) {
		
		//logger.info("searchMerchantByZipCode called" );
		//merchantSearchService.searchMerchantByZipCode(zipCode);
		return zipCode;
		
	}
}
