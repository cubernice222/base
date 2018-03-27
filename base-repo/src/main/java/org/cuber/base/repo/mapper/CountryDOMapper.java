package org.cuber.base.repo.mapper;

import org.apache.ibatis.annotations.Param;
import org.cuber.base.repo.model.CountryDO;

public interface CountryDOMapper {
    int deleteByPrimaryKey(Integer countryId);

    int insert(CountryDO record);

    CountryDO selectByPrimaryKey(Integer countryId);

    int updateByPrimaryKey(CountryDO record);

    CountryDO selectValidByLetter2(@Param("letter2") String letter2);

    CountryDO selectValidByLetter3(@Param("letter3") String letter3);

    CountryDO selectValidByNumeric(@Param("numeric") String numeric);
}