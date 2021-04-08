package com.ilkDenemeler;

public enum Days {
    Pzt(1,"Pazartesi"),
    Sali(2,"Salı"),
    Crs(3,"Çarşamba"),
    Prs(4,"Perşembe"),
    Cuma(5,"Cuma");

    private int ID;
    private  String day;
    Days(int ID, String day) {
    }

    public int getID() {
        return ID;
    }

    public String getDay() {
        return day;
    }
}
