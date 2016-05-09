package gof.creational.prototype;

/**
 * Created by rtsy on 20.02.2016.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}