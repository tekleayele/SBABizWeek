package com.SBA.Hackathon.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SBA.Hackathon.Pojo.MerchantLocatorServiceResponse;

@Repository
public interface MerchantSearchRepository extends JpaRepository<MerchantLocatorServiceResponse, Long> {

}