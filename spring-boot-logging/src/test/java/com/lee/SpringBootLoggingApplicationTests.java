package com.lee;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootLoggingApplicationTests {

    @Test
    void contextLoads() {
        //记录器
        Logger logger = LoggerFactory.getLogger(getClass());

        logger.trace("trace 日志");
        logger.debug("debug 日志");
        logger.info("info 日志");
        logger.warn("warn 日志");
        logger.error("error 日志");

    }

}
