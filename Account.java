import java.util.ArrayList;

public class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        transactions.add("Account created for: " + accountHolder);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: ₹" + amount);
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            transactions.add("Failed Withdrawal: ₹" + amount + " (Insufficient funds)");
        } else if (amount > 0) {
            balance -= amount;
            transactions.add("Withdrawn: ₹" + amount);
            System.out.println("Successfully withdrawn ₹" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String record : transactions) {
            System.out.println(record);
        }
    }
}
