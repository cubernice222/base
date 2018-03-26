package org.cuber.base.repo.model;

import java.util.Date;

public class CatalogDO {
    private Integer catalogId;

    private String catalogName;

    private String catalogAlias;

    private String catalogDesc;

    private String status;

    private String operator;

    private Date updateTime;

    private Date createTime;

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName == null ? null : catalogName.trim();
    }

    public String getCatalogAlias() {
        return catalogAlias;
    }

    public void setCatalogAlias(String catalogAlias) {
        this.catalogAlias = catalogAlias == null ? null : catalogAlias.trim();
    }

    public String getCatalogDesc() {
        return catalogDesc;
    }

    public void setCatalogDesc(String catalogDesc) {
        this.catalogDesc = catalogDesc == null ? null : catalogDesc.trim();
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