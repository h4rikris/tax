package com.tw.pathashala;

public class ItemWithOutTax implements Tax{

    @Override
    public Double taxValue() {
        return 0.0;
    }
}
