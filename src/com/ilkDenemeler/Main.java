package com.ilkDenemeler;
import java.time.LocalTime;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //SchoolType tip = SchoolType.Mesleki_Açık_Ogretim_Lisesi;
       // School Bal = new School("BAL", "Beşiktaş",tip.toString());
        SchoolType s = SchoolType.Acik_Ogretim_Lisesi;
        SchoolType deneme1 = SchoolType.Sosyal_bilimler_lisesi;
        System.out.println(deneme1.getSchoolTypeID());
        System.out.println(s.getSchoolTypeName());

        AffiliatedInstitution a = AffiliatedInstitution.Devlet;
        System.out.println(a.getAffiliatedInstitutionID());
        System.out.println(a.getAffiliatedInstitutionName());

        ClassNumber c = ClassNumber.On;
        System.out.println(c.getClassNumberID());

        ClassName deneme = ClassName.A;
        System.out.println(deneme.getClassName());


        Guest ziyaretci= new Guest("hande", "sen","12345678910");


    }
}
