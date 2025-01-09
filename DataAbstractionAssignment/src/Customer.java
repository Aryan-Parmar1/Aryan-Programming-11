//import javax.security.sasl.SaslClient;
import java.util.ArrayList;

public class Customer {
    static int accountNumber = 0;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double total = 0;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    //Default constructor
    Customer(){
        this.name = "John Doe";
        this.accountNumber++;
        this.checkBalance = 1000;
        this.savingBalance = 1000;
    }

    //Created customer constructor with inputs
    Customer(String name, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber++;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
    }

    //Requires: double amount >0, String account choice
    //Modifies: this
    //Effects: alters saving/checking balance, adds deposits record through Deposit class.
    public double deposit(double amt, String account){
        if ((account == SAVING || account == CHECKING) && amt > 0) {
            if (account == SAVING) {
                savingBalance += amt;
                total = savingBalance;
            }
            else if (account == CHECKING) {
                checkBalance += amt;
                total = checkBalance;
            };
            Deposit newDeposit = new Deposit(amt, total, account);
            deposits.add(newDeposit);
            return total;
        }
        else System.out.println("Invalid account or amount.");
        return 0;
    }

    //Requires: double amount, String account choice
    //Modifies: this
    //Effects: alters saving/checking balance, adds withdraw records through Withdraw class, checks if overdrawn
    public double withdraw(double amt, String account){
        if ((account == SAVING || account == CHECKING) && amt > 0) {
            if (account == SAVING) {
                savingBalance -= amt;
                total = savingBalance;
            }
            else if (account == CHECKING) {
                checkBalance -= amt;
                total = checkBalance;
            };
            checkOverdraft(amt, account);
            Withdraw newWithdraw = new Withdraw(amt, total, account);
            withdraws.add(newWithdraw);
            return total;
        }
        else System.out.println("Invalid account or amount.");
        return 0;
    }

    //Requires: double amount, String account choice
    //Modifies: Nothing
    //Effects: prints overdrawn warning if customer has an overdraft account
    private void checkOverdraft(double amt, String account){
        if (account == CHECKING) {
            if (checkBalance - amt < OVERDRAFT) {
                System.out.println("You have overdrawn: $" + (checkBalance - OVERDRAFT) + " from account: " + account + " | " + account + " balance: $" + checkBalance);
            };
        }
        else if (account == SAVING) {
            if (savingBalance - amt < OVERDRAFT) {
                System.out.println("You have overdrawn: $" + (savingBalance - OVERDRAFT) + " from account: " + account + " | " + account + " balance: $" + savingBalance);
            };
        };
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }
}
