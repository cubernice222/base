package org.cuber.base.repo.model;

import java.util.Date;

public class CountryDO {
    private Integer countryId;

    private String letter2;

    private String letter3;

    private String numeric;

    private String iso31662;

    private String countryEn;

    private String countryCn;

    private String status;

    private String operator;

    private Date updateTime;

    private Date createTime;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getLetter2() {
        return letter2;
    }

    public void setLetter2(String letter2) {
        this.letter2 = letter2 == null ? null : letter2.trim();
    }

    public String getLetter3() {
        return letter3;
    }

    public void setLetter3(String letter3) {
        this.letter3 = letter3 == null ? null : letter3.trim();
    }

    public String getNumeric() {
        return numeric;
    }

    public void setNumeric(String numeric) {
        this.numeric = numeric == null ? null : numeric.trim();
    }

    public String getIso31662() {
        return iso31662;
    }

    public void setIso31662(String iso31662) {
        this.iso31662 = iso31662 == null ? null : iso31662.trim();
    }

    public String getCountryEn() {
        return countryEn;
    }

    public void setCountryEn(String countryEn) {
        this.countryEn = countryEn == null ? null : countryEn.trim();
    }

    public String getCountryCn() {
        return countryCn;
    }

    public void setCountryCn(String countryCn) {
        this.countryCn = countryCn == null ? null : countryCn.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}