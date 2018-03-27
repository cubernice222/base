package org.cuber.base.repo.mapper;

import org.apache.ibatis.annotations.Param;
import org.cuber.base.repo.model.CatalogDO;

public interface CatalogDOMapper {
    int deleteByPrimaryKey(Integer catalogId);

    int insert(CatalogDO record);

    CatalogDO selectByPrimaryKey(Integer catalogId);

    int updateByPrimaryKey(CatalogDO record);


    CatalogDO selectValidByCatalogName(@Param("catalogName") String catalogName);
}