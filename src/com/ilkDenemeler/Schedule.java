package com.ilkDenemeler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Schedule {
    private Object[][] weeklySchedule = new  Object[5][7];


    public Object[][] getWeeklySchedule() {
        //System.out.println(Arrays.deepToString(this.weeklySchedule));
        //System.out.println(Arrays.deepToString(this.weeklySchedule).replace("],", "],\n"));
        Object[] Pazartesi = this.weeklySchedule[0];
        Object[] Sali = this.weeklySchedule[1];
        Object[] Carsamba = this.weeklySchedule[2];
        Object[] Persembe = this.weeklySchedule[3];
        Object[] Cuma = this.weeklySchedule[4];
        System.out.println("Pazartesi: "+Arrays.deepToString(Pazartesi));
        System.out.println("Sali: "+Arrays.deepToString(Sali));
        System.out.println("Carsamba: "+Arrays.deepToString(Carsamba));
        System.out.println("Persembe: "+Arrays.deepToString(Persembe));
        System.out.println("Cuma: "+Arrays.deepToString(Cuma));

        return weeklySchedule;
    }

    public void addLesson(Lesson lesson) {
        int hour = lesson.getLessonNumber();
        int day= lesson.getDay();
        System.out.println("Day:"+day+"\nHour:"+hour);
        this.weeklySchedule[day][hour]=lesson.getLessonInfo();
        //System.out.println("Birinci değer"+lessonHour.getRank());
        //this.weeklySchedule = weeklySchedule;
        //weeklySchedule[][]
    }

    public void addLessonFromDB(Lesson lesson) {
        int hour = lesson.getintLessonNumber();
        int day= lesson.getintDay();
        System.out.println("Day:"+day+"\nHour:"+hour);
        this.weeklySchedule[day][hour]=lesson.getLessonInfoFromDB();
        //System.out.println("Birinci değer"+lessonHour.getRank());
        //this.weeklySchedule = weeklySchedule;
        //weeklySchedule[][]
    }
}



