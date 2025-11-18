package _26422.q1;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<StockItem> items = new ArrayList<>();
    private List<Purchase> purchases = new ArrayList<>();
    private List<Sale> sales = new ArrayList<>();

    public void addItem(StockItem item) { items.add(item); }
    public void recordPurchase(Purchase p) { purchases.add(p); }
    public void recordSale(Sale s) { sales.add(s); }

    public int totalItems() {
        return items.stream().mapToInt(StockItem::getQuantityAvailable).sum();
    }

    public double stockValue() {
        return items.stream().mapToDouble(i -> i.getQuantityAvailable() * i.getUnitPrice()).sum();
    }

    public int totalSalesQuantity() {
        return sales.stream().mapToInt(Sale::getSoldQuantity).sum();
    }

    public List<StockItem> getItems() { return items; }
    public List<Purchase> getPurchases() { return purchases; }
    public List<Sale> getSales() { return sales; }
}
