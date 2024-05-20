package com.simple.datastructures;

public class Contract {
    private Company partner;
    private String title;
    private double value;

    public Contract(Company partner, String title, double value) {
        this.partner = partner;
        this.title = title;
        this.value = value;
    }

    public Company getPartner() {
        return partner;
    }

    public String getTitle() {
        return title;
    }

    public double getValue() {
        return value;
    }
}
