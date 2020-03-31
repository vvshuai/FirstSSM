package com.vvs.dao;

import com.vvs.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: vvshuai
 * @Description:
 * @Date: Created in 9:49 2020/3/30
 * @Modified By:
 */
@Repository
public interface IAccountDao {
    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account (name,money) value(#{name},#{money})")
    public void saveAccount(Account account);
}
