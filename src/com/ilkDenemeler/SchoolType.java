package com.ilkDenemeler;

public enum SchoolType {
    Mesleki_ve_Teknik_Anadolu_Lisesi(1,"Mesleki ve Teknik Anadolu Lisesi"),
    Anadolu_Lisesi(2,"Anadolu Lisesi"),
    Aksam_Lisesi(3,"Akşam Lisesi"),
    Sosyal_bilimler_lisesi(4,"Sosyal Bilimler Lisesi"),
    Guzel_Sanatlar_lisesi(5,"Güzel Sanatlar Lisesi"),
    Imam_Hatip_Lisesi(6,"İmam Hatip Lisesi"),
    Fen_Lisesi(7,"Fen Lisesi"),
    Spor_Lisesi(8,"Spor Lisesi"),
    Cok_Programli_Anadolu_Lisesi(9,"Çok Programlı Anadolu Lisesi"),
    Acik_Ogretim_Lisesi(10,"Açık Öğretim Lisesi"),
    Mesleki_Açık_Ogretim_Lisesi(11,"Mesleki Açık Öğretim Lisesi");



    private String schoolTypeName;
    private  int schoolTypeID;

    SchoolType(int id, String name) {
        this.schoolTypeID=id;
        this.schoolTypeName=name;
    }

    public String getSchoolTypeName() {
        return schoolTypeName;
    }
    public int getSchoolTypeID() {
        return schoolTypeID;
    }
}
