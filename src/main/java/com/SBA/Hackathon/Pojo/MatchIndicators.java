
package com.SBA.Hackathon.Pojo;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "merchantCountryCode",
    "merchantName"
})
@Entity
@Table(name = "MatchIndicators") 
public class MatchIndicators {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
    @JsonProperty("merchantCountryCode")
    private String merchantCountryCode;
    @JsonProperty("merchantName")
    private String merchantName;
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

    @JsonProperty("merchantName")
    public String getMerchantName() {
        return merchantName;
    }

    @JsonProperty("merchantName")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
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
