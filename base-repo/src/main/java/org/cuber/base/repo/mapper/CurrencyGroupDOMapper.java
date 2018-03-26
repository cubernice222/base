package org.cuber.base.repo.mapper;

import org.cuber.base.repo.model.CurrencyGroupDO;

public interface CurrencyGroupDOMapper {
    int deleteByPrimaryKey(Integer currencyGroupId);

    int insert(CurrencyGroupDO record);

    CurrencyGroupDO selectByPrimaryKey(Integer currencyGroupId);

    int updateByPrimaryKey(CurrencyGroupDO record);
}