package com.ilkDenemeler;

public enum ClassNumber {
    Hazırlık(13),
    Dokuz(9),
    On(10),
    Onbir(11),
    Oniki(12);

    private int classNumberID;

    ClassNumber(int i) {
        this.classNumberID=i;

    }

    public int getClassNumberID() {
        return classNumberID;
    }
}
