package _26422.q5;
import java.time.LocalDate;
public class LeaveRequest {
    private LocalDate requestDate;
    private String reason;
    private boolean approved;
    public LeaveRequest(LocalDate requestDate, String reason, boolean approved){
        if(requestDate==null) throw new IllegalArgumentException("date");
        if(reason==null||reason.isBlank()) throw new IllegalArgumentException("reason");
        this.requestDate=requestDate; this.reason=reason; this.approved=approved;
    }
}
