package com.SBA.Hackathon.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;
import com.SBA.Hackathon.Pojo.RequestData;

@Repository
public interface MerchantSearchRepository extends JpaRepository<MerchantLocatorServiceResponse, Long> {

	public List<MerchantLocatorServiceResponse> findByRequestData(RequestData merchantSearchRepository);
	
}