package pl.edu.wszib.lab2.decorator;

public abstract class AbstractOrderServiceDecorator implements OrderService {
    protected final OrderService orderService;

    protected AbstractOrderServiceDecorator(OrderService orderService) {
        this.orderService = orderService;
    }
}
