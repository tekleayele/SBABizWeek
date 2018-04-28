package com.SBA.Hackathon.Config;

import java.io.File;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;
import com.SBA.Hackathon.Repository.MerchantSearchRepository;
import com.google.gson.Gson;

@Component
@Order(1)
public class DataLoder implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private MerchantSearchRepository merchantSearchRepository;
	
    @Override
    public void run(String...strings) throws Exception {
       /* logger.info("Loading data...");

        Gson gson = new Gson();
        try {   
        	ClassLoader classLoader = getClass().getClassLoader();
        	File file = new File(classLoader.getResource("Merchant1.json").getFile());
            try {
            	MerchantLocatorServiceResponse merchantLocatorServiceResponse = gson.fromJson(new FileReader(file), MerchantLocatorServiceResponse.class);
            	merchantSearchRepository.save(merchantLocatorServiceResponse);
	        } catch (Exception e) {
	        	logger.error("Exception after file  data...", e);
	        }
        } catch (Exception e) {
        	logger.error("Exception loading data...", e);
        }*/

    }
}
