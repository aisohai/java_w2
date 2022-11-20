package pl.edu.wszib.lab1.builder;

public class Address {
    private final String city;
    private final String street;
    private final String number;
    private final String postalCode;

    private Address(final String city,
                    final String street,
                    final String number,
                    final String postalCode) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String city;
        private String street;
        private String number;
        private String postalCode;

        public Address build() {
            return new Address(
                    city,
                    street,
                    number,
                    postalCode
            );
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

    }
}
