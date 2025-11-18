package _26422.q1;

import java.time.LocalDateTime;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, LocalDateTime createdDate, LocalDateTime updatedDate,
                     String warehouseName, String location, String contactNumber) {

        super(id, createdDate, updatedDate);

        if (warehouseName == null || warehouseName.isBlank())
            throw new IllegalArgumentException("warehouseName required");

        if (!contactNumber.matches("\\d{10}"))
            throw new IllegalArgumentException("contactNumber must be 10 digits");

        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    public String getWarehouseName() { return warehouseName; }
    public String getLocation() { return location; }
    public String getContactNumber() { return contactNumber; }
}
