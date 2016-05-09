package gof.creational.prototype;

/**
 * Created by rtsy on 20.02.2016.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}