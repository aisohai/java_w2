package pl.edu.wszib.lab4.order;

import pl.edu.wszib.lab4.CommandHandler;

public class OrderCreateCommandHandler implements CommandHandler<OrderCreateCommand> {
    @Override
    public void handle(OrderCreateCommand command) {
        System.out.println("Real impl for command = " + command);
    }
}
