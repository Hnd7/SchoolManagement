package com.ilkDenemeler;

public class Student extends  Person{
    private int studentNumber;
    private ClassNumber classNumber;
    private ClassName className;
    private Role role=Role.Ogrenci;
    private ClassObj classObj;
    private int classID;

    public Student(String name, String surname, String personalId, ClassNumber classNumber, ClassName className) {
        super(name, surname,  personalId);
        this.className = className;
        this.classNumber = classNumber;

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

    public void setRole(Role role) {
        this.role = role;
    }


    public Role getRole() {
        return role;
    }

    public int getClassID() {
        return classID;
    }
}
