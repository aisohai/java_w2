package pl.edu.wszib.lab4;

import pl.edu.wszib.lab4.order.OrderCreateCommand;
import pl.edu.wszib.lab4.order.OrderFacade;
import pl.edu.wszib.lab4.order.OrderItemAddCommand;

import java.util.Map;
import java.util.UUID;

public class Application {

    public static void main(String[] args) {
        final OrderFacade orderFacade = new OrderFacade();
        final CommandBus commandBus = new CommandBus(Map.of(
                OrderCreateCommand.class, (CommandHandler<OrderCreateCommand>) orderFacade::create,
                OrderItemAddCommand.class, (CommandHandler<OrderItemAddCommand>) orderFacade::addItem
        ));
        final OrderCreateCommand orderCreateCommand = new OrderCreateCommand(UUID.randomUUID().toString());
        commandBus.execute(orderCreateCommand);

        OrderItemAddCommand orderItemAddCommand = new OrderItemAddCommand(UUID.randomUUID().toString(), UUID.randomUUID().toString());
        commandBus.execute(orderItemAddCommand);
    }
}
