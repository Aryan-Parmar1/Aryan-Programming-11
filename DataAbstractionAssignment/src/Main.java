public class Main {
    public static void main(String[] args) {
        //David's bank encounter:
        Customer david = new Customer("David", 1000, 1000);
        david.deposit(100, "Checking");
        david.deposit(500, "Saving");
        david.displayDeposits();

        david.withdraw(1500, "Checking");
        david.displayWithdraws();

        david.deposit(-1000, "Checking");
        //nuh, uh David, you can't spawn money!

    }
}
