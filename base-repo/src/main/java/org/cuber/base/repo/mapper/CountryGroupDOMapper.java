package org.cuber.base.repo.mapper;

import org.cuber.base.repo.model.CountryGroupDO;

import java.util.List;

public interface CountryGroupDOMapper {
    int deleteByPrimaryKey(Integer groupItemId);

    int insert(CountryGroupDO record);

    CountryGroupDO selectByPrimaryKey(Integer groupItemId);

    int updateByPrimaryKey(CountryGroupDO record);

    List<CountryGroupDO> selectValidByCatalogItemId(Integer catalogItemId);
}