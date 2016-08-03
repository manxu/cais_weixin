package com.haojiasoftware.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="cs_activity")
public class CsActivity extends IdEntity{

	private static final long serialVersionUID = 1L;

	private String name;

    private Integer beginNumber;

    private Integer endNumber;

    private String prize;

    private String sellerDesc;

    private String actiRule;

    private Integer prizeNum;

    private Date beginTime;

    private Date endTime;

    private Integer openFlag;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBeginNumber() {
        return beginNumber;
    }

    public void setBeginNumber(Integer beginNumber) {
        this.beginNumber = beginNumber;
    }

    public Integer getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(Integer endNumber) {
        this.endNumber = endNumber;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize == null ? null : prize.trim();
    }

    public String getSellerDesc() {
        return sellerDesc;
    }

    public void setSellerDesc(String sellerDesc) {
        this.sellerDesc = sellerDesc == null ? null : sellerDesc.trim();
    }

    public String getActiRule() {
        return actiRule;
    }

    public void setActiRule(String actiRule) {
        this.actiRule = actiRule == null ? null : actiRule.trim();
    }

    public Integer getPrizeNum() {
        return prizeNum;
    }

    public void setPrizeNum(Integer prizeNum) {
        this.prizeNum = prizeNum;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getOpenFlag() {
        return openFlag;
    }

    public void setOpenFlag(Integer openFlag) {
        this.openFlag = openFlag;
    }
}