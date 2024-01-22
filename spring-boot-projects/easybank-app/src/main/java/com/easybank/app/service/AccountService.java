package com.easybank.app.service;

import com.easybank.app.model.Account;

import java.util.List;

public interface AccountService {

    public Account getAccountDetails(long accountNo);

    public Account createAccount(Account account);

    public List<Account> getAllAccounts();

    public void deleteAccount(long accountNo);

    public Account updateAccountDetails(long accountNo, Account account);

}
