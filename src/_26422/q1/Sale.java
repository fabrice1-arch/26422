package _26422.q1;

import java.time.LocalDate;

public class Sale {
    private LocalDate saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(LocalDate saleDate, int soldQuantity, String customerName) {
        if (saleDate == null) throw new IllegalArgumentException("saleDate required");
        if (soldQuantity <= 0) throw new IllegalArgumentException("soldQuantity must be > 0");
        if (customerName == null || customerName.isBlank())
            throw new IllegalArgumentException("customerName required");

        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public LocalDate getSaleDate() { return saleDate; }
    public int getSoldQuantity() { return soldQuantity; }
    public String getCustomerName() { return customerName; }
}
