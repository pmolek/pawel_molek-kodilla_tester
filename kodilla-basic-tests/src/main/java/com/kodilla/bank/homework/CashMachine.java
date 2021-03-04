package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0];
    }


    public void add(int value) {

        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;

    }
    //jak zrobic metode sprawdzajaca czy wartosc wyplaty
    //nie przewyzsza dostepnych w bankomacie srodkow
    //i kolejna dająca wartosci brzegowe pojedynczej operacji czyli wyplata
    //nie wieksza niz 1000 a wplata nie wieksza niz 5000

    public int[] getValues() {
        return values;
    }

    public int sumInCM() {
        int sum = 10000;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    public int sumInPlus() {
        int sumPlus = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                sumPlus = sumPlus + values[i];
            }
        }
        return sumPlus;
    }

    public int sumInMinus() {
        int sumMinus = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                sumMinus = sumMinus + values[i];
            }
        }
        return sumMinus;
    }

    public int sumNumberOfTransactions() {
        return values.length;
    }

    public int sumNumberOfTransactionsInPlus() {
        int sum1 = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                sum1++;
            }
        }
        return sum1;
    }

    public int sumNumberOfTransactionsInMinus() {
        int sum2 = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                sum2++;
            }
        }
        return sum2;
    }

}
