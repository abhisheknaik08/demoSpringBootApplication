package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountLoader {

    private AccountRepository accountRepository;
    
    @Autowired
    public AccountLoader(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PostConstruct
    private void loadData() {
        Account account1 = new Account("Madhu","Savings");
        accountRepository.save(account1);
        
        Account account2 = new Account("Manju","savings");
        accountRepository.save(account2);
        
        Account account3 = new Account("UK","Current");
        accountRepository.save(account3);
        
        Account account4 = new Account("Mallesh","Current");
        accountRepository.save(account4);
        
        Account account5 = new Account("Shreyasa","Savings");
        accountRepository.save(account5);
        
        Account account6 = new Account("Rashmi","Current");
        accountRepository.save(account6);
        
    }

}
