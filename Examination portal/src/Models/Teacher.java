package Models;

public class Teacher extends Person {
    String Subject;
    String Qualification;

    public Teacher(String name, int age, String gender, String subject, String qualification) {
        super(name, age, gender);
        Subject = subject;
        Qualification = qualification;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}
