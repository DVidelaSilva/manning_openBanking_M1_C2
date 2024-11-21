package com.manning.openbanking.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Transaction {

    private String type;
    private Date date;
    private Integer accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;


}
