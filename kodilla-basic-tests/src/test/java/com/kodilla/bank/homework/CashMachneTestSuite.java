package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachneTestSuite {
    private CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {

        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        cashMachine.add(400);
        cashMachine.add(-200);

        int[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(400, values[0]);
        assertEquals(-200, values[1]);
    }

    @Test
    public void shouldShowSumInCM() {
        cashMachine.add(400);
        cashMachine.add(-200);
        cashMachine.sumInCM();
        assertEquals(10200, cashMachine.sumInCM());
    }

    @Test
    public void shouldShowSumOfTransactionsInCM(){
        cashMachine.add(400);
        cashMachine.add(-200);
        cashMachine.sumNumberOfTransactions();
        assertEquals(2, cashMachine.sumNumberOfTransactions());
    }

    @Test
    public void shouldShowSumOfTransactionsInPlus(){
        cashMachine.add(400);
        cashMachine.add(-200);
        cashMachine.add(400);
        cashMachine.add(-400);
        cashMachine.add(400);
        cashMachine.sumNumberOfTransactionsInPlus();
        assertEquals(3, cashMachine.sumNumberOfTransactionsInPlus());
    }
    @Test
    public void shouldShowSumOfTransactionsInMinus(){
        cashMachine.add(400);
        cashMachine.add(-200);
        cashMachine.add(400);
        cashMachine.add(-400);
        cashMachine.add(400);
        cashMachine.sumNumberOfTransactionsInMinus();
        assertEquals(2, cashMachine.sumNumberOfTransactionsInMinus());
    }

    @Test
    public void checkTransactionDetails(){
        cashMachine.add(5400);
        cashMachine.add(-1200);
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);

    }

    @Test
    public void isAllowedToPayout(){
        cashMachine.add(-1000);
        cashMachine.add(-1000);
        cashMachine.add(-1000);
        cashMachine.add(-1000);
        cashMachine.add(-1000);
        cashMachine.add(-1000);
        cashMachine.add(-1000);
        cashMachine.add(-1000);
        cashMachine.add(-1000);
        cashMachine.add(-1000);

        int[] values = cashMachine.getValues();
        assertEquals(0, cashMachine.sumInCM());
    }

}
