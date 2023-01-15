package pl.edu.wszib.lab3.chainofresponsibility;

import java.util.Objects;

public class AcceptJsonOnlyFilter extends AbstractFilter {
    public AcceptJsonOnlyFilter(AbstractFilter next) {
        super(next);
    }

    @Override
    public boolean filter(HttpRequest request) {
        if (Objects.equals(request.method(), "POST")
                && Objects.equals(request.getHeader("Content-Type"), "application/json")) {
            return next.filter(request);
        }
        return false;
    }
}
