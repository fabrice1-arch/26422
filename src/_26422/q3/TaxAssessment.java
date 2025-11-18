package _26422.q3;
import java.time.LocalDate;
public class TaxAssessment {
    private LocalDate assessmentDate;
    private double assessedTax;
    public TaxAssessment(LocalDate d, double tax){
        if (d==null) throw new IllegalArgumentException("date");
        if (tax<0) throw new IllegalArgumentException("tax>=0");
        this.assessmentDate=d; this.assessedTax=tax;
    }
    public double getAssessedTax(){return assessedTax;}
}
