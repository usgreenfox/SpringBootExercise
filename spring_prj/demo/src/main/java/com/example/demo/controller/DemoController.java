package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entity.Account;
import com.example.demo.service.DbDemoService;
import com.example.demo.service.DemoService;

@Controller
public class DemoController {

  @Autowired
  DemoService demoServ;
  @Autowired
  DbDemoService dbDemoServ;

  @RequestMapping("/")
  public String home() {
    List<Account> accountList = dbDemoServ.getAccountList();

    accountList.forEach(account -> {
      System.out.println(account.getAccount_id());
      System.out.println(account.getEmail());
      System.out.println(account.getPassword());
      System.out.println(account.getUserName());
      System.out.println("-----------------");
    });
    return "home";
  }
}
