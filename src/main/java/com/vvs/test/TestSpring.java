package com.vvs.test;

import com.vvs.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: vvshuai
 * @Description:
 * @Date: Created in 10:36 2020/3/30
 * @Modified By:
 */
public class TestSpring {

    @Test
    public void run1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountService");
        accountService.findAll();
    }
}
