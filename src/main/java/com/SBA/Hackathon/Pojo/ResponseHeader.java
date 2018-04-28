
package com.SBA.Hackathon.Pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "MerchantLocator_ResponseHeader") 
public class ResponseHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
    @SerializedName("requestMessageId")
    @Expose
    private String requestMessageId;
    @SerializedName("messageDateTime")
    @Expose
    private String messageDateTime;
    @SerializedName("responseMessageId")
    @Expose
    private String responseMessageId;
    @SerializedName("numRecordsReturned")
    @Expose
    private int numRecordsReturned;

    public String getRequestMessageId() {
        return requestMessageId;
    }

    public void setRequestMessageId(String requestMessageId) {
        this.requestMessageId = requestMessageId;
    }

    public String getMessageDateTime() {
        return messageDateTime;
    }

    public void setMessageDateTime(String messageDateTime) {
        this.messageDateTime = messageDateTime;
    }

    public String getResponseMessageId() {
        return responseMessageId;
    }

    public void setResponseMessageId(String responseMessageId) {
        this.responseMessageId = responseMessageId;
    }

    public int getNumRecordsReturned() {
        return numRecordsReturned;
    }

    public void setNumRecordsReturned(int numRecordsReturned) {
        this.numRecordsReturned = numRecordsReturned;
    }
}
