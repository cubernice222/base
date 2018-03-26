package org.cuber.base.repo.mapper;

import com.wpay.base.util.enums.Currency;
import org.cuber.base.repo.BaseRepoApplication;
import org.cuber.base.repo.model.CurrencyDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BaseRepoApplication.class)
public class CurrencyDOMapperTest {
    private static final Logger logger = LoggerFactory.getLogger(CurrencyDOMapperTest.class);

    @Resource
    private CurrencyDOMapper currencyDOMapper;


    @Test
    public void testInsert(){
        logger.info("不仅仅是测试,同时是初始化");
        Currency[] currencies  = Currency.values();
        Arrays.stream(currencies).forEach(currency -> {
            CurrencyDO currencyDO = tranCurrencyDO(currency);
            //currencyDOMapper.insert(currencyDO);
            //logger.info("insert get id:{}", currencyDO.getCurrencyId());
        });
        logger.info("don't init again:不用重复初始化");
    }

    public CurrencyDO tranCurrencyDO(Currency currency){
        CurrencyDO currencyDO = new CurrencyDO();
        currencyDO.setAlphaCode(currency.getAlphaCode());
        currencyDO.setLocaleMessage(currency.getLocaleMessage());
        currencyDO.setMinorUnit(currency.getMinorUnit());
        currencyDO.setNumberCode(currency.getNumberCode());
        currencyDO.setOperator("SYSTEM");
        currencyDO.setSymbolCurrency(currency.getSymbolCurrency());
        currencyDO.setZhCnName(currency.getZhCnMessage());
        return currencyDO;
    }
}
