package com.manning.openbanking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.services.TransactionService;

@RestController
@RequestMapping("/api/transactions/")
public class TransactionalController {

    @Autowired
    public TransactionService transactionService;


    @GetMapping("/{accountNumber}")
    public ResponseEntity <List<Transaction>> GetTransactionById(@PathVariable("accountNumber") Integer accountNumber){

        List<Transaction> transaction = transactionService.findAllByAccountNumber(accountNumber);


        return ResponseEntity.ok(transaction);
    }








}
