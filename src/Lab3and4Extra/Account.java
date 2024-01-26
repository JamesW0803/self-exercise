package Lab3and4Extra;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList <Transaction> transactions = new ArrayList<>();

    public Account(){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.1;
    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new java.util.Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }

    public double getMonthInterest(){
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount){
        if (balance < amount){
            System.out.println("Insufficient balance.");
            System.out.println();
            return;
        }
        balance -= amount;
        String description = "RM " + amount + " is successfully withdrawn.";
        Transaction t = new Transaction('W', amount, balance, description);
        transactions.add(t);
    }

    public void deposit(double amount){
        if (amount == 0.0){
            System.out.println("The deposit amount cannot be 0.");
            System.out.println();
            return;
        }
        balance += amount;
        String description = "RM " + amount + " is successfully deposited.";
        Transaction t = new Transaction('D', amount, balance, description);
        transactions.add(t);
    }

    public ArrayList <Transaction> getTransaction(){
        return transactions;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(this.id)
                .append("\nBalance: ").append(this.balance)
                .append("\nAnnual Interest Rate: ").append(this.annualInterestRate)
                .append("\nDate Created: ").append(this.dateCreated)
                .append("\nTransaction History: ");

        for (Transaction transaction : transactions) {
            sb.append("\n").append(transaction.toString());
        }
        sb.append("\n");
        return sb.toString();
    }
}
