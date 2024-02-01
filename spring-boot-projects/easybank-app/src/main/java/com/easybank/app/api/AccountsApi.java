package com.easybank.app.api;

import com.easybank.app.model.Account;

import com.easybank.app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
@CrossOrigin(origins = {"http://localhost:4200"})
public class AccountsApi {

    @Autowired
    private AccountService accountService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @GetMapping("/{accountNo}")
    @ResponseStatus(code = HttpStatus.OK)
    public Account findAccountByAccountNo(@PathVariable("accountNo") long accountNo){
        return accountService.getAccountDetails(accountNo);
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @DeleteMapping("/{accountNo}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteAccount(@PathVariable("accountNo") long accountNo){
        accountService.deleteAccount(accountNo);
    }

    @PutMapping("/{accountNo}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Account updateAccount(@PathVariable("accountNo") long accountNo,
                                 @RequestBody Account account){
        return accountService.updateAccountDetails(accountNo,account);

    }

}
