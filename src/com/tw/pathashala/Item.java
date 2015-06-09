package com.tw.pathashala;

public class Item {
    private final double value;
    private Tax taxType;

    public Item(double value, Tax type) {
        this.value = value;
        this.taxType = type;
    }

    public Double tax() {
        double taxValue = (taxType.taxValue() * value) / 100;
        return Math.round(taxValue * 20.0) / 20.0;
    }
}
