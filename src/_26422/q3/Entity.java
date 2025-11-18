package _26422.q3;
import java.time.LocalDateTime; import java.util.Objects;
public abstract class Entity {
    private int id; private LocalDateTime createdDate; private LocalDateTime updatedDate;
    public Entity(int id, LocalDateTime c, LocalDateTime u){ if(id<=0) throw new IllegalArgumentException("id>0"); Objects.requireNonNull(c); Objects.requireNonNull(u); this.id=id; this.createdDate=c; this.updatedDate=u; }
    public int getId(){return id;} public LocalDateTime getCreatedDate(){return createdDate;} public LocalDateTime getUpdatedDate(){return updatedDate;}
}
