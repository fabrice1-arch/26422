package _26422.q2;
import java.time.LocalDateTime;
public class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender; // Male/Female/Other
    public Passenger(int id, LocalDateTime c, LocalDateTime u, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift,
                     String passengerName, int age, String gender){
        super(id,c,u,airportName,code,location,airlineName,airlineCode,contactEmail,flightNumber,departure,destination,baseFare,pilotName,licenseNumber,experienceYears,crewName,role,shift);
        if (passengerName==null||passengerName.isBlank()) throw new IllegalArgumentException("passengerName");
        if (age<=0) throw new IllegalArgumentException("age>0");
        if (gender==null||gender.isBlank()) throw new IllegalArgumentException("gender");
        this.passengerName=passengerName; this.age=age; this.gender=gender;
    }
    public String getPassengerName(){return passengerName;}
}
