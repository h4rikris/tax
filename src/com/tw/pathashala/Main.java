package com.tw.pathashala;

public class Main {
    public static void main(String args[]) {
        Item item1 = new Item("Chocolates", 10.00, new ItemWithOutTax());
        Item item2 = new Item("Perfume", 47.50, new ItemWithTax());

        System.out.print(item1);
        System.out.print(item2);
    }
}
