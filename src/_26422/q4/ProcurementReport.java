package _26422.q4;
import java.time.LocalDate;
import java.util.List;
public final class ProcurementReport {
    private LocalDate reportDate;
    private String summary;
    private List<Invoice> invoices;
    public ProcurementReport(LocalDate reportDate, String summary, List<Invoice> invoices){
        if(reportDate==null) throw new IllegalArgumentException("date");
        if(invoices==null) throw new IllegalArgumentException("invoices");
        this.reportDate=reportDate; this.summary=summary; this.invoices=invoices;
    }
    public double calculateTotal(){
        return invoices.stream().mapToDouble(Invoice::getInvoiceAmount).sum();
    }
    public String generateReport(){
        return String.format("26422 | PROCUREMENT REPORT %s | Total=%.2f | %s", reportDate, calculateTotal(), summary);
    }
}
