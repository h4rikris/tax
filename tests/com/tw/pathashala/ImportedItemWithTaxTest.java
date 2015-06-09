package com.tw.pathashala;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImportedItemWithTaxTest {
    @Test
    public void shouldCaluculateTaxOfImportedItemAlongWithSalesTax() {
        ImportedItemWithTax item = new ImportedItemWithTax();

        Double actualTax = item.taxValue();

        assertEquals(15.0, actualTax, 0.0d);
    }

}