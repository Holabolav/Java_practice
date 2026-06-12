class BankAccount {
    private int balance;

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class bank {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        BankAccount b2 = new BankAccount();

        b.deposit(-5000);      // Invalid
        b.withdraw(5000);      // Insufficient funds

        b2.deposit(15000);
        b2.withdraw(5000);

        System.out.println("Balance of b: " + b.getBalance());
        System.out.println("Balance of b2: " + b2.getBalance());
    }
}