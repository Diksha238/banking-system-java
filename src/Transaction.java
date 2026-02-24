import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private String timestamp;
    private double amount;
    public Transaction(String type,double amount){
        this.type=type;
        this.amount=amount;
        this.timestamp= LocalDateTime.now().toString();
    }

    public String getType() {
        return type;
    }

    public String getTimeStamp() {
        return timestamp;
    }

    public double getAmount() {
        return amount;
    }
}
