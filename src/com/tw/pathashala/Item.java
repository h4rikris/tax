package com.tw.pathashala;

public class Item {
    private final double value;
    private int tax;
    private Tax taxType;

    public Item(double value, int tax, Tax type) {
        this.value = value;
        this.tax = tax;
        this.taxType = type;
    }

    public Double tax() {
        double taxValue = (value * tax) / 100;
        return Math.round(taxValue * 20.0) / 20.0;
    }
}
