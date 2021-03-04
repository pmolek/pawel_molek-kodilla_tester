package com.kodilla.bank.homework;


public class Bank {
    private int[] values;
    private int size;


    private CashMachine[] cashMachines = new CashMachine[0];

    public void addCM(CashMachine cashMachine) {

        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;

    }

    public int sumInAll() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].sumInCM();
        }
        return sum;
    }

    public int sumTransInMinus() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].sumNumberOfTransactionsInMinus();
        }
        return sum;
    }

    public int sumTransInPlus() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].sumNumberOfTransactionsInPlus();
        }
        return sum;
    }

    public int avgSumInMinus() {
        int avg = 0;
        for (int i = 0; i < cashMachines.length; i++){
            avg = cashMachines[i].sumInMinus()/ cashMachines.length;
        }
        return avg;
    }
    public int avgSumInPlus() {
        int avg = 0;
        for (int i = 0; i < cashMachines.length; i++){
            avg = cashMachines[i].sumInPlus()/ cashMachines.length;
        }
        return avg;
    }
}
