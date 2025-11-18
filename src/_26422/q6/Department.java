package _26422.q6;
import java.time.LocalDateTime;
public class Department extends Organization {
    private String departmentName;
    public Department(int id, LocalDateTime c, LocalDateTime u, String orgName, String orgCode, String rssbNumber, String contactEmail, String departmentName){
        super(id,c,u,orgName,orgCode,rssbNumber,contactEmail);
        if(departmentName==null||departmentName.isBlank()) throw new IllegalArgumentException("dept");
        this.departmentName=departmentName;
    }
}
