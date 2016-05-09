package gof.structural.facade;

import gof.structural.facade.impl.Circle;
import gof.structural.facade.impl.Rectangle;
import gof.structural.facade.impl.Square;

/**
 * Created by rtsy on 21.03.2016.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

    public void drawPicture() {
        System.out.println("Drawing a picture.");
        square.draw();
        rectangle.draw();
        circle.draw();
    }
}