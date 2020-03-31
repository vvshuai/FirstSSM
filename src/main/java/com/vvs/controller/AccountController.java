package com.vvs.controller;

import com.vvs.domain.Account;
import com.vvs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: vvshuai
 * @Description:
 * @Date: Created in 15:56 2020/3/30
 * @Modified By:
 */
@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/account/findAll")
    public String findAll(Model model){

        System.out.println("Controller表现层：查询所有账户...");
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";  //在视图解析器中配置了前缀后缀
    }

    @RequestMapping("/account/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

}
