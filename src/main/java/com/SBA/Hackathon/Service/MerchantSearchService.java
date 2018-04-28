package com.SBA.Hackathon.Service;

import org.springframework.stereotype.Component;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;

@Component
public interface MerchantSearchService {

	public MerchantLocatorServiceResponse searchMerchantByZipCode(Long zipCode);
	public MerchantLocatorServiceResponse searchMerchantByCategoryCode(Long categoryCode);
	public MerchantLocatorServiceResponse searchMerchantByDistance(float distance);
	public MerchantLocatorServiceResponse searchMerchantByName(String name);
	public MerchantLocatorServiceResponse searchMerchantByCountryCode(Long countryCode);
	
}
