package Three.Abstraction;

 abstract public class BankAccount {
    private String accountNumber;
    private double balance;


     public String getAccountNumber() {
         return accountNumber;
     }

     public void setAccountNumber(String accountNumber) {
         this.accountNumber = accountNumber;
     }

     public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
