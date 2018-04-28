
package com.SBA.Hackathon.Pojo;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "matchIndicators",
    "matchScore",
    "responseValues"
})
@Entity
public class Response {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Response_ID")
	@JsonIgnore
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	private MerchantLocatorServiceResponse merchantLocatorServiceResponse;
	
    @JsonProperty("matchIndicators")
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Response_ID")
    private MatchIndicators matchIndicators = new MatchIndicators();
    @JsonProperty("matchScore")
    private String matchScore;
    
    @JsonProperty("responseValues")
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Response_ID")
    private ResponseValues responseValues = new ResponseValues();
    
    @JsonIgnore
    @ElementCollection
    private Map<String, String> additionalProperties = new HashMap<String, String>();

    @JsonProperty("matchIndicators")
    public MatchIndicators getMatchIndicators() {
        return matchIndicators;
    }

    @JsonProperty("matchIndicators")
    public void setMatchIndicators(MatchIndicators matchIndicators) {
        this.matchIndicators = matchIndicators;
    }

    @JsonProperty("matchScore")
    public String getMatchScore() {
        return matchScore;
    }

    @JsonProperty("matchScore")
    public void setMatchScore(String matchScore) {
        this.matchScore = matchScore;
    }

    @JsonProperty("responseValues")
    public ResponseValues getResponseValues() {
        return responseValues;
    }

    @JsonProperty("responseValues")
    public void setResponseValues(ResponseValues responseValues) {
        this.responseValues = responseValues;
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
