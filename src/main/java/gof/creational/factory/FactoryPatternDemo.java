package gof.creational.factory;

/**
 * Created by rtsy on 20.02.2016.
 * -java.lang.Proxy#newProxyInstance()
 -java.lang.Object#toString()
 -java.lang.Class#newInstance()
 -java.lang.reflect.Array#newInstance()
 -java.lang.reflect.Constructor#newInstance()
 -java.lang.Boolean#valueOf(String)
 -java.lang.Class#forName()

 */
public class FactoryPatternDemo {

    public static void main(String[] args)
            throws InterruptedException {

        //get an object of Circle and call its draw method.
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        //get an object of Rectangle and call its draw method.
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        //get an object of Square and call its draw method.
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }
}