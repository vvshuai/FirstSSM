package com.vvs.test;

import com.vvs.dao.IAccountDao;
import com.vvs.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

/**
 * @Author: vvshuai
 * @Description:
 * @Date: Created in 16:22 2020/3/30
 * @Modified By:
 */
public class TestMybatis {

    @Test
    public void run1() throws IOException {
        Account account = new Account();
        account.setName("王帅");
        account.setMoney(200d);
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        IAccountDao dao = session.getMapper(IAccountDao.class);

        dao.saveAccount(account);
        session.commit();

        session.close();
        in.close();
    }

    @Test
    public void run2() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        IAccountDao dao = session.getMapper(IAccountDao.class);

        List<Account> list = dao.findAll();
        for(Account x:list){
            System.out.println(x);
        }

        session.close();
        in.close();
    }
}
