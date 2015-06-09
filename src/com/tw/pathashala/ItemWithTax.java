package com.tw.pathashala;

public class ItemWithTax implements Tax{

    @Override
    public Double taxValue() {
        return 10.0;
    }
}
