package _26422.q4;
import java.time.LocalDate;
public class PurchaseOrder {
    private String poNumber;
    private LocalDate orderDate;
    private double totalAmount;
    public PurchaseOrder(String poNumber, LocalDate orderDate, double totalAmount){
        if(poNumber==null||poNumber.isBlank()) throw new IllegalArgumentException("poNumber");
        if(orderDate==null) throw new IllegalArgumentException("orderDate");
        if(totalAmount<=0) throw new IllegalArgumentException("total>0");
        this.poNumber=poNumber; this.orderDate=orderDate; this.totalAmount=totalAmount;
    }
    public double getTotalAmount(){return totalAmount;}
}
