package pl.edu.wszib.lab4;

public interface CommandHandler<TCommand> {
    void handle(TCommand command);
}
