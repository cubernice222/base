package org.cuber.base.repo.mapper;

import org.cuber.base.repo.BaseRepoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BaseRepoApplication.class)
public class RepoUtilsMapperTest {
    @Resource
    private RepoUtilsMapper repoUtilsMapper;

    private static final Logger logger = LoggerFactory.getLogger(RepoUtilsMapperTest.class);

    @Test
    public void testTruncateTable(){
        //repoUtilsMapper.truncateTable("t_base_catalog_item");
        logger.info("停止调试,这个方法已经被确认可用,不要启动truncate table 功能");

    }
}
