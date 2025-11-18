package _26422.q4;
public class Inspection {
    private String inspectorName;
    private String status; // Passed/Failed
    private String remarks;
    public Inspection(String inspectorName, String status, String remarks){
        if(inspectorName==null||inspectorName.isBlank()) throw new IllegalArgumentException("inspector");
        if(!"Passed".equalsIgnoreCase(status) && !"Failed".equalsIgnoreCase(status)) throw new IllegalArgumentException("status");
        this.inspectorName=inspectorName; this.status=status; this.remarks=remarks;
    }
    public String getStatus(){return status;}
}
