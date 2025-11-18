package _26422.q4;
import java.time.LocalDateTime;
public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN; //9 digits
    private String contact;
    public Supplier(int id, LocalDateTime c, LocalDateTime u, String orgName, String address, String contactEmail, String orgCode, String deptName, String deptCode,
                    String supplierName, String supplierTIN, String contact){
        super(id,c,u,orgName,address,contactEmail,orgCode,deptName,deptCode);
        if(supplierName==null||supplierName.isBlank()) throw new IllegalArgumentException("supplierName");
        if(supplierTIN==null||!supplierTIN.matches("\\d{9}")) throw new IllegalArgumentException("TIN 9 digits");
        if(contact==null||!contact.matches("\\d{10}")) throw new IllegalArgumentException("contact 10 digits");
        this.supplierName=supplierName; this.supplierTIN=supplierTIN; this.contact=contact;
    }
}
