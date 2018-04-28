
package com.SBA.Hackathon.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "MerchantLocator_ResponseDatume") 
public class ResponseDatum {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "ResponseDatum_ID")
	private Long id;
	
    @SerializedName("groupName")
    @Expose
    private String groupName;
    @SerializedName("fraudChbktoSalesGrowthYoY")
    @Expose
    private String fraudChbktoSalesGrowthYoY;
    @SerializedName("nonfraudChbktoSalesGrowthYoY")
    @Expose
    private String nonfraudChbktoSalesGrowthYoY;
    @SerializedName("salesVolumeGrowthMoM")
    @Expose
    private String salesVolumeGrowthMoM;
    @SerializedName("salesTranCntGrowthMoM")
    @Expose
    private String salesTranCntGrowthMoM;
    @SerializedName("salesVolumeGrowthYoY")
    @Expose
    private String salesVolumeGrowthYoY;
    @SerializedName("salesTranCntGrowthYoY")
    @Expose
    private String salesTranCntGrowthYoY;
    @SerializedName("fraudChbktoSalesRatio")
    @Expose
    private String fraudChbktoSalesRatio;
    @SerializedName("nonfraudChbktoSalesRatio")
    @Expose
    private String nonfraudChbktoSalesRatio;
    @SerializedName("cardSpendPostalCode1TotalSpendPct")
    @Expose
    private String cardSpendPostalCode1TotalSpendPct;
    @SerializedName("cardSpendPostalCode2TotalSpendPct")
    @Expose
    private String cardSpendPostalCode2TotalSpendPct;
    @SerializedName("cardSpendPostalCode3TotalSpendPct")
    @Expose
    private String cardSpendPostalCode3TotalSpendPct;
    @SerializedName("cardSpendPostalCode4TotalSpendPct")
    @Expose
    private String cardSpendPostalCode4TotalSpendPct;
    @SerializedName("cardSpendPostalCode5TotalSpendPct")
    @Expose
    private String cardSpendPostalCode5TotalSpendPct;
    @SerializedName("outMSATotalSpendPct")
    @Expose
    private String outMSATotalSpendPct;
    @SerializedName("outCountryTotalSpendPct")
    @Expose
    private String outCountryTotalSpendPct;
    @SerializedName("avgCardTranFreq")
    @Expose
    private String avgCardTranFreq;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFraudChbktoSalesGrowthYoY() {
        return fraudChbktoSalesGrowthYoY;
    }

    public void setFraudChbktoSalesGrowthYoY(String fraudChbktoSalesGrowthYoY) {
        this.fraudChbktoSalesGrowthYoY = fraudChbktoSalesGrowthYoY;
    }

    public String getNonfraudChbktoSalesGrowthYoY() {
        return nonfraudChbktoSalesGrowthYoY;
    }

    public void setNonfraudChbktoSalesGrowthYoY(String nonfraudChbktoSalesGrowthYoY) {
        this.nonfraudChbktoSalesGrowthYoY = nonfraudChbktoSalesGrowthYoY;
    }

    public String getSalesVolumeGrowthMoM() {
        return salesVolumeGrowthMoM;
    }

    public void setSalesVolumeGrowthMoM(String salesVolumeGrowthMoM) {
        this.salesVolumeGrowthMoM = salesVolumeGrowthMoM;
    }

    public String getSalesTranCntGrowthMoM() {
        return salesTranCntGrowthMoM;
    }

    public void setSalesTranCntGrowthMoM(String salesTranCntGrowthMoM) {
        this.salesTranCntGrowthMoM = salesTranCntGrowthMoM;
    }

    public String getSalesVolumeGrowthYoY() {
        return salesVolumeGrowthYoY;
    }

    public void setSalesVolumeGrowthYoY(String salesVolumeGrowthYoY) {
        this.salesVolumeGrowthYoY = salesVolumeGrowthYoY;
    }

    public String getSalesTranCntGrowthYoY() {
        return salesTranCntGrowthYoY;
    }

    public void setSalesTranCntGrowthYoY(String salesTranCntGrowthYoY) {
        this.salesTranCntGrowthYoY = salesTranCntGrowthYoY;
    }

    public String getFraudChbktoSalesRatio() {
        return fraudChbktoSalesRatio;
    }

    public void setFraudChbktoSalesRatio(String fraudChbktoSalesRatio) {
        this.fraudChbktoSalesRatio = fraudChbktoSalesRatio;
    }

    public String getNonfraudChbktoSalesRatio() {
        return nonfraudChbktoSalesRatio;
    }

    public void setNonfraudChbktoSalesRatio(String nonfraudChbktoSalesRatio) {
        this.nonfraudChbktoSalesRatio = nonfraudChbktoSalesRatio;
    }

    public String getCardSpendPostalCode1TotalSpendPct() {
        return cardSpendPostalCode1TotalSpendPct;
    }

    public void setCardSpendPostalCode1TotalSpendPct(String cardSpendPostalCode1TotalSpendPct) {
        this.cardSpendPostalCode1TotalSpendPct = cardSpendPostalCode1TotalSpendPct;
    }

    public String getCardSpendPostalCode2TotalSpendPct() {
        return cardSpendPostalCode2TotalSpendPct;
    }

    public void setCardSpendPostalCode2TotalSpendPct(String cardSpendPostalCode2TotalSpendPct) {
        this.cardSpendPostalCode2TotalSpendPct = cardSpendPostalCode2TotalSpendPct;
    }

    public String getCardSpendPostalCode3TotalSpendPct() {
        return cardSpendPostalCode3TotalSpendPct;
    }

    public void setCardSpendPostalCode3TotalSpendPct(String cardSpendPostalCode3TotalSpendPct) {
        this.cardSpendPostalCode3TotalSpendPct = cardSpendPostalCode3TotalSpendPct;
    }

    public String getCardSpendPostalCode4TotalSpendPct() {
        return cardSpendPostalCode4TotalSpendPct;
    }

    public void setCardSpendPostalCode4TotalSpendPct(String cardSpendPostalCode4TotalSpendPct) {
        this.cardSpendPostalCode4TotalSpendPct = cardSpendPostalCode4TotalSpendPct;
    }

    public String getCardSpendPostalCode5TotalSpendPct() {
        return cardSpendPostalCode5TotalSpendPct;
    }

    public void setCardSpendPostalCode5TotalSpendPct(String cardSpendPostalCode5TotalSpendPct) {
        this.cardSpendPostalCode5TotalSpendPct = cardSpendPostalCode5TotalSpendPct;
    }

    public String getOutMSATotalSpendPct() {
        return outMSATotalSpendPct;
    }

    public void setOutMSATotalSpendPct(String outMSATotalSpendPct) {
        this.outMSATotalSpendPct = outMSATotalSpendPct;
    }

    public String getOutCountryTotalSpendPct() {
        return outCountryTotalSpendPct;
    }

    public void setOutCountryTotalSpendPct(String outCountryTotalSpendPct) {
        this.outCountryTotalSpendPct = outCountryTotalSpendPct;
    }

    public String getAvgCardTranFreq() {
        return avgCardTranFreq;
    }

    public void setAvgCardTranFreq(String avgCardTranFreq) {
        this.avgCardTranFreq = avgCardTranFreq;
    }

}
