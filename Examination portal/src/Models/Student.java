package Models;

public class Student extends Person  {
    String Grade;


    public Student(String name, int age, String gender, String grade) {
        super(name, age, gender);
        Grade = grade;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
    public void printStudentInfo() {
        
    }
}
