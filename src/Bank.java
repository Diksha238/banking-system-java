import java.util.HashMap;

public class Bank {
    private HashMap<Integer,Account> accounts;
    public Bank(){
        accounts=new HashMap<>();
    }
    public void createAccount(int accNo,String name,int pin){
        if(accounts.containsKey(accNo)) System.out.println("Account already exists");
        else{
            Account acc = new Account(accNo,name,pin);
            accounts.put(accNo,acc);
        }
    }

    public Account getAccount(int accNo) {
        return accounts.get(accNo);
    }
}
