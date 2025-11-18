package _26422.q6;
import java.time.LocalDateTime;
public class Employee extends Department {
    private String employeeName;
    private String employeeTIN;
    private double basicSalary;
    public Employee(int id, LocalDateTime c, LocalDateTime u, String orgName, String orgCode, String rssbNumber, String contactEmail, String departmentName,
                    String employeeName, String employeeTIN, double basicSalary){
        super(id,c,u,orgName,orgCode,rssbNumber,contactEmail,departmentName);
        if(employeeName==null||employeeName.isBlank()) throw new IllegalArgumentException("employeeName");
        if(employeeTIN==null||!employeeTIN.matches("\\d{9}")) throw new IllegalArgumentException("TIN 9 digits");
        if(basicSalary<=0) throw new IllegalArgumentException("salary>0");
        this.employeeName=employeeName; this.employeeTIN=employeeTIN; this.basicSalary=basicSalary;
    }
    public double getBasicSalary(){return basicSalary;}
    public String getEmployeeName(){return employeeName;}
}
