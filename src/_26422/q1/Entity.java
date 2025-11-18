package _26422.q1;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Entity {
    private int id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public Entity(int id, LocalDateTime createdDate, LocalDateTime updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        Objects.requireNonNull(createdDate);
        Objects.requireNonNull(updatedDate);

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public LocalDateTime getCreatedDate() { return createdDate; }
    public LocalDateTime getUpdatedDate() { return updatedDate; }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        Objects.requireNonNull(updatedDate);
        this.updatedDate = updatedDate;
    }
}
