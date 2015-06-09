package com.tw.pathashala;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImportedItemWithSalesTaxTest {

    @Test
    public void shouldGiveTaxValueOfImportedTaxItem(){
        ImportedItemWithSalesTax item = new ImportedItemWithSalesTax();

        Double actualTax = item.taxPercentage();

        assertEquals(15.0, actualTax, 0.0d);
    }

}