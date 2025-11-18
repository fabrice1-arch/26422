package _26422.q3;
import java.time.YearMonth;
public class TaxDeclaration {
    private YearMonth declarationMonth;
    private double totalIncome;
    public TaxDeclaration(YearMonth m, double totalIncome){
        if (m==null) throw new IllegalArgumentException("declarationMonth");
        if (totalIncome<0) throw new IllegalArgumentException("income>=0");
        this.declarationMonth=m; this.totalIncome=totalIncome;
    }
    public double getTotalIncome(){return totalIncome;}
}
