// Custom exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class representing a simple bank account
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in the account");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: " + balance);
    }
}

// Main class to demonstrate exception handling
public class ThrowExample {
    public static void main(String[] args) {
        // Create a bank account with initial balance of 1000
        BankAccount account = new BankAccount(1000);

        try {
            // Try to withdraw an amount greater than the balance
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            // Handle the InsufficientFundsException
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

