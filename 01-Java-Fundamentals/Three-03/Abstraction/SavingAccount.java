package Three.Abstraction;

public class SavingAccount extends BankAccount{



    @Override
    public void deposit(double amount) {
        System.out.println("Deposited");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw");
    }
}
