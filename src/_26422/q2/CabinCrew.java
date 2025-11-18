package _26422.q2;
import java.time.LocalDateTime;
public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift; // Day or Night
    public CabinCrew(int id, LocalDateTime c, LocalDateTime u, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift){
        super(id,c,u,airportName,code,location,airlineName,airlineCode,contactEmail,flightNumber,departure,destination,baseFare,pilotName,licenseNumber,experienceYears);
        if (crewName==null||crewName.isBlank()) throw new IllegalArgumentException("crewName");
        if (role==null||role.isBlank()) throw new IllegalArgumentException("role");
        if (!"Day".equalsIgnoreCase(shift) && !"Night".equalsIgnoreCase(shift)) throw new IllegalArgumentException("shift Day/Night");
        this.crewName=crewName; this.role=role; this.shift=shift;
    }
    public String getCrewName(){return crewName;}
}
