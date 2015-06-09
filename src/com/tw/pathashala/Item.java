package com.tw.pathashala;

public class Item {
    private final double value;
    private int tax;

    public Item(double value, int tax) {
        this.value = value;
        this.tax = tax;
    }

    public Double tax() {
        double taxValue = (value * tax) / 100;
        return Math.round(taxValue * 20.0) / 20.0;
    }
}
