
package com.SBA.Hackathon.Pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "merchantCountryCode",
    "merchantStreetAddress",
    "merchantPostalCode",
    "merchantState",
    "merchantCity",
    "paymentAcceptanceMethod",
    "terminalType",
    "firstTranDateRange",
    "lastTranDateRange",
    "merchantCategoryCode",
    "distance",
    "visaMerchantName",
    "visaStoreName",
    "locationAddressLatitude",
    "locationAddressLongitude",
    "visaStoreId",
    "visaMerchantId",
    "merchantUrl",
    "merchantCategoryCodeDesc",
    "visaEnterpriseName",
    "primaryMerchantCategoryCode"
})
@Entity
public class ResponseValues {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
    @JsonProperty("merchantCountryCode")
    private String merchantCountryCode;
    @JsonProperty("merchantStreetAddress")
    private String merchantStreetAddress;
    @JsonProperty("merchantPostalCode")
    private String merchantPostalCode;
    @JsonProperty("merchantState")
    private String merchantState;
    @JsonProperty("merchantCity")
    private String merchantCity;
    @JsonProperty("paymentAcceptanceMethod")
    @ElementCollection
    private List<String> paymentAcceptanceMethod = new ArrayList<String>();
    @JsonProperty("terminalType")
    @ElementCollection
    private List<String> terminalType = new ArrayList<String>();
    @JsonProperty("firstTranDateRange")
    private String firstTranDateRange;
    @JsonProperty("lastTranDateRange")
    private String lastTranDateRange;
    @JsonProperty("merchantCategoryCode")
    @ElementCollection
    private List<String> merchantCategoryCode = new ArrayList<String>();;
    @JsonProperty("distance")
    private String distance;
    @JsonProperty("visaMerchantName")
    private String visaMerchantName;
    @JsonProperty("visaStoreName")
    private String visaStoreName;
    @JsonProperty("locationAddressLatitude")
    private String locationAddressLatitude;
    @JsonProperty("locationAddressLongitude")
    private String locationAddressLongitude;
    @JsonProperty("visaStoreId")
    private String visaStoreId;
    @JsonProperty("visaMerchantId")
    private String visaMerchantId;
    @JsonProperty("merchantUrl")
    @ElementCollection
    private List<String> merchantUrl = new ArrayList<String>();
    @JsonProperty("merchantCategoryCodeDesc")
    @ElementCollection
    private List<String> merchantCategoryCodeDesc = new ArrayList<String>();;
    @JsonProperty("visaEnterpriseName")
    private String visaEnterpriseName;
    @JsonProperty("primaryMerchantCategoryCode")
    private String primaryMerchantCategoryCode;
    @JsonIgnore
    @ElementCollection
    private Map<String, String> additionalProperties = new HashMap<String, String>();

    @JsonProperty("merchantCountryCode")
    public String getMerchantCountryCode() {
        return merchantCountryCode;
    }

    @JsonProperty("merchantCountryCode")
    public void setMerchantCountryCode(String merchantCountryCode) {
        this.merchantCountryCode = merchantCountryCode;
    }

    @JsonProperty("merchantStreetAddress")
    public String getMerchantStreetAddress() {
        return merchantStreetAddress;
    }

    @JsonProperty("merchantStreetAddress")
    public void setMerchantStreetAddress(String merchantStreetAddress) {
        this.merchantStreetAddress = merchantStreetAddress;
    }

    @JsonProperty("merchantPostalCode")
    public String getMerchantPostalCode() {
        return merchantPostalCode;
    }

    @JsonProperty("merchantPostalCode")
    public void setMerchantPostalCode(String merchantPostalCode) {
        this.merchantPostalCode = merchantPostalCode;
    }

    @JsonProperty("merchantState")
    public String getMerchantState() {
        return merchantState;
    }

    @JsonProperty("merchantState")
    public void setMerchantState(String merchantState) {
        this.merchantState = merchantState;
    }

    @JsonProperty("merchantCity")
    public String getMerchantCity() {
        return merchantCity;
    }

    @JsonProperty("merchantCity")
    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    @JsonProperty("paymentAcceptanceMethod")
    public List<String> getPaymentAcceptanceMethod() {
        return paymentAcceptanceMethod;
    }

    @JsonProperty("paymentAcceptanceMethod")
    public void setPaymentAcceptanceMethod(List<String> paymentAcceptanceMethod) {
        this.paymentAcceptanceMethod = paymentAcceptanceMethod;
    }

