package pt4.task4;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void applyCommission(){
        double commissionRate = 0.05;
        double commission = balance * commissionRate;
        balance -= commission;
    }
}
