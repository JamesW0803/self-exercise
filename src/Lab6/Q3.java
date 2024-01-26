package Lab6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3 {
    public static void main(String[] args) {
        MyQueue<Trade> queue = new MyQueue<>();
        Scanner sc = new Scanner(System.in);
        int profit = 0;

        //do regex match
        Pattern pattern = Pattern.compile("^(Buy|Sell) (\\d+) shares at \\$(\\d+) each$");
        do {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each') or 'End' to end: ");
            String input = sc.nextLine();
            //end input
            if(input.equals("End")) break;
            Matcher matcher = pattern.matcher(input);

            if(!matcher.find()){ //not match regex
                System.out.println("\nNot in format.");
                continue;
            }

            //match regex and get the variables
            String action = matcher.group(1);
            int amount = Integer.parseInt(matcher.group(2));
            int price = Integer.parseInt(matcher.group(3));

            if (amount <= 0){
                System.out.println("\nAmount to carry out cannot be 0 or negative.");
                continue;
            }

            if (action.toLowerCase().equals("buy")) {
                // enqueue the trade
                queue.enqueue(new Trade(amount, price));
            } else if (action.toLowerCase().equals("sell")) {
                do {
                    Trade first = queue.peek();

                    if (queue.isEmpty()){
                        break;
                    }

                    // amount is smaller or equal than first in queue
                    if (amount <= first.getShares()){
                        // directly sell
                        profit += first.sell(amount, price);
                        // remove if first is sold out
                        if (first.getShares() == 0)
                            queue.dequeue();
                        // set 0 since sold amount required
                        amount = 0;
                    } else {
                        // amount is greater than first in queue
                        // deduct the amount sold
                        amount -= first.getShares();
                        // remove from queue, sell everything
                        profit += queue.dequeue().sellAll(price);
                    }
                } while(amount > 0);
            }

            if (queue.isEmpty()){
                System.out.println("\nNo more stocks to sell.");
                break;
            } else {
                System.out.println("\nYou has: " + queue.toString());
            }
        } while(true);
        sc.close();
        System.out.println("==== Transaction ended ====");
        System.out.println("Final capital gain/loss: $" + Integer.toString(profit));
    }
}

class Trade{
    private int shares, price;

    public Trade(int shares, int price){
        this.shares = shares;
        this.price = price;
    }

    public int getShares(){
        return shares;
    }

    public void set(int shares, int price){
        this.shares = shares;
        this.price = price;
    }

    /**
     * Return the profit or loss when selling shares at specific price, the amount of shares stored will be reduced by the amount of shares sold
     * @param shares amount of shares
     * @param price price to sell at
     * @return profit/deficit of selling shares at specific price
     */
    public int sell(int shares, int price){
        if(shares > this.shares)
            //limit amount of shares to be sold to current amount of shares
            shares = this.shares;
        // deduct shares sold
        this.shares -= shares;
        return shares * (price - this.price);
    }

    /**
     * Return the profit or loss when selling all available shares at specific price
     * @param price price to sell at
     * @return profit/deficit of selling shares at specific price
     */
    public int sellAll(int price){
        return this.sell(this.shares, price);
    }

    @Override
    public String toString() {
        return String.format("%d shares at $%d", this.shares, this.price);
    }
}
