package _26422.q3;
public final class TaxRecord {
    private Employee employee;
    private TaxDeclaration declaration;
    private double credits;
    public TaxRecord(Employee employee, TaxDeclaration declaration, double credits){
        if (employee==null||declaration==null) throw new IllegalArgumentException("nulls");
        if (credits<0) throw new IllegalArgumentException("credits>=0");
        this.employee=employee; this.declaration=declaration; this.credits=credits;
    }
    // computeTax: (salary * rate) - credits ; find rate via employee's inheritance chain (TaxCategory rate)
    public String computeTax(){
        double rate = employee.getRate(); // from TaxCategory
        double taxable = employee.getSalary() * rate;
        double payable = taxable - credits;
        if (payable < 0) payable = 0;
        return String.format("TIN:%s | AssessedTax: %.2f (salary=%.2f,rate=%.2f,credits=%.2f)", employee.getTin(), payable, employee.getSalary(), rate, credits);
    }
}
