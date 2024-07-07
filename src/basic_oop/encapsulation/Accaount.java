package basic_oop.encapsulation;

public class Accaount {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float mBalance) {
        if (mBalance > 0)
            this.balance = mBalance;
    }

    public void deposit(float amount) {
        if(amount>0)
            balance = balance + amount;
    }

    public void withdraw(float amount) {
        if (balance > amount)
            balance = balance - amount;
    }
}
