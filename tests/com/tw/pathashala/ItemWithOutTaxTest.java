package com.tw.pathashala;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemWithOutTaxTest {
    @Test
    public void shouldGiveTaxOfNormalItem() {
        ItemWithOutTax item = new ItemWithOutTax();

        Double actualTax = item.taxValue();

        assertEquals(0.0, actualTax, 0.0d);
    }

}