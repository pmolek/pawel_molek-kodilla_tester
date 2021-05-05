package com.kodilla.execution_model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item eggs = new Item("eggs", 8.00);
    Item jam = new Item("jam", 5.00);
    Item butter = new Item("butter", 4.00);
    Item juice = new Item("juice", 3.00);

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(eggs);
        invoice.addItem(jam);
        invoice.addItem(butter);
        invoice.addItem(juice);
    }

    @Test
    public void shouldAddItemToInvoice() { assertEquals(4, invoice.getSize()); }

    @Test
    public void shouldCheckItemNameAndPrice() {assertEquals("Item{name='eggs', price=8.0}", eggs.toString());}


    @Test
    public void shouldCheckIndexBelowZero() {assertEquals(null, invoice.getItem(-1));}

    @Test
    public void shouldCheckIndexOverItemsSize() {assertEquals(null, invoice.getItem(50));}


    @ParameterizedTest
    @ValueSource(ints = {-1, 50})
    public void shouldCheckIndexOutOfBonds(int input) { assertNull(invoice.getItem(input));}


    @Test
    public void shouldClearInvoice() {
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }
}



