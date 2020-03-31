package com.vvs.service;

import com.vvs.domain.Account;

import java.util.List;

/**
 * @Author: vvshuai
 * @Description:
 * @Date: Created in 10:10 2020/3/30
 * @Modified By:
 */
public interface AccountService {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
