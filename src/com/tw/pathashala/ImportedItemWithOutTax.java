package com.tw.pathashala;

public class ImportedItemWithOutTax implements Tax{

    @Override
    public Double taxValue() {
        return 5.0;
    }
}
