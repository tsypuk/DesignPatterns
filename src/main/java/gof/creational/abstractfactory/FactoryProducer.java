package gof.creational.abstractfactory;

/**
 * Created by rtsy on 20.02.2016.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if ("SHAPE".equals(choice.toUpperCase())) {
            return new ShapeFactory();
        } else if ("COLOR".equals(choice.toUpperCase())) {
            return new ColorFactory();
        }
        return null;
    }
}