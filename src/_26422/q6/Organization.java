package _26422.q6;
import java.time.LocalDateTime;
public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber; // 8 digits
    private String contactEmail;
    public Organization(int id, LocalDateTime c, LocalDateTime u, String orgName, String orgCode, String rssbNumber, String contactEmail){
        super(id,c,u);
        if(orgName==null||orgName.isBlank()) throw new IllegalArgumentException("orgName");
        if(orgCode==null||orgCode.length()<3) throw new IllegalArgumentException("orgCode>=3");
        if(rssbNumber==null||!rssbNumber.matches("\\d{8}")) throw new IllegalArgumentException("rssb 8 digits");
        if(contactEmail==null||!contactEmail.matches("^\\S+@\\S+\\.\\S+$")) throw new IllegalArgumentException("email");
        this.orgName=orgName; this.orgCode=orgCode; this.rssbNumber=rssbNumber; this.contactEmail=contactEmail;
    }
}
