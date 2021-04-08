package com.ilkDenemeler;

public class Student extends  Person{
    private int studentNumber;
    private int classNumber;
    private String className;
    private Role role=Role.Ogrenci;
    private ClassObj classObj;

    public Student(String name, String surname, String personalId, int studentNumber,int classNumber, String className,ClassObj classObj) {
        super(name, surname,  personalId);
        this.studentNumber = studentNumber;
        this.className = className;
        this.classNumber = classNumber;
        this.classObj=classObj;
    }


    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void graduate(){
        this.role=Role.Mezun;
    }

    public void deletePerson(){
        this.role=Role.Silindi;
        this.classObj.deleteStudent(this);
        System.out.println("Kişi silindi ve sınıf listesinden çıkarıldı.");
    }

    public ClassObj getClassObj() {
        return classObj;
    }

    public void setClassObj(ClassObj classObj) {
        this.classObj = classObj;
    }
}
