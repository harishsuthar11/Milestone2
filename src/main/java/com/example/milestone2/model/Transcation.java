package com.example.milestone2.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="transcation")
public class Transcation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long txnId;

    private String payerId;
    private String payeeId;
    private String amount;
    private Timestamp timestamp;
    private String status;
}
