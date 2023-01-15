package pl.edu.wszib.lab4;

@FunctionalInterface
public interface CommandHandler<TCommand> {
    void handle(TCommand command);
}
