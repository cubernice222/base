package org.cuber.base.repo.model;

import java.util.Date;

public class CurrencyGroupDO {
    private Integer currencyGroupId;

    private Integer catalogItemId;

    private Integer currencyId;

    private Integer groupIndex;

    private String status;

    private String operator;

    private Date updateTime;

    private Date createTime;

    public Integer getCurrencyGroupId() {
        return currencyGroupId;
    }

    public void setCurrencyGroupId(Integer currencyGroupId) {
        this.currencyGroupId = currencyGroupId;
    }

    public Integer getCatalogItemId() {
        return catalogItemId;
    }

    public void setCatalogItemId(Integer catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getGroupIndex() {
        return groupIndex;
    }

    public void setGroupIndex(Integer groupIndex) {
        this.groupIndex = groupIndex;
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