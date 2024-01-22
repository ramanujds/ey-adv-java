package com.easybank.app.repository;

import com.easybank.app.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    public List<Account> findByCustomerName(String customerName);

}
