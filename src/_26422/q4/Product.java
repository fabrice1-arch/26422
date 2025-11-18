package _26422.q4;
import java.time.LocalDateTime;
public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int quantity;
    public Product(int id, LocalDateTime c, LocalDateTime u, String orgName, String address, String contactEmail, String orgCode, String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity){
        super(id,c,u,orgName,address,contactEmail,orgCode,deptName,deptCode,supplierName,supplierTIN,contact);
        if(productName==null||productName.isBlank()) throw new IllegalArgumentException("productName");
        if(unitPrice<=0) throw new IllegalArgumentException("unitPrice>0");
        if(quantity<0) throw new IllegalArgumentException("qty>=0");
        this.productName=productName; this.unitPrice=unitPrice; this.quantity=quantity;
    }
    public double getTotal(){return unitPrice*quantity;}
}
