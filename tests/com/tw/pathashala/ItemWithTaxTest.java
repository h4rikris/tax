package com.tw.pathashala;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemWithTaxTest {
    @Test
    public void shouldGiveTaxOfNormalItem() {
        ItemWithTax item = new ItemWithTax();

        Double actualTax = item.taxValue();

        assertEquals(10.0, actualTax, 0.0d);
    }
}