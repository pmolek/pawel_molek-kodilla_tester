package com.kodilla.bank.homework;

public class Bank {

    public static void main(String[] args) {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(6000);
        cashMachine1.add(-200);
        cashMachine1.add(-1000);
        cashMachine1.add(2000);
        cashMachine1.add(3000);
        cashMachine1.sumInCM();
        System.out.println("Saldo bankomatu to: " + cashMachine1.sumInCM());

        cashMachine1.sumNumberOfTransactionsInPlus();
        System.out.println("Ilość wpłat: " + cashMachine1.sumNumberOfTransactionsInPlus());

        cashMachine1.sumNumberOfTransactionsInMinus();
        System.out.println("Ilość wypłat: " + cashMachine1.sumNumberOfTransactionsInMinus());

        int avgPlus =  cashMachine1.sumInPlus()/ cashMachine1.sumNumberOfTransactionsInPlus();
        System.out.println("Srednia wartosc wplaty to: " + avgPlus);

        int avgMinus = Math.abs(cashMachine1.sumInMinus()/cashMachine1.sumNumberOfTransactionsInMinus());
        System.out.println("Srednia wartosc wplaty to: " + avgMinus);


    }
}
