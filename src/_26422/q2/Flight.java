package _26422.q2;
import java.time.LocalDateTime;
public class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;
    public Flight(int id, LocalDateTime c, LocalDateTime u, String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare){
        super(id,c,u,airportName,code,location,airlineName,airlineCode,contactEmail);
        if (flightNumber==null||flightNumber.isBlank()) throw new IllegalArgumentException("flightNumber");
        if (departure==null||destination==null) throw new IllegalArgumentException("locations");
        if (baseFare<=0) throw new IllegalArgumentException("baseFare>0");
        this.flightNumber=flightNumber; this.departure=departure; this.destination=destination; this.baseFare=baseFare;
    }
    public String getFlightNumber(){return flightNumber;}
    public String getDeparture(){return departure;}
    public String getDestination(){return destination;}
    public double getBaseFare(){return baseFare;}
}
