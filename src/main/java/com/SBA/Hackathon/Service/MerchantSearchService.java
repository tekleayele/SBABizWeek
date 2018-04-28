package com.SBA.Hackathon.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;

@Component
public interface MerchantSearchService {

	public List<MerchantLocatorServiceResponse>  searchMerchantByZipCode(Long zipCode);
	public MerchantLocatorServiceResponse searchMerchantByCategoryCode(Long categoryCode);
	public MerchantLocatorServiceResponse searchMerchantByDistance(float distance);
	public MerchantLocatorServiceResponse searchMerchantByName(String name);
	public MerchantLocatorServiceResponse searchMerchantByCountryCode(Long countryCode);
	
}
