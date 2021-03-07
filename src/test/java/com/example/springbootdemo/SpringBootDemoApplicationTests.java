package com.example.springbootdemo;

import com.example.springbootdemo.pojo.Dog;
import com.example.springbootdemo.pojo.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootTest
class SpringBootDemoApplicationTests {
    @Autowired
    Person person;
    @Autowired
    Dog dog;

    @Autowired
    ApplicationContext ioc;

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void logTest(){
        //日志级别，由低到高：trace<debug<info<warn<error
        //可以调整输出的日志级别；日志就只会在这个级别以后的高级别生效
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //SpringBoot默认的是info级别，root级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }
    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println("b = " + b);
    }

    @Test
    void contextLoads() {
        System.out.println(dog);
        System.out.println(person);
    }

}
