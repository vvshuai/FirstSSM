package com.vvs.service.Impl;

import com.vvs.dao.IAccountDao;
import com.vvs.domain.Account;
import com.vvs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: vvshuai
 * @Description:
 * @Date: Created in 10:17 2020/3/30
 * @Modified By:
 */
@Service("accountService")
public class AcountServiceImpl implements AccountService {

    @Autowired
    private IAccountDao iAccountDao;
    @Override
    public List<Account> findAll(){
        System.out.println("Service业务层:find");
        return iAccountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Service业务层：save");
        iAccountDao.saveAccount(account);
    }
}
