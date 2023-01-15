package pl.edu.wszib.lab3.chainofresponsibility;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public record HttpRequest(
        String url,
        String method,
        Map<String, String> headers,
        Object body
) {
    public HttpRequest(
            final String url,
            final String method,
            final Map<String, String> headers,
            final Object body) {
        this.url = url;
        this.method = method.toUpperCase();
        this.headers = headers.entrySet().stream()
                .map(entry -> Map.entry(entry.getKey().toLowerCase(), entry.getValue().toLowerCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        this.body = body;
    }

    public String getHeader(final String header) {
        return headers.get(header.toLowerCase());
    }

    public boolean headerEquals(
            final String header,
            final String expectedValue) {
        return Optional.ofNullable(getHeader(header))
                .filter(headerValue -> headerValue.equalsIgnoreCase(expectedValue))
                .isPresent();
    }
}
