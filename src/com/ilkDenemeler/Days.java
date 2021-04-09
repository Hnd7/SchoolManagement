package com.ilkDenemeler;

public enum Days {
    Pzt(0,"Pazartesi"),
    Sali(1,"Salı"),
    Crs(2,"Çarşamba"),
    Prs(3,"Perşembe"),
    Cuma(4,"Cuma");

    private int ID;
    private  String day;

    Days(int ID, String day) {
        this.ID = ID;
        this.day = day;
    }


    public int getID() {
        return this.ID;
    }

    public String getDay() {
        return day;
    }
}
