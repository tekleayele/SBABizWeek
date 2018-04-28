
package com.SBA.Hackathon.Pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "MerchantLocator_RequestData") 
public class RequestData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;

    @SerializedName("cardPresentIndicator")
    @Expose
    private String cardPresentIndicator;
    @SerializedName("merchantCountry")
    @Expose
    private String merchantCountry;
    @SerializedName("groupList")
    @Expose
    @ElementCollection
    private List<String> groupList = null;
    @SerializedName("merchantCategoryCodes")
    @Expose
    @ElementCollection
    private List<String> merchantCategoryCodes = null;
    @SerializedName("merchantCategoryGroupsCodes")
    @Expose
    @ElementCollection
    private List<String> merchantCategoryGroupsCodes = null;
    @SerializedName("monthList")
    @Expose
    @ElementCollection
    private List<String> monthList = null;
    @SerializedName("msaList")
    @Expose
    @ElementCollection
    private List<String> msaList = null;
    @SerializedName("postalCodeList")
    @Expose
    @ElementCollection
    private List<String> postalCodeList = new ArrayList<String>();

    public String getCardPresentIndicator() {
        return cardPresentIndicator;
    }

    public void setCardPresentIndicator(String cardPresentIndicator) {
        this.cardPresentIndicator = cardPresentIndicator;
    }

    public String getMerchantCountry() {
        return merchantCountry;
    }

    public void setMerchantCountry(String merchantCountry) {
        this.merchantCountry = merchantCountry;
    }

    public List<String> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<String> groupList) {
        this.groupList = groupList;
    }

    public List<String> getMerchantCategoryCodes() {
        return merchantCategoryCodes;
    }

    public void setMerchantCategoryCodes(List<String> merchantCategoryCodes) {
        this.merchantCategoryCodes = merchantCategoryCodes;
    }

    public List<String> getMerchantCategoryGroupsCodes() {
        return merchantCategoryGroupsCodes;
    }

    public void setMerchantCategoryGroupsCodes(List<String> merchantCategoryGroupsCodes) {
        this.merchantCategoryGroupsCodes = merchantCategoryGroupsCodes;
    }

    public List<String> getMonthList() {
        return monthList;
    }

    public void setMonthList(List<String> monthList) {
        this.monthList = monthList;
    }

    public List<String> getMsaList() {
        return msaList;
    }

    public void setMsaList(List<String> msaList) {
        this.msaList = msaList;
    }

    public List<String> getPostalCodeList() {
        return postalCodeList;
    }

    public void setPostalCodeList(List<String> postalCodeList) {
        this.postalCodeList = postalCodeList;
    }

}
