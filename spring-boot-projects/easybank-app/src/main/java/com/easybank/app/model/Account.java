package com.easybank.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @Column(name = "account_no")
    private long accountNo;
    @Column(name = "customer_name", length = 50)
    private String customerName;
    private float balance;
    @Column(name = "account_creation_date")
    private LocalDate accountCreationDate;

}
