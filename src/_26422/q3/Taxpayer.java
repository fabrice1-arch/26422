package _26422.q3;
import java.time.LocalDateTime;
public class Taxpayer extends TaxCategory {
    private String tin; // 9 digits
    private String taxpayerName;
    private String address;
    public Taxpayer(int id, LocalDateTime c, LocalDateTime u, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address){
        super(id,c,u,authorityName,region,email,categoryName,rate,code);
        if (tin==null||!tin.matches("\\d{9}")) throw new IllegalArgumentException("TIN 9 digits");
        if (taxpayerName==null||taxpayerName.isBlank()) throw new IllegalArgumentException("taxpayerName");
        this.tin=tin; this.taxpayerName=taxpayerName; this.address=address;
    }
    public String getTin(){return tin;}
}
