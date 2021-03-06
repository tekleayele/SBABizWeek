
package com.SBA.Hackathon.Pojo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "MerchantLocator_Response") 
@EntityListeners(AuditingEntityListener.class)
@JsonPropertyOrder({
    "response",
    "header",
    "status"
})
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class MerchantLocatorServiceResponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
    @SerializedName("responseHeader")
    @Expose
    @OneToOne(cascade = CascadeType.ALL)
    private ResponseHeader responseHeader = new ResponseHeader();
    @SerializedName("responseStatus")
    @Expose
    @OneToOne(cascade = CascadeType.ALL)
    private ResponseStatus responseStatus = new ResponseStatus();
    
    @SerializedName("requestData")
    @Expose
    @OneToOne(cascade = CascadeType.ALL)
    private RequestData requestData = new RequestData();
    
    @SerializedName("response")
    @Expose
    @OneToOne(cascade = CascadeType.ALL)
    private Response response;

    @Column(nullable = true, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	@JsonIgnore
	private Date createdAt;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	@JsonIgnore
	private Date updatedAt;
	
    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public RequestData getRequestData() {
        return requestData;
    }

    public void setRequestData(RequestData requestData) {
        this.requestData = requestData;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
    
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
