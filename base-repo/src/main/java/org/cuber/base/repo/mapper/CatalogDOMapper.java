package org.cuber.base.repo.mapper;

import org.cuber.base.repo.model.CatalogDO;

public interface CatalogDOMapper {
    int deleteByPrimaryKey(Integer catalogId);

    int insert(CatalogDO record);

    int insertSelective(CatalogDO record);

    CatalogDO selectByPrimaryKey(Integer catalogId);

    int updateByPrimaryKeySelective(CatalogDO record);

    int updateByPrimaryKey(CatalogDO record);
}