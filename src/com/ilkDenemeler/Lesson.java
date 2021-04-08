package com.ilkDenemeler;

import java.lang.reflect.Array;

public class Lesson {
    private Lessons lesson;
    private String teacherName;
    private ClassNumber classNumber;
    private ClassName className;
    private Days day;

    public Lesson(String teacherName, ClassNumber classNumber, ClassName className,  Days day) {
        this.teacherName = teacherName;
        this.classNumber = classNumber;
        this.className = className;
        this.day=day;
    }

    public Object[] getLessonInfo() {
        Object[] LessonInfo = {teacherName, classNumber, className, day};
        return LessonInfo;
    }

    public void setLesson(Lessons lesson) {
        this.lesson = lesson;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public ClassNumber getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(ClassNumber classNumber) {
        this.classNumber = classNumber;
    }

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }


    public Lessons getLesson() {
        return lesson;
    }
}
