package com.SBA.Hackathon.Service;

import org.springframework.stereotype.Service;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;

@Service
public class MerchantSearchServiceImpl implements MerchantSearchService {

	@Override
	public MerchantLocatorServiceResponse searchMerchantByZipCode(Long zipCode) {
		MerchantLocatorServiceResponse temp = new MerchantLocatorServiceResponse();
		return temp;
	}

	@Override
	public MerchantLocatorServiceResponse searchMerchantByCategoryCode(Long categoryCode) {
		MerchantLocatorServiceResponse temp = new MerchantLocatorServiceResponse();
		return temp;
	}

	@Override
	public MerchantLocatorServiceResponse searchMerchantByDistance(float distance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MerchantLocatorServiceResponse searchMerchantByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MerchantLocatorServiceResponse searchMerchantByCountryCode(Long countryCode) {
		// TODO Auto-generated method stub
		return null;
	}
}
