package pl.edu.wszib.lab4;

import java.util.HashMap;
import java.util.Map;

public class CommandBus {
    private final Map<Class<? extends Command>, CommandHandler<? extends Command>> handlers = new HashMap<>();

    public CommandBus(
            Map<Class<? extends Command>, CommandHandler<? extends Command>> handlers
    ) {
        this.handlers.putAll(handlers);
    }

    public <TCommand extends Command> void execute(final TCommand command) {
        final CommandHandler<TCommand> commandHandler = (CommandHandler<TCommand>) handlers.get(command.getClass());
        if (commandHandler == null) {
            throw new IllegalStateException("No commandHandler found for command =" + command);
        }
        commandHandler.handle(command);
    }
}
