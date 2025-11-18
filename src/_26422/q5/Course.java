package _26422.q5;
import java.time.LocalDateTime;
public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits;
    public Course(int id, LocalDateTime c, LocalDateTime u, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits){
        super(id,c,u,institutionName,code,address,departmentName,departmentHead);
        if(courseName==null||courseName.isBlank()) throw new IllegalArgumentException("course");
        if(courseCode==null||courseCode.length()<3) throw new IllegalArgumentException("courseCode>=3");
        if(credits<=0) throw new IllegalArgumentException("credits>0");
        this.courseName=courseName; this.courseCode=courseCode; this.credits=credits;
    }
}
