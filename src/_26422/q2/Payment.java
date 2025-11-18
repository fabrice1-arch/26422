package _26422.q2;
import java.time.LocalDate;
public class Payment {
    private LocalDate paymentDate;
    private String paymentMethod;
    private double amountPaid;
    public Payment(LocalDate paymentDate, String method, double amount){
        if (paymentDate==null) throw new IllegalArgumentException("paymentDate required");
        if (method==null||method.isBlank()) throw new IllegalArgumentException("method");
        if (amount<=0) throw new IllegalArgumentException("amount>0");
        this.paymentDate=paymentDate; this.paymentMethod=method; this.amountPaid=amount;
    }
    public LocalDate getPaymentDate(){return paymentDate;}
    public String getPaymentMethod(){return paymentMethod;}
    public double getAmountPaid(){return amountPaid;}
}
