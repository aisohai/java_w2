package pl.edu.wszib.lab1.builder;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.Random;
import java.util.logging.Logger;

public class Application {

    public static void main(String[] args) {
        Person.Builder personBuilder = Person.builder()
                .firstName("Pawel")
                .lastName("Pustelnik")
                .age(28)
                .gender(Gender.MALE);
        Address address = personBuilder.addressBuilder()
                .city("Pawlowice")
                .number("1")
                .postalCode("43-250")
                .build();
        personBuilder.address(address);
        MyRecord myRecord = new MyRecord("test", "myNewVar");
        myRecord.myNewVar();

        try {
            myMethod();
        } catch (ConnectException | SocketTimeoutException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static void myMethod() throws ConnectException, SocketTimeoutException {
        if (new Random().nextBoolean()) {
            throw new ConnectException();
        } else {
            throw new SocketTimeoutException();
        }
    }
}

