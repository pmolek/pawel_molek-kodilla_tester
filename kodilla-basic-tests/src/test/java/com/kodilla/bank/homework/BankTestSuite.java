package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank();
        int values = bank.getValues();
        assertEquals(0, values);
    }

    @Test
    public void shouldAddCM(){
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        bank.addCM(cashMachine1);
        bank.addCM(cashMachine2);
        assertEquals(2, bank.getValues());
    }

    @Test
    public void shouldShowSumInAll(){
        Bank bank1 = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        cashMachine1.add(1000);
        cashMachine1.add(-1000);
        cashMachine1.add(-1000);
        cashMachine1.add(3000);
        bank1.addCM(cashMachine1);

        cashMachine2.add(1000);
        cashMachine2.add(1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        bank1.addCM(cashMachine2);

        cashMachine3.add(1000);
        cashMachine3.add(1000);
        cashMachine3.add(-1000);
        bank1.addCM(cashMachine3);

        assertEquals(31000, bank1.sumInAll());
    }

    @Test
    public void shouldShowSumTransInMinus(){
        Bank bank1 = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        cashMachine1.add(1000);
        cashMachine1.add(-1000);
        cashMachine1.add(-1000);
        cashMachine1.add(3000);
        bank1.addCM(cashMachine1);

        cashMachine2.add(1000);
        cashMachine2.add(1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        bank1.addCM(cashMachine2);

        cashMachine3.add(1000);
        cashMachine3.add(1000);
        cashMachine3.add(-1000);
        bank1.addCM(cashMachine3);

        assertEquals(7, bank1.sumTransInMinus());
    }
    @Test
    public void shouldShowSumTransInPlus(){
        Bank bank1 = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        cashMachine1.add(1000);
        cashMachine1.add(-1000);
        cashMachine1.add(-1000);
        cashMachine1.add(3000);
        bank1.addCM(cashMachine1);

        cashMachine2.add(1000);
        cashMachine2.add(1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        bank1.addCM(cashMachine2);

        cashMachine3.add(1000);
        cashMachine3.add(1000);
        cashMachine3.add(-1000);
        bank1.addCM(cashMachine3);

        assertEquals(6, bank1.sumTransInPlus());
    }
    @Test
    public void shouldShowAvgSumInPlus(){
        Bank bank1 = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        cashMachine1.add(2000);
        cashMachine1.add(-1000);
        cashMachine1.add(-1000);
        cashMachine1.add(3000);
        bank1.addCM(cashMachine1);

        cashMachine2.add(1000);
        cashMachine2.add(1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(1000);
        bank1.addCM(cashMachine2);

        cashMachine3.add(1000);
        cashMachine3.add(4000);
        cashMachine3.add(3000);
        cashMachine3.add(-1000);
        bank1.addCM(cashMachine3);

        assertEquals(2000, bank1.avgSumInPlus());
    }
    @Test
    public void shouldShowAvgSumTransInMinus(){
        Bank bank1 = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        cashMachine1.add(2000);
        cashMachine1.add(-1000);
        cashMachine1.add(-1000);
        cashMachine1.add(3000);
        bank1.addCM(cashMachine1);

        cashMachine2.add(1000);
        cashMachine2.add(1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(-1000);
        cashMachine2.add(1000);
        bank1.addCM(cashMachine2);

        cashMachine3.add(1000);
        cashMachine3.add(4000);
        cashMachine3.add(3000);
        cashMachine3.add(-1000);
        bank1.addCM(cashMachine3);

        assertEquals(1000, bank1.avgSumInMinus());
    }
}
