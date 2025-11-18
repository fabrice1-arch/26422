package _26422.q5;
public class AttendanceRecord {
    private String studentID;
    private String sessionID;
    private String status; // Present/Absent
    public AttendanceRecord(String studentID, String sessionID, String status){
        if(studentID==null||studentID.isBlank()) throw new IllegalArgumentException("studentID");
        if(sessionID==null||sessionID.isBlank()) throw new IllegalArgumentException("sessionID");
        if(!"Present".equalsIgnoreCase(status) && !"Absent".equalsIgnoreCase(status)) throw new IllegalArgumentException("status");
        this.studentID=studentID; this.sessionID=sessionID; this.status=status;
    }
    public boolean isPresent(){ return "Present".equalsIgnoreCase(status); }
}
