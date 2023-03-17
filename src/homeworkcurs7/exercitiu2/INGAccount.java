package homeworkcurs7.exercitiu2;

public class INGAccount implements BankAccount{
    private double balance;
    @Override
    public void deposit(double amount) {
        balance +=amount;

    }

    @Override
    public void withdraw(double amount) {
        balance -=amount;

    }
    public double getBalance(){
        return balance;
    }
}
