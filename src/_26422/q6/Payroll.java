package _26422.q6;
import java.util.List;
public class Payroll {
    private Employee employee;
    private PayrollPeriod period;
    SalaryStructure structure;
    private List<Allowance> allowances;
    private List<Deduction> deductions;
    public Payroll(Employee employee, PayrollPeriod period, SalaryStructure structure, java.util.List<Allowance> allowances, java.util.List<Deduction> deductions){
        if(employee==null||period==null||structure==null) throw new IllegalArgumentException("nulls");
        this.employee=employee; this.period=period; this.structure=structure; this.allowances=allowances; this.deductions=deductions;
    }
    public double totalAllowances(){ return allowances==null?0:allowances.stream().mapToDouble(Allowance::getAmount).sum(); }
    public double totalDeductions(){ return deductions==null?0:deductions.stream().mapToDouble(Deduction::getAmount).sum(); }
}
