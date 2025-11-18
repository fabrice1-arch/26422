package _26422.q5;
import java.time.LocalDate;
public class ClassSession {
    private LocalDate sessionDate;
    private String topic;
    public ClassSession(LocalDate sessionDate, String topic){
        if(sessionDate==null) throw new IllegalArgumentException("date");
        if(topic==null||topic.isBlank()) throw new IllegalArgumentException("topic");
        this.sessionDate=sessionDate; this.topic=topic;
    }
}
