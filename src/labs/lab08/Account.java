package labs.lab08;

public class Account {

    private int id;
    private String owner;
    private double balance;

    public Account(int id, String owner, double balance){
    this.id = id;
    this.owner = owner;
    this.balance = balance;
    }
    public void addInterest() {
        double interestRate = 0.025;
        balance += balance * interestRate;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public String getDetails() {
        return "ID : " + id + ", Owner : " + owner + ", Balance : " + balance;
    }

}