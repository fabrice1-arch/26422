package _26422.q6;
public class SalaryStructure {
    private double basic;
    public SalaryStructure(double basic){
        if(basic<=0) throw new IllegalArgumentException("basic>0");
        this.basic=basic;
    }
    public double getBasic(){return basic;}
}
