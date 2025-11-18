package _26422.q3;
import java.time.LocalDateTime;
public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;
    public TaxAuthority(int id, LocalDateTime c, LocalDateTime u, String authorityName, String region, String email){
        super(id,c,u); if(authorityName==null||authorityName.isBlank()) throw new IllegalArgumentException("authorityName"); if (email==null||!email.matches("^\\S+@\\S+\\.\\S+$")) throw new IllegalArgumentException("email");
        this.authorityName=authorityName; this.region=region; this.email=email;
    }
}
