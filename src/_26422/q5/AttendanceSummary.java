package _26422.q5;
import java.time.LocalDate;
import java.util.List;
public final class AttendanceSummary {
    private LocalDate reportDate;
    private List<AttendanceRecord> records;
    public AttendanceSummary(LocalDate reportDate, List<AttendanceRecord> records){
        if(reportDate==null) throw new IllegalArgumentException("date");
        if(records==null) throw new IllegalArgumentException("records");
        this.reportDate=reportDate; this.records=records;
    }
    public String generateSummary(){
        long total = records.size();
        long present = records.stream().filter(AttendanceRecord::isPresent).count();
        double percent = total==0 ? 0.0 : (present*100.0)/total;
        return String.format("26422 | Attendance Summary %s | Present=%d Total=%d Percent=%.2f%%", reportDate, present, total, percent);
    }
}
