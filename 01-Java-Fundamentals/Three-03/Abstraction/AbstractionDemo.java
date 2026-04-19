package Three.Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount();
        savingAccount.deposit(100);

        BankAccount savingAccount1=new SavingAccount();
        savingAccount1=new CurrentAccount();
        savingAccount1.deposit(1000);


    }
}
