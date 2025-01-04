package OOPSProgramming;

public class Encapsulation {
    private int accno;
   private String name;
   private Double balance;

    public void setAccno(int accno) {
        this.accno = accno;
    }
    public int getAccno() {
        return accno;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public Double getBalance(){
        return balance;
    }

}
