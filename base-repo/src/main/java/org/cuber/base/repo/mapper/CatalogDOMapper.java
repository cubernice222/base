package org.cuber.base.repo.mapper;

import org.cuber.base.repo.model.CatalogDO;

public interface CatalogDOMapper {
    int deleteByPrimaryKey(Integer catalogId);

    int insert(CatalogDO record);


    CatalogDO selectByPrimaryKey(Integer catalogId);

    int updateByPrimaryKey(CatalogDO record);
}