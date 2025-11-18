package _26422.q4;
import java.time.LocalDateTime;
public class Department extends Organization {
    private String deptName;
    private String deptCode; // alphanumeric >=3
    public Department(int id, LocalDateTime c, LocalDateTime u, String orgName, String address, String contactEmail, String orgCode, String deptName, String deptCode){
        super(id,c,u,orgName,address,contactEmail,orgCode);
        if(deptName==null||deptName.isBlank()) throw new IllegalArgumentException("deptName");
        if(deptCode==null||!deptCode.matches("[A-Za-z0-9]{3,}")) throw new IllegalArgumentException("deptCode");
        this.deptName=deptName; this.deptCode=deptCode;
    }
}
