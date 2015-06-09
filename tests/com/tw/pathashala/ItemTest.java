package com.tw.pathashala;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    Tax taxType;

    @Test
    public void shouldCaluculateTaxOfImportedTaxableItem() {
        taxType = new ImportedItemWithTax();
        Item item = new Item(47.50, taxType);

        Double actualTax = item.tax();

        assertEquals(7.15, actualTax, 0.0d);
    }

    @Test
    public void ShouldCaluculateTaxNearToPointZeroFivePrecision() {
        taxType = new ImportedItemWithTax();
        Item item = new Item(14.99, taxType);

        Double actualTax = item.tax();
        Double expectedTaxValue = 1.499;

        assertFalse(actualTax.equals(expectedTaxValue));
    }
}