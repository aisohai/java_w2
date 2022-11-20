package pl.edu.wszib.lab1.builder.record;

public class Application {

    public static void main(String[] args) {
        final Person male1 = Person.male(
                "Paweł",
                "Pustelnik",
                27,
                new Address("", "", "", "")
        );
        final Person female1 = Person.female(
                "Jagoda",
                "Pustelnik",
                27,
                new Address("", "", "", "")
        );

        final PersonFactory personFactory = new PersonFactory();
        final Person male2 = personFactory.male(
                "Paweł",
                "Pustelnik",
                27,
                new Address("", "", "", "")
        );
        final Person female2 = personFactory.female(
                "Jagoda",
                "Pustelnik",
                27,
                new Address("", "", "", "")
        );
    }
}
