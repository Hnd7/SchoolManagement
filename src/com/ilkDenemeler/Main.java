package com.ilkDenemeler;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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

        List<Student> studentlist=new ArrayList<Student>();
        ClassObj classobj = new ClassObj(deneme,c,studentlist);


        Student z = new Student("Zeynep","Bulut", "11931113155" , 1, c,deneme,classobj);
        System.out.println(z.getName());
        System.out.println(z.getSurname());
        System.out.println(z.getPersonalId());
        System.out.println(z.getStudentNumber());
        System.out.println("Sınıf:"+z.getClassNumber());
        System.out.println(z.getClassName());
        System.out.println(z.getClass());

        Guest zeynep = new Guest("Zeynep","Bulut", "72431963156");
        System.out.println(zeynep.getEntranceDate());
        System.out.println(zeynep.getEntranceTime());

        School okul = new School("Deneme Lisesi","İstanbul", deneme1,a);
        System.out.println(okul.schoolType.getSchoolTypeName());
        System.out.println(a.getAffiliatedInstitutionName());

        Days denemegun = Days.Crs;
        LessonNumbers saat = LessonNumbers.İki;

        Lesson l = new Lesson("Hande",c,deneme,denemegun,saat);
        Lesson l2= new Lesson("Zeynep",c,deneme,Days.Cuma,LessonNumbers.Uc);
        //System.out.println(denemegun);
        //System.out.println(saat);
        Schedule schedule= new Schedule();
        schedule.addLesson(l);
        schedule.addLesson(l2);
        System.out.println(schedule.getWeeklySchedule());


    }
}
