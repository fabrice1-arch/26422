package _26422.q6;
import java.time.LocalDate;
public class PayrollPeriod {
    private LocalDate startDate;
    private LocalDate endDate;
    public PayrollPeriod(LocalDate s, LocalDate e){
        if(s==null||e==null) throw new IllegalArgumentException("dates");
        this.startDate=s; this.endDate=e;
    }
}
