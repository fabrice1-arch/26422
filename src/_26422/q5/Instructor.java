package _26422.q5;
import java.time.LocalDateTime;
public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;
    public Instructor(int id, LocalDateTime c, LocalDateTime u, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone){
        super(id,c,u,institutionName,code,address,departmentName,departmentHead,courseName,courseCode,credits);
        if(instructorName==null||instructorName.isBlank()) throw new IllegalArgumentException("instructor");
        if(email==null||!email.matches("^\\S+@\\S+\\.\\S+$")) throw new IllegalArgumentException("email");
        if(phone==null||!phone.matches("\\d{10}")) throw new IllegalArgumentException("phone 10 digits");
        this.instructorName=instructorName; this.email=email; this.phone=phone;
    }
}
