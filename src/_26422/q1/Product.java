package _26422.q1;

import java.time.LocalDateTime;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                   String warehouseName, String location, String contactNumber,
                   String categoryName, String categoryCode,
                   String supplierName, String supplierEmail, String supplierPhone,
                   String productName, double unitPrice, int stockLimit) {

        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);

        if (productName == null || productName.isBlank())
            throw new IllegalArgumentException("productName required");

        if (unitPrice <= 0) throw new IllegalArgumentException("unitPrice must be > 0");
        if (stockLimit < 0) throw new IllegalArgumentException("stockLimit >= 0");

        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }

    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getStockLimit() { return stockLimit; }
}
