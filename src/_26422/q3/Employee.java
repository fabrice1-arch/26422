package _26422.q3;
import java.time.LocalDateTime;
public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTIN;
    public Employee(int id, LocalDateTime c, LocalDateTime u, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN){
        super(id,c,u,authorityName,region,email,categoryName,rate,code,tin,taxpayerName,address,employerName,employerTIN,contact);
        if (employeeName==null||employeeName.isBlank()) throw new IllegalArgumentException("employeeName");
        if (salary<=0) throw new IllegalArgumentException("salary>0");
        if (employeeTIN==null||!employeeTIN.matches("\\d{9}")) throw new IllegalArgumentException("employeeTIN 9 digits");
        this.employeeName=employeeName; this.salary=salary; this.employeeTIN=employeeTIN;
    }
    public double getSalary(){return salary;}
}
