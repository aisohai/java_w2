package pl.edu.wszib.lab3.chainofresponsibility;

public class HttpsOnlyFilter extends AbstractFilter {

    public HttpsOnlyFilter(AbstractFilter next) {
        super(next);
    }

    @Override
    public boolean filter(HttpRequest request) {
        if (request.url().startsWith("https://")) {
            return next.filter(request);
        }
        return false;
    }
}
