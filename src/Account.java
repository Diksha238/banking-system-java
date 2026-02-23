public class Account {
    private int accountNumber;
    private String name;
    private int pin;
    private double balance;
    public Account(int accountNumber,String name,int pin){

        this.accountNumber=accountNumber;
        this.pin=pin;
        this.name=name;
        this.balance=0.0;

    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public void deposit(double amount){
        if(amount>0){
            balance+=amount;

        }
        else{
            System.out.println("Amount must be greater than zero");
        }
    }
    public void withdraw(double amount){
        if(amount<=balance && amount>0){
            balance -= amount;

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
}
