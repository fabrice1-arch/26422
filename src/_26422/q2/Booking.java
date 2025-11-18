package _26422.q2;
import java.time.LocalDate;
public class Booking extends Passenger {
    private LocalDate bookingDate;
    private String seatNumber;
    private String travelClass; // Economy/Business/First
    public Booking(int id, java.time.LocalDateTime c, java.time.LocalDateTime u, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender,
                   LocalDate bookingDate, String seatNumber, String travelClass){
        super(id,c,u,airportName,code,location,airlineName,airlineCode,contactEmail,flightNumber,departure,destination,baseFare,pilotName,licenseNumber,experienceYears,crewName,role,shift,passengerName,age,gender);
        if (bookingDate==null) throw new IllegalArgumentException("bookingDate");
        if (seatNumber==null||seatNumber.isBlank()) throw new IllegalArgumentException("seatNumber");
        if (!"Economy".equalsIgnoreCase(travelClass) && !"Business".equalsIgnoreCase(travelClass) && !"First".equalsIgnoreCase(travelClass)) throw new IllegalArgumentException("class invalid");
        this.bookingDate=bookingDate; this.seatNumber=seatNumber; this.travelClass=travelClass;
    }
    public LocalDate getBookingDate(){return bookingDate;}
    public String getSeatNumber(){return seatNumber;}
}
