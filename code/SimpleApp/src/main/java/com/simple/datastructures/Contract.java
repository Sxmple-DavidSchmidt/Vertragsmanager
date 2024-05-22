package com.simple.datastructures;

import java.time.LocalDate;

public class Contract {
    private final int id;
    private final String title;
    private final CompanyContact contact;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final double estimatedValue;
    private final Contract relatedContract;
    private final ContractState contractState;
    private final String content;

    public Contract(int id, String title, CompanyContact contact, LocalDate startDate, LocalDate endDate, double estimatedValue, Contract relatedContract, ContractState state, String content) {
        this.id = id;
        this.title = title;
        this.contact = contact;
        this.startDate = startDate;
        this.endDate = endDate;
        this.estimatedValue = estimatedValue;
        this.relatedContract = relatedContract;
        this.contractState = state;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public CompanyContact getContact() {
        return contact;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getEstimatedValue() {
        return estimatedValue;
    }

    public Contract getRelatedContract() {
        return relatedContract;
    }

    public ContractState getContractState() {
        return contractState;
    }

    public String getContent() {
        return content;
    }
}
