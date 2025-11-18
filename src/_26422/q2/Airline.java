package _26422.q2;
import java.time.LocalDateTime;
public class Airline extends Airport {
    private String airlineName;
    private String airlineCode; // 2-4 letters
    private String contactEmail;
    public Airline(int id, LocalDateTime c, LocalDateTime u, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail){
        super(id,c,u,airportName,code,location);
        if (airlineName==null||airlineName.isBlank()) throw new IllegalArgumentException("airlineName");
        if (airlineCode==null||!airlineCode.matches("[A-Za-z]{2,4}")) throw new IllegalArgumentException("airlineCode");
        if (contactEmail==null||!contactEmail.matches("^\\S+@\\S+\\.\\S+$")) throw new IllegalArgumentException("email");
        this.airlineName=airlineName; this.airlineCode=airlineCode; this.contactEmail=contactEmail;
    }
    public String getAirlineName(){return airlineName;}
    public String getAirlineCode(){return airlineCode;}
    public String getContactEmail(){return contactEmail;}
}
