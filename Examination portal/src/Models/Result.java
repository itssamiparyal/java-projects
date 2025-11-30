package Models;

public class Result  {
   Student student;
   Examination examination;

   public Result(Student student, Examination examination) {
      this.student = student;
      this.examination = examination;
   }

   public Student getStudent() {
      return student;
   }

   public void setStudent(Student student) {
      this.student = student;
   }

   public Examination getExamination() {
      return examination;
   }

   public void setExamination(Examination examination) {
      this.examination = examination;
   }
}
