package gof.behavioral.command.broker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rtsy on 21.03.2016.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}