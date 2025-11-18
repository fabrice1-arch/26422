package _26422.q6;
public class Deduction {
    private String name;
    private double amount;
    public Deduction(String name, double amount){
        if(name==null||name.isBlank()) throw new IllegalArgumentException("name");
        if(amount<0) throw new IllegalArgumentException("amount>=0");
        this.name=name; this.amount=amount;
    }
    public double getAmount(){return amount;}
}
