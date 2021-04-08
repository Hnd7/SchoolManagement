package School;

public class Student extends Person {
    private int studentNumber;
    private int classNumber;
    private String className;

    public Student(String name, String surname, String personalId, int studentNumber,int classNumber, String className) {
        super(name, surname, personalId);
        this.studentNumber = studentNumber;
        this.className = className;
        this.classNumber = classNumber;
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
}