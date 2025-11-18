package _26422.q1;

import java.time.LocalDateTime;

public class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel) {

        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit);

        if (quantityAvailable < 0 || reorderLevel < 0)
            throw new IllegalArgumentException("quantities must be >= 0");

        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }

    public int getQuantityAvailable() { return quantityAvailable; }
    public void setQuantityAvailable(int q) {
        if (q < 0) throw new IllegalArgumentException("q must be >= 0");
        this.quantityAvailable = q;
    }

    public int getReorderLevel() { return reorderLevel; }
}
