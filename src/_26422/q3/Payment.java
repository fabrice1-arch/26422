package _26422.q3;
import java.time.LocalDate;
public class Payment {
    private LocalDate paymentDate;
    private double paymentAmount;
    public Payment(LocalDate d, double amt){
        if (d==null) throw new IllegalArgumentException("date");
        if (amt<=0) throw new IllegalArgumentException("amount>0");
        this.paymentDate=d; this.paymentAmount=amt;
    }
    public double getPaymentAmount(){return paymentAmount;}
}
