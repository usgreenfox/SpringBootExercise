package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
  
}
