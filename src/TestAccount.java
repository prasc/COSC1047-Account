public class TestAccount {

    public static void main(String[] args) {
        Account account = new Account(11231, 500, 1);
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingAccount savingAccount = new SavingAccount();

        System.out.println(account.toString());
        System.out.println(checkingAccount.toString());
        System.out.println(savingAccount.toString());

    }
}
