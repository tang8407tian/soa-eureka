package com.ttac.eureka.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * description:
 *
 * @author bang.tang
 * @date 2019/4/4--14:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoTest {




    @Test
    public void demo1Test(){
        int d = 1<<4;
        log.info("1<<4 = {}", d);
        int f = 2<<4;
        log.info("2<<4 = {}", f);
    }


    @Test
    public void errorTest(){
        try {
            this.yeyeyTest();
        } catch (Exception e) {
            e.printStackTrace();
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                log.error("循环打印stackTraceElement错误信息:{}", stackTraceElement);
            }
            StackTraceElement stackTraceElement = stackTrace[0];
            log.error("错误类型:{}", e.toString());
            log.error("错误Cause:{}", e.getCause());
            log.error("错误信息:{}", e.getMessage());
            log.error("错误LocalizedMessage:{}", e.getLocalizedMessage());
            log.error("错误stackTraceElement:{}", stackTraceElement);
        }

    }

    @Test
    public void yeyeyTest(){
        int d = 1/0;
    }
}
