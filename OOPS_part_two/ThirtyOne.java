/*31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y". */

// Custom exception class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance " + balance + " for withdrawal of " + amount);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
    }
}

// Main class
public class ThirtyOne {
    public static void main(String[] args) {
        // Creating a BankAccount object with an initial balance of 500
        BankAccount account = new BankAccount(500);

        try {
            // Trying to withdraw 600, which is more than the balance
            account.withdraw(600);  // This will throw the InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            // Catching and displaying the custom exception message
            System.out.println(e.getMessage());
        }

        try {
            // Trying to withdraw 300, which is less than the balance
            account.withdraw(300);  // This will be successful
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
