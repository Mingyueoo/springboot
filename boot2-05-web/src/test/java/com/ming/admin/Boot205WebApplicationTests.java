package com.ming.admin;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

@Slf4j
@SpringBootTest
class Boot205WebApplicationTests {



    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads(){
//        Long aLong = jdbcTemplate.queryForObject("select count(*) from mybatis", Long.class);
//        log.info("记录总数：{}",aLong);

        log.info("数据源类型 {}",dataSource.getClass() );

    }



}
