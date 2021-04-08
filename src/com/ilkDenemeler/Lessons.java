package com.ilkDenemeler;

public enum Lessons {
    Fizik("Fizik",1),
    Beden_Egitimi("Beden Eğitimi",2),
    Kimya("Kimya",3),
    Sağlık_Bilgisi("Sağlık Bilgisi",4),
    Matematik("Matematik",5),
    Biyoloji("Biyoloji",6),
    Gorsel_Sanatlar("Görsel Sanatlar",7),
    Muzik("Müzik",8),
    İngilizce("İngilizce",9),
    Tarih("Tarih",10),
    Din_Kulturu_ve_Ahlak_Bilgisi("Din Kültürü ve Ahlak Bilgisi",11),
    İkinci_Yabanci_Dil("İkinci Yabanci Dil",12),
    Cografya("Coğrafya",13),
    Turk_Dili_ve_Edebiyati("Türk Dili ve Edebiyatı",14);
    private String lessonsName;
    private int lessonsCode;

     Lessons(String lessonsName, int lessonsCode) {
        this.lessonsName = lessonsName;
        this.lessonsCode = lessonsCode;
    }
    public String getLessonsName() {
        return lessonsName;
    }
    public void setLessonsName(String lessonsName) {
        this.lessonsName = lessonsName;
    }
    public int getLessonsCode() {
        return lessonsCode;
    }
    public void setLessonsCode(int lessonsCode) {
        this.lessonsCode = lessonsCode;
    }
}