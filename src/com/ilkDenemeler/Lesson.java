package com.ilkDenemeler;

import java.lang.reflect.Array;

public class Lesson {
    private Lessons lesson;
    private String teacherName;
    private ClassNumber classNumber;
    private ClassName className;
    private Days day;
    private LessonNumbers lessonNumber;

    private int lessonScheduleId;
    private int lessonId;
    private int classId;
    private int dayId;
    private int lessonNumbers;
    private int teacherId;


    public Lesson(String teacherName, ClassNumber classNumber, ClassName className,  Days day,LessonNumbers lessonNumber) {
        this.teacherName = teacherName;
        this.classNumber = classNumber;
        this.className = className;
        this.day=day;
        this.lessonNumber=lessonNumber;
    }

    public Lesson() {
    }

    public Object[] getLessonInfo() {
        Lessons lesson= Lessons.Fizik;
        Object[] LessonInfo = {teacherName, classNumber, className, lesson.getLessonsName()};
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

    public int getDay() {
        return this.day.getID();
    }

    public void setDay(Days day) {
        this.day = day;
    }

    public int getLessonNumber() {
        return lessonNumber.getRank();
    }

    public void setLessonNumber(LessonNumbers lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public int getLessonScheduleId() {
        return lessonScheduleId;
    }

    public void setLessonScheduleId(int lessonScheduleId) {
        this.lessonScheduleId = lessonScheduleId;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getDayId() {
        return dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public int getLessonNumbers() {
        return lessonNumbers;
    }

    public void setLessonNumbers(int lessonNumbers) {
        this.lessonNumbers = lessonNumbers;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
