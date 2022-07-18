package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Account;
import com.example.demo.Repository.AccountRepository;

@Service
public class DbDemoService {
  @Autowired
  private AccountRepository accountRepo;

  /**
   * 全件取得
   * Accountテーブルの全レコードを取得する。
   * 
   */
  public List<Account> getAccountList() {

    List<Account> accountList = accountRepo.findAll();
    return accountList;
  }

  /**
   * ID検索
   * AccountテーブルからIDで検索する 
   * 
   */
  public Account getAccountById(String id) {
    Account account = accountRepo.findById(id).orElse(null);
    return account;
  }

  /**
   * 保存
   * 引数として渡されたAccountを保存する
   */
  public void saveAccount(Account account ) {
    accountRepo.save(account);
  }

}
