package com.tw.pathashala;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    Tax taxType;

    @Test
    public void shouldCaluculateTaxOfImportedTaxableItem() {
        taxType = new ImportedItemWithTax();
        Item item = new Item("Perfume", 47.50, taxType);

        Double actualTax = item.tax();

        assertEquals(7.15, actualTax, 0.0d);
    }

    @Test
    public void shouldCaluculateTaxNearToPointZeroFivePrecision() {
        taxType = new ImportedItemWithTax();
        Item item = new Item("CD", 14.99, taxType);

        Double actualTax = item.tax();
        Double expectedTaxValue = 1.499;

        assertFalse(actualTax.equals(expectedTaxValue));
    }

    @Test
    public void shouldReturnStringWithNameAndValue() {
        taxType = new ItemWithTax();
        Item item = new Item("CD", 14.99, taxType);

        String actual = item.toString();

        assertEquals("CD :16.5", actual);
    }

    @Test
    public void testForTaxValueForImportedItemWithTax() {
        taxType = new ImportedItemWithTax();
        Item item = new Item("Bottle", 47.50, taxType);

        Double actualTax = item.tax();
        Double expectedTaxValue = 7.15;

        assertEquals(expectedTaxValue, actualTax);
    }

    @Test
    public void testForTaxValueForImportedItemWithOutTax() {
        taxType = new ImportedItemWithOutTax();
        Item item = new Item("Chocolates", 10.0, taxType);

        Double actualTax = item.tax();
        Double expectedTaxValue = 0.5;

        assertEquals(expectedTaxValue, actualTax);
    }

    @Test
    public void testForTaxValueForItemWithOutTax() {
        taxType = new ItemWithOutTax();
        Item item = new Item("Chocolates", 10.0, taxType);

        Double actualTax = item.tax();
        Double expectedTaxValue = 0.0;

        assertEquals(expectedTaxValue, actualTax);
    }
}