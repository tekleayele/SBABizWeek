
package com.SBA.Hackathon.Pojo;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "responseMessageId",
    "startIndex",
    "numRecordsMatched",
    "numRecordsReturned",
    "requestMessageId",
    "messageDateTime",
    "endIndex"
})
@Entity
public class Header {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
    @JsonProperty("responseMessageId")
    private String responseMessageId;
    @JsonProperty("startIndex")
    private String startIndex;
    @JsonProperty("numRecordsMatched")
    private Integer numRecordsMatched;
    @JsonProperty("numRecordsReturned")
    private Integer numRecordsReturned;
    @JsonProperty("requestMessageId")
    private String requestMessageId;
    @JsonProperty("messageDateTime")
    private String messageDateTime;
    @JsonProperty("endIndex")
    private String endIndex;
    @JsonIgnore
    @ElementCollection
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("responseMessageId")
    public String getResponseMessageId() {
        return responseMessageId;
    }

    @JsonProperty("responseMessageId")
    public void setResponseMessageId(String responseMessageId) {
        this.responseMessageId = responseMessageId;
    }

    @JsonProperty("startIndex")
    public String getStartIndex() {
        return startIndex;
    }

    @JsonProperty("startIndex")
    public void setStartIndex(String startIndex) {
        this.startIndex = startIndex;
    }

    @JsonProperty("numRecordsMatched")
    public Integer getNumRecordsMatched() {
        return numRecordsMatched;
    }

    @JsonProperty("numRecordsMatched")
    public void setNumRecordsMatched(Integer numRecordsMatched) {
        this.numRecordsMatched = numRecordsMatched;
    }

    @JsonProperty("numRecordsReturned")
    public Integer getNumRecordsReturned() {
        return numRecordsReturned;
    }

    @JsonProperty("numRecordsReturned")
    public void setNumRecordsReturned(Integer numRecordsReturned) {
        this.numRecordsReturned = numRecordsReturned;
    }

    @JsonProperty("requestMessageId")
    public String getRequestMessageId() {
        return requestMessageId;
    }

    @JsonProperty("requestMessageId")
    public void setRequestMessageId(String requestMessageId) {
        this.requestMessageId = requestMessageId;
    }

    @JsonProperty("messageDateTime")
    public String getMessageDateTime() {
        return messageDateTime;
    }

    @JsonProperty("messageDateTime")
    public void setMessageDateTime(String messageDateTime) {
        this.messageDateTime = messageDateTime;
    }

    @JsonProperty("endIndex")
    public String getEndIndex() {
        return endIndex;
    }

    @JsonProperty("endIndex")
    public void setEndIndex(String endIndex) {
        this.endIndex = endIndex;
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
