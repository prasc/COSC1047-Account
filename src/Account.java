public class Account {
    protected double accountNumber;
    protected double balance;
    protected double annualInterestRate;
    private java.util.Date dateCreated;

    public Account() {
        this(0, 0, 0);
    }

    public Account(double accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new java.util.Date();
    }

    public double withdraw(double amount) {
        if ((this.balance - amount) > 0) {
            this.balance -= amount;
            System.out.println("You withdrew " + amount);
            return amount;
        }
        System.out.println("Insufficient funds");
        return 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your new balance is " + balance);
    }
}


