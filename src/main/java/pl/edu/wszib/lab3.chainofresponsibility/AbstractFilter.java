package pl.edu.wszib.lab3.chainofresponsibility;

public abstract class AbstractFilter {
    protected final AbstractFilter next;

    public AbstractFilter(
            final AbstractFilter next
    ) {
        this.next = next;
    }

    public abstract boolean filter(final HttpRequest request);
}
