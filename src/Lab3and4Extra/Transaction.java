package Lab3and4Extra;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("\nType of transaction: ");
        if (this.type == 'W'){
            sb.append("Withdrawal");
        }else{
            sb.append("Deposit");
        }
        sb.append("\nTransaction amount: ").append(this.amount)
                        .append("\nBalance: ").append(this.balance)
                .append("\nDescription: ").append(this.description);
        return sb.toString();
    }
}
