package com.ilkDenemeler;

public class Student extends  Person{
    private int studentNumber;
    private ClassNumber classNumber;
    private ClassName className;
    private Role role=Role.Ogrenci;
    private ClassObj classObj;

    public Student(String name, String surname, String personalId, int studentNumber,ClassNumber classNumber, ClassName className,ClassObj classObj) {
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

    public void graduate(){
        this.role=Role.Mezun;
    }

    public void deletePerson(){
        this.role=Role.Silindi;
        this.classObj.deleteStudent(this);
        System.out.println("Kişi silindi ve sınıf listesinden çıkarıldı.");
    }

    public ClassObj getClassObj() {
        System.out.println(this.classObj.getClassName());
        return classObj;
    }

    public void setClassObj(ClassObj classObj) {
        this.classObj = classObj;
    }
}
