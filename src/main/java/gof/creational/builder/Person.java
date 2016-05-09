package gof.creational.builder;

/**
 * Created by rtsy on 20.02.2016.
 */
public class Person {
    private final String lastName;
    private final String firstName;
    private final String streetAddress;
    private final String city;

    public Person(
            final String newLastName,
            final String newFirstName,
            final String newStreetAddress,
            final String newCity) {
        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.streetAddress = newStreetAddress;
        this.city = newCity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String nestedLastName;
        private String nestedFirstName;
        private String nestedStreetAddress;
        private String nestedCity;

        public PersonBuilder(final String newFirstName) {
            this.nestedFirstName = newFirstName;
        }

        public PersonBuilder lastName(String newLastName) {
            this.nestedLastName = newLastName;
            return this;
        }

        public PersonBuilder streetAddress(String newStreetAddress) {
            this.nestedStreetAddress = newStreetAddress;
            return this;
        }

        public PersonBuilder city(String newCity) {
            this.nestedCity = newCity;
            return this;
        }

        public Person createPerson() {
            return new Person(nestedLastName, nestedFirstName, nestedStreetAddress, nestedCity);
        }
    }
}