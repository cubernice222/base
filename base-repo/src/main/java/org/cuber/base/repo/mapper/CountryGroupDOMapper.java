package org.cuber.base.repo.mapper;

import org.cuber.base.repo.model.CountryGroupDO;

public interface CountryGroupDOMapper {
    int deleteByPrimaryKey(Integer groupItemId);

    int insert(CountryGroupDO record);

    int insertSelective(CountryGroupDO record);

    CountryGroupDO selectByPrimaryKey(Integer groupItemId);

    int updateByPrimaryKeySelective(CountryGroupDO record);

    int updateByPrimaryKey(CountryGroupDO record);
}