abstract class Account {
    private int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void showDetails() {
        System.out.println("Account No: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
        balance += amount + interest;
        System.out.println("Savings Deposit + Interest. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings Withdrawal Done. New Balance: " + balance);
        } else {
            System.out.println("Not enough balance in Savings Account.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current Deposit Done. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Current Withdrawal Done. New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }
}

public class q8 {
    public static void main(String[] args) {
        Account sa = new SavingsAccount(1001, 1000, 5);
        Account ca = new CurrentAccount(1002, 500, 300);

        sa.deposit(500);
        sa.withdraw(300);
        sa.showDetails();

        ca.deposit(200);
        ca.withdraw(900);
        ca.showDetails();
    }
}

