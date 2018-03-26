package org.cuber.base.repo.mapper;

import org.cuber.base.repo.model.CountryDO;

public interface CountryDOMapper {
    int deleteByPrimaryKey(Integer countryId);

    int insert(CountryDO record);

    CountryDO selectByPrimaryKey(Integer countryId);

    int updateByPrimaryKey(CountryDO record);
}