package org.cuber.base.repo.mapper;

import org.cuber.base.repo.model.CatalogItemDO;

import java.util.List;

public interface CatalogItemDOMapper {
    int deleteByPrimaryKey(Integer catalogItemId);

    int insert(CatalogItemDO record);

    CatalogItemDO selectByPrimaryKey(Integer catalogItemId);

    int updateByPrimaryKey(CatalogItemDO record);

    List<CatalogItemDO> selectValidByCatalogId(Integer catalogId);
}