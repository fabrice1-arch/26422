package _26422.q3;
import java.time.LocalDateTime;
public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN;
    private String contact;
    public Employer(int id, LocalDateTime c, LocalDateTime u, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact){
        super(id,c,u,authorityName,region,email,categoryName,rate,code,tin,taxpayerName,address);
        if (employerName==null||employerName.isBlank()) throw new IllegalArgumentException("employerName");
        if (employerTIN==null||!employerTIN.matches("\\d{9}")) throw new IllegalArgumentException("employerTIN");
        if (contact==null||!contact.matches("\\d{10}")) throw new IllegalArgumentException("contact phone 10 digits");
        this.employerName=employerName; this.employerTIN=employerTIN; this.contact=contact;
    }
}
