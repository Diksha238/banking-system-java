import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private String name;
    private int pin;
    private double balance;
    private ArrayList<Transaction> transactions;
    public Account(int accountNumber,String name,int pin){

        this.accountNumber=accountNumber;
        this.pin=pin;
        this.name=name;
        this.balance=0.0;
        this.transactions=new ArrayList<>();

    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            transactions.add(new Transaction("Deposit",amount));
        }
        else{
            System.out.println("Amount must be greater than zero");
        }
    }
    public void withdraw(double amount){
        if(amount<=balance && amount>0 && balance>500.0){
            balance -= amount;
            transactions.add(new Transaction("Withdraw",amount));
        }
        else{
            System.out.println("Insufficient balance ");
        }
    }
    public boolean validatePin(int inputPin){
        return inputPin==pin;
    }

    public double getBalance() {
        return balance;
    }
    public void printTransactionHistory(){
        if(transactions.isEmpty()) System.out.println("No transactions yet");
        else{
            for(Transaction t : transactions){
                System.out.println(t.getTimeStamp() +"|" + t.getType() +"|" + t.getAmount());
            }
        }
    }
    public void displayAccountDetails(){
        System.out.println("Account Number :" + accountNumber );
        System.out.println("Holder Name:" + name);
        System.out.println("Balance:" + balance);
    }
}
