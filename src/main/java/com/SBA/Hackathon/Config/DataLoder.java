package com.SBA.Hackathon.Config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
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
        logger.info("Loading data...");
        
        Gson gson = new Gson();
        BufferedReader br = null;


        try {
        	File file = new ClassPathResource("Merchant1.json").getFile();
            br = new BufferedReader(new FileReader(file));

            try {
            	MerchantLocatorServiceResponse merchantLocatorServiceResponse = new MerchantLocatorServiceResponse();
            	merchantLocatorServiceResponse = gson.fromJson(br, MerchantLocatorServiceResponse.class);
            	merchantSearchRepository.save(merchantLocatorServiceResponse);
            	logger.info(br.toString());
	        } catch (Exception e) {
	        	logger.error("Exception loading data...");
	        }
        } catch (Exception e) {
        	logger.error("Exception loading data...");
        }

    }
}