    @JsonProperty("terminalType")
    public List<String> getTerminalType() {
        return terminalType;
    }

    @JsonProperty("terminalType")
    public void setTerminalType(List<String> terminalType) {
        this.terminalType = terminalType;
    }

    @JsonProperty("firstTranDateRange")
    public String getFirstTranDateRange() {
        return firstTranDateRange;
    }

    @JsonProperty("firstTranDateRange")
    public void setFirstTranDateRange(String firstTranDateRange) {
        this.firstTranDateRange = firstTranDateRange;
    }

    @JsonProperty("lastTranDateRange")
    public String getLastTranDateRange() {
        return lastTranDateRange;
    }

    @JsonProperty("lastTranDateRange")
    public void setLastTranDateRange(String lastTranDateRange) {
        this.lastTranDateRange = lastTranDateRange;
    }

    @JsonProperty("merchantCategoryCode")
    public List<String> getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    @JsonProperty("merchantCategoryCode")
    public void setMerchantCategoryCode(List<String> merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    @JsonProperty("distance")
    public String getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(String distance) {
        this.distance = distance;
    }

    @JsonProperty("visaMerchantName")
    public String getVisaMerchantName() {
        return visaMerchantName;
    }

    @JsonProperty("visaMerchantName")
    public void setVisaMerchantName(String visaMerchantName) {
        this.visaMerchantName = visaMerchantName;
    }

    @JsonProperty("visaStoreName")
    public String getVisaStoreName() {
        return visaStoreName;
    }

    @JsonProperty("visaStoreName")
    public void setVisaStoreName(String visaStoreName) {
        this.visaStoreName = visaStoreName;
    }

    @JsonProperty("locationAddressLatitude")
    public String getLocationAddressLatitude() {
        return locationAddressLatitude;
    }

    @JsonProperty("locationAddressLatitude")
    public void setLocationAddressLatitude(String locationAddressLatitude) {
        this.locationAddressLatitude = locationAddressLatitude;
    }

    @JsonProperty("locationAddressLongitude")
    public String getLocationAddressLongitude() {
        return locationAddressLongitude;
    }

    @JsonProperty("locationAddressLongitude")
    public void setLocationAddressLongitude(String locationAddressLongitude) {
        this.locationAddressLongitude = locationAddressLongitude;
    }

    @JsonProperty("visaStoreId")
    public String getVisaStoreId() {
        return visaStoreId;
    }

    @JsonProperty("visaStoreId")
    public void setVisaStoreId(String visaStoreId) {
        this.visaStoreId = visaStoreId;
    }

    @JsonProperty("visaMerchantId")
    public String getVisaMerchantId() {
        return visaMerchantId;
    }

    @JsonProperty("visaMerchantId")
    public void setVisaMerchantId(String visaMerchantId) {
        this.visaMerchantId = visaMerchantId;
    }

    @JsonProperty("merchantUrl")
    public List<String> getMerchantUrl() {
        return merchantUrl;
    }

    @JsonProperty("merchantUrl")
    public void setMerchantUrl(List<String> merchantUrl) {
        this.merchantUrl = merchantUrl;
    }

    @JsonProperty("merchantCategoryCodeDesc")
    public List<String> getMerchantCategoryCodeDesc() {
        return merchantCategoryCodeDesc;
    }

    @JsonProperty("merchantCategoryCodeDesc")
    public void setMerchantCategoryCodeDesc(List<String> merchantCategoryCodeDesc) {
        this.merchantCategoryCodeDesc = merchantCategoryCodeDesc;
    }

    @JsonProperty("visaEnterpriseName")
    public String getVisaEnterpriseName() {
        return visaEnterpriseName;
    }

    @JsonProperty("visaEnterpriseName")
    public void setVisaEnterpriseName(String visaEnterpriseName) {
        this.visaEnterpriseName = visaEnterpriseName;
    }

    @JsonProperty("primaryMerchantCategoryCode")
    public String getPrimaryMerchantCategoryCode() {
        return primaryMerchantCategoryCode;
    }

    @JsonProperty("primaryMerchantCategoryCode")
    public void setPrimaryMerchantCategoryCode(String primaryMerchantCategoryCode) {
        this.primaryMerchantCategoryCode = primaryMerchantCategoryCode;
    }

    @JsonAnyGetter
    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
    }

}
