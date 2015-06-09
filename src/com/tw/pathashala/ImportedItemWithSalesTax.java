package com.tw.pathashala;

public class ImportedItemWithSalesTax implements  Tax{
    @Override
    public Double taxPercentage() {
        return 15.0;
    }
}
