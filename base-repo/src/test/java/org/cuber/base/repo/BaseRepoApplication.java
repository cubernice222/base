package org.cuber.base.repo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.cuber.base.repo.mapper")
public class BaseRepoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseRepoApplication.class,args);
    }
}
