package pl.edu.wszib.lab1.builder.autobuilder;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Person {
    abstract String firstName();

    abstract String lastName();

    abstract Integer age();

    abstract Gender gender();

    abstract Address address();

    static Builder builder() {
        return new AutoValue_Person.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {

        public abstract Builder firstName(String firstName);

        public abstract Builder lastName(String lastName);

        public abstract Builder age(Integer age);

        public abstract Builder gender(Gender gender);

        public abstract Builder address(Address address);

        public abstract Person build();
    }
}
