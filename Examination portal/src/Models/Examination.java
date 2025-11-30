package Models;

public class Examination {
    String examName;
    Question question;
    Student student;
    Teacher teacher;

    public Examination(String examName, Question question, Student student, Teacher teacher) {
        this.examName = examName;
        this.question = question;
        this.student = student;
        this.teacher = teacher;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
