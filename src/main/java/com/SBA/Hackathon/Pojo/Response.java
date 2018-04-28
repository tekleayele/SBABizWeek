
package com.SBA.Hackathon.Pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "matchIndicators",
    "matchScore",
    "responseValues"
})
public class Response {

    @JsonProperty("matchIndicators")
    private MatchIndicators matchIndicators;
    @JsonProperty("matchScore")
    private String matchScore;
    @JsonProperty("responseValues")
    private ResponseValues responseValues;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
