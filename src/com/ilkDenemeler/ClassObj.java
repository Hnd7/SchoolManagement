package com.ilkDenemeler;

import java.util.List;

public class ClassObj {
    private ClassName className;
    private ClassNumber classNumber;
    private List<Student> studentList;
    private final int capacity=30;

    public ClassObj(ClassName className, ClassNumber classNumber, List<Student> studentList) {
        this.className = className;
        this.classNumber = classNumber;
        this.studentList = studentList;
    }
    //TODO DERS PROGRAMI EKLE

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }

    public ClassNumber getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(ClassNumber classNumber) {
        this.classNumber = classNumber;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        if (capacity>this.studentList.size()){
            this.studentList.add(student);}
        else{ System.out.println("Sınıf kapasitesi dolu!"); }
    }
    public void checkStudentList(){

    }

    public void deleteStudent(Student student) {
        if(this.studentList.contains(student)) {
            this.studentList.remove(student);
            System.out.printf("Öğrenci sınıf listesinden silindi.");
        }
        else {
            System.out.println("Hata! Öğrenci bulunamadı.");
        }
    }
}
