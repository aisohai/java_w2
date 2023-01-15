package pl.edu.wszib.lab4.order;

public class OrderFacade {

    public void create(OrderCreateCommand command) {
        System.out.println("Real impl for command = " + command);
    }

    public void addItem(OrderItemAddCommand command) {
        System.out.println("Real impl for command = " + command);
    }
}
