package _26422.q1;

import java.time.LocalDate;

public class Purchase {
    private LocalDate purchaseDate;
    private int purchasedQuantity;
    private String supplierName;

    public Purchase(LocalDate purchaseDate, int purchasedQuantity, String supplierName) {

        if (purchaseDate == null) throw new IllegalArgumentException("purchaseDate required");
        if (purchasedQuantity <= 0) throw new IllegalArgumentException("purchasedQuantity must be > 0");
        if (supplierName == null || supplierName.isBlank())
            throw new IllegalArgumentException("supplierName required");

        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierName = supplierName;
    }

    public LocalDate getPurchaseDate() { return purchaseDate; }
    public int getPurchasedQuantity() { return purchasedQuantity; }
    public String getSupplierName() { return supplierName; }
}
