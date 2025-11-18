package _26422.q1;

import java.time.LocalDateTime;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone) {

        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode);

        if (supplierName == null || supplierName.isBlank())
            throw new IllegalArgumentException("supplierName required");

        if (!supplierEmail.matches("^\\S+@\\S+\\.\\S+$"))
            throw new IllegalArgumentException("invalid supplierEmail");

        if (!supplierPhone.matches("\\d{10}"))
            throw new IllegalArgumentException("supplierPhone must be 10 digits");

        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierName() { return supplierName; }
    public String getSupplierEmail() { return supplierEmail; }
    public String getSupplierPhone() { return supplierPhone; }
}
