package com.tw.pathashala;

public class Item {
    private final String name;
    private Double value;
    private Tax taxType;

    public Item(String name, Double value, Tax type) {
        this.name = name;
        this.value = value;
        this.taxType = type;
    }

    public Double tax() {
        double taxValue = (taxType.taxValue() * value) / 100;
        return Math.round(taxValue * 20.0) / 20.0;
    }

    @Override
    public String toString() {
        Double totalValue = Math.round((value + tax()) * 20.0) / 20.0;
        return name + " :" + totalValue.toString();
    }
}
