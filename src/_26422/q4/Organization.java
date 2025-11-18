package _26422.q4;
import java.time.LocalDateTime;
public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;
    private String orgCode;
    private String rssbNumber; // reuse name constraint not needed here
    public Organization(int id, LocalDateTime c, LocalDateTime u, String orgName, String address, String contactEmail, String orgCode){
        super(id,c,u);
        if(orgName==null||orgName.isBlank()) throw new IllegalArgumentException("orgName");
        if(contactEmail==null||!contactEmail.matches("^\\S+@\\S+\\.\\S+$")) throw new IllegalArgumentException("email");
        if(orgCode==null||orgCode.length()<3) throw new IllegalArgumentException("orgCode>=3");
        this.orgName=orgName; this.address=address; this.contactEmail=contactEmail; this.orgCode=orgCode;
    }
}
