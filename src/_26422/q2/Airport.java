package _26422.q2;
import java.time.LocalDateTime;
public class Airport extends Entity {
    private String airportName;
    private String code; // 3 uppercase letters
    private String location;
    public Airport(int id, LocalDateTime created, LocalDateTime updated, String airportName, String code, String location){
        super(id,created,updated);
        if (airportName==null||airportName.isBlank()) throw new IllegalArgumentException("airportName");
        if (code==null||!code.matches("[A-Z]{3}")) throw new IllegalArgumentException("code must be 3 uppercase letters");
        this.airportName=airportName; this.code=code; this.location=location;
    }
    public String getAirportName(){return airportName;}
    public String getCode(){return code;}
    public String getLocation(){return location;}
}
