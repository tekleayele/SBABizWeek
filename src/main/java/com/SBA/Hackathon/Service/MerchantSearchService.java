package com.SBA.Hackathon.Service;

import org.springframework.stereotype.Component;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;

@Component
public interface MerchantSearchService {

	public MerchantLocatorServiceResponse searchMerchantByZipCode(int zipCode);
}
