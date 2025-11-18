package _26422.q5;
import java.time.LocalDateTime; import java.util.Objects;
public abstract class Entity {
    private int id; private LocalDateTime createdDate; private LocalDateTime updatedDate;
    public Entity(int id, LocalDateTime c, LocalDateTime u){ if(id<=0) throw new IllegalArgumentException("id>0"); Objects.requireNonNull(c); Objects.requireNonNull(u); this.id=id; }
}
