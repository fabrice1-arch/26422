package _26422.q5;
import java.time.LocalDateTime;
public class Department extends Institution {
    private String departmentName;
    private String departmentHead;
    public Department(int id, LocalDateTime c, LocalDateTime u, String institutionName, String code, String address, String departmentName, String departmentHead){
        super(id,c,u,institutionName,code,address);
        if(departmentName==null||departmentName.isBlank()) throw new IllegalArgumentException("dept");
        this.departmentName=departmentName; this.departmentHead=departmentHead;
    }
}
