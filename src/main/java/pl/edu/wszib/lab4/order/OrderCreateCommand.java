package pl.edu.wszib.lab4.order;

import pl.edu.wszib.lab4.Command;

public record OrderCreateCommand(
        String id
) implements Command {

}
