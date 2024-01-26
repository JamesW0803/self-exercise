package Lab7and8Extra;

class Stock {
    int shares;
    int price;

    public Stock(int shares, int price){
        this.shares = shares;
        this.price = price;
    }
}

public class StockCalculator{
    MyQueue <Stock> invest = new MyQueue<>();
    public void buy (int shares, int price){
        invest.enqueue(new Stock(shares, price));
    }

    public int sell (int shares, int price){
        int profit = 0;
        while (shares > 0){
            Stock stock = invest.peek();
            int sellShares = Math.min(shares, stock.shares);
            profit += sellShares * (price - stock.price);
            shares -= sellShares;
            stock.shares -= sellShares;
            if (stock.shares == 0){
                invest.dequeue();
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        StockCalculator stock = new StockCalculator();
        stock.buy(100,20);
        stock.buy(20,24);
        stock.buy(200,36);

        int profit = stock.sell(150, 30);
        System.out.println("Calculated profit: " + profit);
    }
}
