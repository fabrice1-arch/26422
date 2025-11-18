package _26422.q6;
import java.time.LocalDate;
public final class Payslip {
    private Payroll payroll;
    private final String studentId = "26422";
    public Payslip(Payroll payroll){ if(payroll==null) throw new IllegalArgumentException("payroll"); this.payroll=payroll; }
    public String generatePayslip(){
        double basic = payroll.structure.getBasic();
        double allowances = payroll.totalAllowances();
        double gross = basic + allowances;
        // RSSB deduction: e.g., 5% employee contribution and 15% employer share (we'll compute only employee)
        double rssbEmployee = gross * 0.05;
        double otherDeductions = payroll.totalDeductions();
        double net = gross - rssbEmployee - otherDeductions;
        return String.format("%s | PAYSLIP | Gross=%.2f RSSB(emp)=%.2f OtherDeductions=%.2f Net=%.2f", studentId, gross, rssbEmployee, otherDeductions, net);
    }
}
