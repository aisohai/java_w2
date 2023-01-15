package pl.edu.wszib.lab4;

import pl.edu.wszib.lab4.order.OrderCreateCommand;
import pl.edu.wszib.lab4.order.OrderCreateCommandHandler;

import java.util.Map;
import java.util.UUID;

public class Application {

    public static void main(String[] args) {
        final CommandBus commandBus = new CommandBus(Map.of(
                OrderCreateCommand.class, new OrderCreateCommandHandler()
                // TODO task1: add new command - OrderItemAddCommand(orderId, productId, quantity)
        ));
        final OrderCreateCommand orderCreateCommand = new OrderCreateCommand(UUID.randomUUID().toString());
        commandBus.execute(orderCreateCommand);
    }
}
