package com.example.milestone2.service;

import com.example.milestone2.model.Wallet;
import com.example.milestone2.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class WalletService {

    @Autowired
    private WalletRepository walletRepository;


    public ResponseEntity<?> createWallet(Wallet wallet){

        walletRepository.save(wallet);
        return new ResponseEntity<>("Successfully Created" , HttpStatus.CREATED);

    }

    public Optional<Wallet> getWalletById(String walletId){
        return walletRepository.findById(walletId);
    }
}
