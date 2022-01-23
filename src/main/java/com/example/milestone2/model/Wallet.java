package com.example.milestone2.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="wallet")
public class Wallet {
    @Id
    private String walletId;
    @Column(name="balance")
    private float balance;
}
