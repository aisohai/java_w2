package pl.edu.wszib.lab2.adapter;

import pl.edu.wszib.lab2.adapter.toadapt.Order;

import java.util.List;

public class OrderAdapter {
    private final OrderService orderService;

    public OrderAdapter(OrderService orderService) {
        this.orderService = orderService;
    }

    public void handle(Order order) {
        pl.edu.wszib.lab2.adapter.Order adaptedOrder = adapt(order); //zad1
        orderService.handle(adaptedOrder);
    }
    private pl.edu.wszib.lab2.adapter.Order adapt(Order order){
        return new pl.edu.wszib.lab2.adapter.Order(
                order.id.id,
                adapt(order.items)
                );
    }

    private List<pl.edu.wszib.lab2.adapter.OrderItem> adapt(Set<Order>)

}
