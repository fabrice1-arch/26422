package _26422.q1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Q1Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        System.out.println("=== STOCK MANAGEMENT SYSTEM (Q1) ===");
        System.out.print("How many products do you want to add? ");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= count; i++) {

            System.out.println("\nProduct " + i);
            System.out.print("Product name: ");
            String pname = sc.nextLine();

            System.out.print("Unit price: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Stock limit: ");
            int limit = Integer.parseInt(sc.nextLine());

            System.out.print("Quantity available: ");
            int qty = Integer.parseInt(sc.nextLine());

            System.out.print("Reorder level: ");
            int reorder = Integer.parseInt(sc.nextLine());

            StockItem item = new StockItem(
                    i, LocalDateTime.now(), LocalDateTime.now(),
                    "MainWarehouse", "Kigali", "0780000000",
                    "DefaultCategory", "CAT01",
                    "DefaultSupplier", "supplier@gmail.com", "0781111111",
                    pname, price, limit, qty, reorder
            );

            inventory.addItem(item);
        }

        System.out.print("\nDo you want to record a purchase? (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Purchase quantity: ");
            int pq = Integer.parseInt(sc.nextLine());
            Purchase p = new Purchase(LocalDate.now(), pq, "DefaultSupplier");
            inventory.recordPurchase(p);

            StockItem first = inventory.getItems().get(0);
            first.setQuantityAvailable(first.getQuantityAvailable() + pq);
        }

        System.out.print("Do you want to record a sale? (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Sale quantity: ");
            int sq = Integer.parseInt(sc.nextLine());
            Sale s = new Sale(LocalDate.now(), sq, "Customer");
            inventory.recordSale(s);

            StockItem first = inventory.getItems().get(0);
            first.setQuantityAvailable(Math.max(0, first.getQuantityAvailable() - sq));
        }

        System.out.print("\nEnter remarks for report: ");
        String remarks = sc.nextLine();

        StockReport report = new StockReport(LocalDate.now(), remarks, inventory);
        System.out.println("\n=== FINAL REPORT ===");
        System.out.println(report.generateReport());

        sc.close();
    }
}
