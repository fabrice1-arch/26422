package _26422.q1;

import java.time.LocalDate;

public final class StockReport {
    private LocalDate reportDate;
    private String remarks;
    private Inventory inventory;

    private final String studentId = "26422";

    public StockReport(LocalDate reportDate, String remarks, Inventory inventory) {
        if (reportDate == null) throw new IllegalArgumentException("reportDate required");
        if (inventory == null) throw new IllegalArgumentException("inventory required");

        this.reportDate = reportDate;
        this.remarks = remarks;
        this.inventory = inventory;
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();

        sb.append(studentId).append(" | STOCK REPORT: ").append(reportDate).append("\n");
        sb.append("Remarks: ").append(remarks).append("\n");
        sb.append("Total items: ").append(inventory.totalItems()).append("\n");
        sb.append("Total stock value: ").append(inventory.stockValue()).append("\n");
        sb.append("Total sales quantity: ").append(inventory.totalSalesQuantity()).append("\n");
        sb.append("Products:\n");

        for (StockItem it : inventory.getItems()) {
            sb.append(" - ").append(it.getProductName())
                    .append(" | qty=").append(it.getQuantityAvailable())
                    .append(" | price=").append(it.getUnitPrice())
                    .append("\n");
        }
        return sb.toString();
    }
}
