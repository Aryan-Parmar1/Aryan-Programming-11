import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;
    private double total;

    //Requires: double amount of deposit (>0) and total Balance of listed account
    //Modifies: this
    //Effects: brings value to class variables
    Deposit(double amount, double total, String account){
        if ((account == "Saving" || account == "Checking") && amount > 0) {
            Date date1 = new Date();
            this.amount = amount;
            this.account = account;
            this.total = total;
            this.date = date1;
        }
        else System.out.println("Invalid Deposit Input");
    }

    //Require: class variables holding value
    //Modifies: nothing
    //Effects: stores record of transaction history
    public String toString(){
        return "Deposit of $" + amount + " | Date: " + date + " | Into account: " + account + " | Current balance in " +
                account + " is: $" + total;
    }
}
