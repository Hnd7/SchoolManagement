package com.ilkDenemeler;

public enum LessonNumbers {
    Bir(1,"Birinci Ders"),
    İki(2,"İkinci ders"),
    Uc(3,"Üçüncü ders"),
    Dort(4,"Dördüncü ders"),
    Bes(5,"Beşinci ders"),
    Alti(6,"Altıncı ders"),
    Yedi(7,"Yedinci ders");


    private int rank;
    private String  ders;
    LessonNumbers(int rank,String ders) {
    }


    public int getRank() {
        return rank;
    }

    public String getDers() {
        return ders;
    }
}
