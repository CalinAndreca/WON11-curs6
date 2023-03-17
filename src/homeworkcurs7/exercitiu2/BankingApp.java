package homeworkcurs7.exercitiu2;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount ingAccount = new INGAccount();
        BankAccount btAccount = new BTAccount();
        BankAccount brdAccount = new BRDAccount();

        ingAccount.deposit(500);
        btAccount.deposit(1000);
        brdAccount.deposit(1500);

        ingAccount.withdraw(100);
        btAccount.withdraw(400);
        brdAccount.withdraw(300);

        System.out.println("ING Account balance: " + ((INGAccount) ingAccount).getBalance());
        System.out.println("BT Account balance: " + ((BTAccount) btAccount).getBalance());
        System.out.println("BRD Account balance: " + ((BRDAccount) brdAccount).getBalance());
    }
}
