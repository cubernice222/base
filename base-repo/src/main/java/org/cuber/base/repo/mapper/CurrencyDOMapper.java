package org.cuber.base.repo.mapper;

import org.cuber.base.repo.model.CurrencyDO;

public interface CurrencyDOMapper {
    int deleteByPrimaryKey(Integer currencyId);

    int insert(CurrencyDO record);

    CurrencyDO selectByPrimaryKey(Integer currencyId);

    int updateByPrimaryKey(CurrencyDO record);
}