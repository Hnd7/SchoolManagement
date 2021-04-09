package com.ilkDenemeler;

public enum LessonNumbers {
    Bir(0,"Birinci Ders"),
    İki(1,"İkinci ders"),
    Uc(2,"Üçüncü ders"),
    Dort(3,"Dördüncü ders"),
    Bes(4,"Beşinci ders"),
    Alti(5,"Altıncı ders"),
    Yedi(6,"Yedinci ders");


    private int rank;
    private String  ders;

    LessonNumbers(int rank, String ders) {
        this.rank = rank;
        this.ders = ders;
    }


    public int getRank() {
        return rank;
    }

    public String getDers() {
        return ders;
    }
}
