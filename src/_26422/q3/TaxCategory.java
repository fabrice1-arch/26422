package _26422.q3;
import java.time.LocalDateTime;
public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;
    public TaxCategory(int id, LocalDateTime c, LocalDateTime u, String authorityName, String region, String email, String categoryName, double rate, String code){
        super(id,c,u,authorityName,region,email);
        if (categoryName==null||categoryName.isBlank()) throw new IllegalArgumentException("categoryName");
        if (rate<=0) throw new IllegalArgumentException("rate>0");
        if (code==null||code.length()<3) throw new IllegalArgumentException("code>=3");
        this.categoryName=categoryName; this.rate=rate; this.code=code;
    }
    public double getRate(){return rate;}
}
