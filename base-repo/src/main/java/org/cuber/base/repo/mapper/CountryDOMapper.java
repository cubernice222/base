package org.cuber.base.repo.mapper;

import org.cuber.base.repo.model.CountryDO;

public interface CountryDOMapper {
    int deleteByPrimaryKey(Integer countryId);

    int insert(CountryDO record);

    int insertSelective(CountryDO record);

    CountryDO selectByPrimaryKey(Integer countryId);

    int updateByPrimaryKeySelective(CountryDO record);

    int updateByPrimaryKey(CountryDO record);
}