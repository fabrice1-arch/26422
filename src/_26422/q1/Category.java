package _26422.q1;

import java.time.LocalDateTime;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode) {

        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);

        if (categoryName == null || categoryName.isBlank())
            throw new IllegalArgumentException("categoryName required");

        if (!categoryCode.matches("[A-Za-z0-9]{3,}"))
            throw new IllegalArgumentException("categoryCode must be alphanumeric, >=3 chars");

        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
}
