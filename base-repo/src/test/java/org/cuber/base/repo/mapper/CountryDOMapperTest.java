package org.cuber.base.repo.mapper;

import com.cuber.base.util.enums.Country;
import org.cuber.base.repo.BaseRepoApplication;
import org.cuber.base.repo.model.CountryDO;
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
public class CountryDOMapperTest {
    private static final Logger logger = LoggerFactory.getLogger(CountryDOMapperTest.class);

    @Resource
    private CountryDOMapper countryDOMapper;

    @Test
    public void testInsert() {
        logger.info("不仅仅是测试,同时是初始化");
        Country[] countries = Country.values();
        Arrays.stream(countries).forEach(country -> {
            CountryDO countryDO = transCountryDO(country);
//            countryDOMapper.insert(countryDO);
//            logger.info("insert get id:{}", countryDO.getCountryId());
        });
        logger.info("don't init again:不用重复初始化");
    }

    public CountryDO transCountryDO(Country country){
        CountryDO countryDO = new CountryDO();
        countryDO.setCountryCn(country.getCountryCN());
        countryDO.setCountryEn(country.getCountryEN());
        countryDO.setIso31662(country.getISO3166_2());
        countryDO.setLetter2(country.getLetter2());
        countryDO.setLetter3(country.getLetter3());
        countryDO.setNumeric(country.getNumeric());
        countryDO.setOperator("SYSTEM");
        return countryDO;
    }
}
