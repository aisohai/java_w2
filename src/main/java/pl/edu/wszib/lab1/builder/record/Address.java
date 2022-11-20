package pl.edu.wszib.lab1.builder.record;

import com.google.auto.value.AutoBuilder;

public record Address(
        String city,
        String street,
        String number,
        String postalCode
) {

    static Builder builder() {
        return new AutoBuilder_Address_Builder();
    }

    @AutoBuilder
    interface Builder {
        Address.Builder city(String city);

        Address.Builder street(String street);

        Address.Builder number(String number);

        Address.Builder postalCode(String postalCode);

        Address build();
    }
}
