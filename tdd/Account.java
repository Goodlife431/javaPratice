package tdd;

public class Account {
  private int balance;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getbalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if(amount <= balance)
        balance = balance - amount;
    }
}
