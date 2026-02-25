
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Bank bank = new Bank();
        while(true){
            System.out.println("Enter choice");
            System.out.println(" 1. Create Account\n " +
                    "2. Login\n" +
                    "3. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Account Number");
                    int accNo=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name");
                    String name= sc.nextLine();
                    System.out.println("Enter PIN");
                    int pin= sc.nextInt();
                    bank.createAccount(accNo,name,pin);
                    System.out.println("Account Created Successfully!");
                    break;
                case 2:
                    System.out.println("Enter Account Number");
                    accNo = sc.nextInt();
                    System.out.println("Enter PIN");
                    pin = sc.nextInt();
                    Account acc= bank.getAccount(accNo);
                    if(acc == null) System.out.println("Account not FOUND!");
                    else if(acc.validatePin(pin)){
                        System.out.println("Login successful");
                        while(true) {
                            System.out.println("Enter choice");
                            System.out.println("1.Deposit\n" +
                                    "2. withdraw\n" +
                                    "3. check balance\n" +
                                    "4. history\n" +
                                    "5. View Account Details\n" +
                                    "6. logout");
                            int loggedChoice = sc.nextInt();
                            switch (loggedChoice) {
                                case 1:
                                    System.out.println("enter amount you want to deposit");
                                    double amount = sc.nextDouble();
                                    acc.deposit(amount);
                                    System.out.println("Amount Deposit Successfully!");
                                    break;
                                case 2:
                                    System.out.println("enter amount you want to withdraw");
                                    amount = sc.nextDouble();
                                    acc.withdraw(amount);
                                    System.out.println("WithDrawl Successfull!");
                                    break;
                                case 3:
                                    System.out.println("Your Balance is" + acc.getBalance());
                                    break;
                                case 4:
                                    System.out.println("Your history is ");
                                    acc.printTransactionHistory();
                                    break;
                                case 5:
                                    System.out.println("Your Account Details are:");
                                    acc.displayAccountDetails();
                                    break;

                            }
                            if (loggedChoice == 6) {
                                System.out.println("Logging out...");
                                break;
                            }
                        }
                    }else{
                        System.out.println("Incorrect PIN");
                    }
                    break;
                case 3:
                    System.out.println("Thankyou!");
                    return;
            }
        }
    }
}