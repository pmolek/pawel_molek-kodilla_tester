package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private double stampHeigth;
    private double stampWidth;
    private boolean stampStamped;

    public Stamp(String stampName, double stampHeigth, double stampWidth, boolean stampStamped) {
        this.stampName = stampName;
        this.stampHeigth = stampHeigth;
        this.stampWidth = stampWidth;
        this.stampStamped = stampStamped;
    }
    public String getStampName(){
        return stampName;
    }
    public double getStampHeigth(){
        return stampHeigth;
    }
    public double getStampWidth(){
        return stampWidth;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampHeigth=" + stampHeigth +
                ", stampWidth=" + stampWidth +
                ", stampStamped=" + stampStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampHeigth, stampHeigth) == 0 && Double.compare(stamp.stampWidth, stampWidth) == 0 && stampStamped == stamp.stampStamped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampHeigth, stampWidth, stampStamped);
    }
}
