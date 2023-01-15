package pl.edu.wszib.lab4.order;

import pl.edu.wszib.lab4.Command;

public record OrderItemAddCommand(
        String orderId,
        String productId
) implements Command {
}
