public class CheckingAccount extends Account {
    public CheckingAccount() {}

    public double withdraw(double amount) {
        if ((super.balance - amount) > 100) {
            super.balance -= amount;
            System.out.println("You withdrew " + amount);
            return amount;
        }
        System.out.println("Insufficient funds");
        return 0;
    }


}