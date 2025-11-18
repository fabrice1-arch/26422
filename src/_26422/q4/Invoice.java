package _26422.q4;
import java.time.LocalDate;
public class Invoice {
    private String invoiceNo;
    private double invoiceAmount;
    private LocalDate invoiceDate;
    public Invoice(String invoiceNo, double invoiceAmount, LocalDate invoiceDate){
        if(invoiceNo==null||invoiceNo.isBlank()) throw new IllegalArgumentException("invoiceNo");
        if(invoiceAmount<=0) throw new IllegalArgumentException("amount>0");
        if(invoiceDate==null) throw new IllegalArgumentException("date");
        this.invoiceNo=invoiceNo; this.invoiceAmount=invoiceAmount; this.invoiceDate=invoiceDate;
    }
    public double getInvoiceAmount(){return invoiceAmount;}
}
