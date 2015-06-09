package com.tw.pathashala;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImportedItemWithOutTaxTest {
    @Test
    public void shouldCaluculateTaxOfImportedItemWithOutSalesTax() {
        ImportedItemWithOutTax item = new ImportedItemWithOutTax();

        Double actualTax = item.taxValue();

        assertEquals(5.0, actualTax, 0.0d);
    }
}