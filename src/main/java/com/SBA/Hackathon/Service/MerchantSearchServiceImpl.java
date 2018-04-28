package com.SBA.Hackathon.Service;

import org.springframework.stereotype.Service;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;

@Service
public class MerchantSearchServiceImpl implements MerchantSearchService {

	public MerchantLocatorServiceResponse searchMerchantByZipCode(int zipCode) {
		MerchantLocatorServiceResponse temp = new MerchantLocatorServiceResponse();
		return temp;
	}
}
