package day18_garbageCollection;

public class BankAccountMainClass {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountHolder = "ahmet";
        account1.accountNumber = 7777;
        account1.balance = 30_000;

        BankAccount account2 = new BankAccount();
        account2.setInfo("veli",8888);

        System.out.println(account1);
        account1.checkBalance();
        account1.deposit(5_000);
        account1.checkBalance();

        account2.checkBalance();
        account2.withdraw(5_000);
        account2.checkBalance();
        account1.deposit(-2000);

    }
}
