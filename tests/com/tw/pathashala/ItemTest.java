package com.tw.pathashala;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldCaluculateTaxOfItemBasedOnValue() {
        Item item = new Item(14.99, 10);

        Double actualTax = item.tax();

        assertEquals(1.5, actualTax, 0.0d);
    }

    @Test
    public void ShouldCaluculateTaxNearToPointZeroFivePrecision() {
        Item item = new Item(14.99, 10);

        Double actualTax = item.tax();
        Double expectedTaxValue = 1.499;

        assertFalse(actualTax.equals(expectedTaxValue));
    }
}