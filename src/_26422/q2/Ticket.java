package _26422.q2;
import java.time.LocalDate;
public final class Ticket {
    private Booking booking;
    private Payment payment;
    private String ticketNumber;
    public Ticket(Booking booking, Payment payment, String ticketNumber){
        if (booking==null) throw new IllegalArgumentException("booking");
        if (payment==null) throw new IllegalArgumentException("payment");
        if (ticketNumber==null||ticketNumber.isBlank()) throw new IllegalArgumentException("ticketNumber");
        this.booking=booking; this.payment=payment; this.ticketNumber=ticketNumber;
    }
    // calculate fare: baseFare + taxes - class discount (simple)
    public String calculateFare(){
        double base = booking.getBaseFare();
        double taxes = base * 0.12; // 12% tax
        double discount = 0.0;
        String cls = booking.getTravelClass();
        if ("Business".equalsIgnoreCase(cls)) discount = base * 0.05;
        if ("First".equalsIgnoreCase(cls)) discount = base * 0.10;
        double fare = base + taxes - discount;
        return String.format("Ticket %s | Fare: %.2f (base=%.2f,taxes=%.2f,discount=%.2f)", ticketNumber,fare,base,taxes,discount);
    }
}
