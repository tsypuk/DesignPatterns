package gof.behavioral.command.broker;

/**
 * Created by rtsy on 21.03.2016.
 * To wrap a command in an object so that it can be stored, passed into methods, and returned like any other object.
 * -java.lang.Runnable
 -javax.swing.Action
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}