package com.tw.pathashala;

public class ImportedItemWithTax implements Tax {

    @Override
    public Double taxValue() {
        return 15.0;
    }
}
