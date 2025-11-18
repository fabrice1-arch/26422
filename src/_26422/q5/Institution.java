package _26422.q5;
import java.time.LocalDateTime;
public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;
    public Institution(int id, LocalDateTime c, LocalDateTime u, String institutionName, String code, String address){
        super(id,c,u);
        if(institutionName==null||institutionName.isBlank()) throw new IllegalArgumentException("name");
        if(code==null||code.length()<3) throw new IllegalArgumentException("code>=3");
        this.institutionName=institutionName; this.code=code; this.address=address;
    }
}
