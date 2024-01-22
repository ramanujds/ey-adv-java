package com.easybank.app.service;

import com.easybank.app.exception.AccountNotFoundException;
import com.easybank.app.model.Account;
import com.easybank.app.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{


    @Autowired
    private AccountRepository accountRepo;

    @Override
    public Account getAccountDetails(long accountNo) {
      return  accountRepo.findById(accountNo).get();
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    @Override
    public void deleteAccount(long accountNo) {
        if(!accountRepo.existsById(accountNo)){
            throw new AccountNotFoundException("Account with AccountNo. "+accountNo+" Not Found");
        }
        accountRepo.deleteById(accountNo);
    }

    @Override
    public Account updateAccountDetails(long accountNo, Account account) {
        if(!accountRepo.existsById(accountNo)){
            throw new AccountNotFoundException("Account with AccountNo. "+accountNo+" Not Found");
        }
        return accountRepo.save(account);
    }
}
