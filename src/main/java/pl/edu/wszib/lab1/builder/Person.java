package pl.edu.wszib.lab1.builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Gender gender;
    private final Address address;

    private Person(final String firstName,
                   final String lastName,
                   final Integer age,
                   final Gender gender,
                   final Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public static Person.Builder builder() {
        return new Person.Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private Integer age;
        private Gender gender;
        private Address address;

        public Person build() {
            return new Person(
                    firstName,
                    lastName,
                    age,
                    gender,
                    address
            );
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }
        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }
        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Address.Builder addressBuilder() {
            return Address.builder();
        }
    }
}
