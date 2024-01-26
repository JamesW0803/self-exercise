package Lab1Extra;

import java.util.Date;
import java.util.Scanner;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

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
        System.out.printf("RM %.2f is successfully withdrawn.", amount);
        System.out.println();
    }

    public void deposit(double amount){
        if (amount == 0.0){
            System.out.println("The deposit amount cannot be 0.");
            System.out.println();
            return;
        }
        balance += amount;
        System.out.printf("RM %.2f is successfully deposited.", amount);
        System.out.println();
    }

    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000, 4.5);
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.printf("The current balance: RM %.2f", account1.getBalance());
        System.out.println();
        System.out.println("The monthly interest: " + account1.getMonthInterest());
        System.out.println("The date of the account created: " + account1.getDateCreated());

        Account[] accountList = new Account[10];
        for (int i = 0; i < 10; i++){
            accountList[i] = new Account(i, 100, 10);
        }

        promptID(accountList);

        System.out.println("Enter ID: ");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
        if (ID < 0 || ID > 9){
            System.out.println("Invalid ID");
            return;
        }else{
            System.out.println("""
                    === Main Menu ===
                    1: View current balance
                    2: Withdraw
                    3: Deposit
                    4: Exit
                    """);
            int input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("Current balance: " + accountList[ID].getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    accountList[ID].withdraw(withdraw);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = sc.nextDouble();
                    accountList[ID].deposit(deposit);
                    break;
                default:

            }
        }
    }

    private static void promptID(Account[] accountList) {
        System.out.print("Enter ID: ");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
        if (ID < 0 || ID > 9){
            System.out.println("Invalid ID.");
            return;
        }
        displayMenu(accountList, ID);
    }

    private static void displayMenu(Account[] accountList, int id) {
        System.out.println("""
                === Main Menu ===
                1. View Current Balance
                2. Withdraw
                3. Deposit
                4. Exit
                """);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input){
            case 1:
                System.out.println("Current balance: " + accountList[id].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                double withdraw = sc.nextDouble();
                accountList[id].withdraw(withdraw);
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                double deposit = sc.nextDouble();
                accountList[id].deposit(deposit);
                break;
            default:
                promptID(accountList);
        }
        displayMenu(accountList, id);
    }
}
