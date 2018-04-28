package com.SBA.Hackathon.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;
import com.SBA.Hackathon.Repository.MerchantSearchRepository;

@Service
public class MerchantSearchServiceImpl implements MerchantSearchService {

	@Autowired
    private MerchantSearchRepository merchantSearchRepository;
	
	@Override
	public List<MerchantLocatorServiceResponse> searchMerchantByZipCode(Long zipCode) {
		MerchantLocatorServiceResponse merchantLocatorServiceResponse = new MerchantLocatorServiceResponse();
		merchantLocatorServiceResponse.getRequestData().getPostalCodeList().add(String.valueOf(zipCode));
		return merchantSearchRepository.findByRequestData(merchantLocatorServiceResponse.getRequestData());
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
