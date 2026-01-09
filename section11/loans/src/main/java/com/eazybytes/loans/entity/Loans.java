package com.eazybytes.loans.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Loans extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Long loanId;
    @Column(name = "mobile_Number")
    private String mobileNumber;
    @Column(name = "loan_Number")
    private String loanNumber;
    @Column(name = "loan_Type")
    private String loanType;
    @Column(name = "total_Loan")
    private int totalLoan;
    @Column(name = "amount_Paid")
    private int amountPaid;
    @Column(name = "outstanding_Amount")
    private int outstandingAmount;
}