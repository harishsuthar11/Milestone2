package com.example.milestone2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid",nullable = false,unique = true)
    private long userId;
    @Column(name="username",nullable = false,unique = true)
    private String username;
    @Column(name="firstname",nullable = false)
    private String firstname;
    @Column(name="lastname",nullable = false)
    private String lastname;
    @Column(name="email",nullable = false,unique = true)
    private String email;
    @Column(name="mobile",nullable = false,unique = true,length = 10)
    private String mobile;
    @Column(name="address",nullable = false)
    private String address;
    @OneToOne
    private Wallet walllet;
}
