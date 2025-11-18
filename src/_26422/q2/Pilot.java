package _26422.q2;
import java.time.LocalDateTime;
public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;
    public Pilot(int id, LocalDateTime c, LocalDateTime u, String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears){
        super(id,c,u,airportName,code,location,airlineName,airlineCode,contactEmail,flightNumber,departure,destination,baseFare);
        if (pilotName==null||pilotName.isBlank()) throw new IllegalArgumentException("pilotName");
        if (licenseNumber==null||licenseNumber.isBlank()) throw new IllegalArgumentException("license");
        if (experienceYears<2) throw new IllegalArgumentException("experience >=2");
        this.pilotName=pilotName; this.licenseNumber=licenseNumber; this.experienceYears=experienceYears;
    }
    public String getPilotName(){return pilotName;}
}
