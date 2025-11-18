package _26422.q5;
import java.time.LocalDateTime;
public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age;
    public Student(int id, LocalDateTime c, LocalDateTime u, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits,
                   String instructorName, String email, String phone,
                   String studentName, String studentID, int age){
        super(id,c,u,institutionName,code,address,departmentName,departmentHead,courseName,courseCode,credits,instructorName,email,phone);
        if(studentName==null||studentName.isBlank()) throw new IllegalArgumentException("studentName");
        if(studentID==null||studentID.isBlank()) throw new IllegalArgumentException("studentID");
        if(age<=0) throw new IllegalArgumentException("age>0");
        this.studentName=studentName; this.studentID=studentID; this.age=age;
    }
}
