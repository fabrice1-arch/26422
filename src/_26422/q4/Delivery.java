package _26422.q4;
import java.time.LocalDate;
public class Delivery {
    private LocalDate deliveryDate;
    private String deliveredBy;
    public Delivery(LocalDate deliveryDate, String deliveredBy){
        if(deliveryDate==null) throw new IllegalArgumentException("date");
        if(deliveredBy==null||deliveredBy.isBlank()) throw new IllegalArgumentException("deliveredBy");
        this.deliveryDate=deliveryDate; this.deliveredBy=deliveredBy;
    }
}
