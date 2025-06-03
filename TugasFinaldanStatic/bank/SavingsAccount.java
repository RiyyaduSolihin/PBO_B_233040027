package bank;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // ERROR: Cannot override the final method from BankAccount
    // public void displayAccountInfo() {
    //     System.out.println("This is a savings account");
    // }
    
    // Solusi: Tambahkan method baru khusus
    public void displayCustomInfo() {
        System.out.println("Savings account with custom display:");
        super.displayAccountInfo();
    }
}
