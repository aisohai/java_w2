package pl.edu.wszib.lab1.builder.autobuilder;

public class Application {

    public static void main(String[] args) {
        Address address = Address.builder()
                .street("Street")
                .city("Pawlowice")
                .number("1")
                .postalCode("43-250")
                .build();
        Person person = Person.builder()
                .firstName("Pawel")
                .lastName("Pustelnik")
                .age(28)
                .gender(Gender.MALE)
                .address(address)
                .build();
//        Person.create()
//        Person.male()
//        Person.female()
        System.out.println(person);
    }
}
