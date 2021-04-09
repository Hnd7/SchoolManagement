package com.ilkDenemeler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Schedule {
    private Object[][] weeklySchedule = new  Object[7][5];


    public Object[][] getWeeklySchedule() {
        System.out.println(Arrays.deepToString(this.weeklySchedule));
        /*
        for (int i = 0; i < this.weeklySchedule.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ this.weeklySchedule[i]);*/
        //System.out.println(weeklySchedule.);
        return weeklySchedule;
    }

    public void addLesson(Lesson lesson) {
        int hour = lesson.getLessonNumber();
        int day= lesson.getDay();
        System.out.println("Day:"+day+"\nHour:"+hour);
        this.weeklySchedule[hour][day]=lesson.getLessonInfo();
        //System.out.println("Birinci değer"+lessonHour.getRank());
        //this.weeklySchedule = weeklySchedule;
        //weeklySchedule[][]
    }
}



