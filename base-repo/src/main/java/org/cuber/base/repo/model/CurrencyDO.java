package org.cuber.base.repo.model;

import java.util.Date;

public class CurrencyDO {
    private Integer currencyId;

    private String alphaCode;

    private String numberCode;

    private Integer minorUnit;

    private String symbolCurrency;

    private String localeMessage;

    private String zhCnName;

    private String status;

    private String operator;

    private Date updateTime;

    private Date createTime;

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getAlphaCode() {
        return alphaCode;
    }

    public void setAlphaCode(String alphaCode) {
        this.alphaCode = alphaCode == null ? null : alphaCode.trim();
    }

    public String getNumberCode() {
        return numberCode;
    }

    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode == null ? null : numberCode.trim();
    }

    public Integer getMinorUnit() {
        return minorUnit;
    }

    public void setMinorUnit(Integer minorUnit) {
        this.minorUnit = minorUnit;
    }

    public String getSymbolCurrency() {
        return symbolCurrency;
    }

    public void setSymbolCurrency(String symbolCurrency) {
        this.symbolCurrency = symbolCurrency == null ? null : symbolCurrency.trim();
    }

    public String getLocaleMessage() {
        return localeMessage;
    }

    public void setLocaleMessage(String localeMessage) {
        this.localeMessage = localeMessage == null ? null : localeMessage.trim();
    }

    public String getZhCnName() {
        return zhCnName;
    }

    public void setZhCnName(String zhCnName) {
        this.zhCnName = zhCnName == null ? null : zhCnName.trim();
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

    @Override
    public String toString() {
        return "CurrencyDO{" +
                "currencyId=" + currencyId +
                ", alphaCode='" + alphaCode + '\'' +
                ", numberCode='" + numberCode + '\'' +
                ", minorUnit=" + minorUnit +
                ", symbolCurrency='" + symbolCurrency + '\'' +
                ", localeMessage='" + localeMessage + '\'' +
                ", zhCnName='" + zhCnName + '\'' +
                ", status='" + status + '\'' +
                ", operator='" + operator + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                '}';
    }
}