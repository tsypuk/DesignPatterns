package gof.creational.builder;

/**
 * Created by rtsy on 20.02.2016.
 * -java.lang.StringBuilder#append()
 -java.lang.StringBuffer#append()
 -java.sql.PreparedStatement
 -javax.swing.GroupLayout.Group#addComponent()

 */
public class BuilderDemo {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("FIRST_NAME").city("CITY").lastName("LAST_NAME").streetAddress("STREET").createPerson();
        System.out.println(person);
    }
}
