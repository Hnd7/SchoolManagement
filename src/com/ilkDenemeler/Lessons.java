package com.ilkDenemeler;

public class Lessons {
    private String lessonsName;
    private int lessonsCode;

    public Lessons(String lessonsName, int lessonsCode) {
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