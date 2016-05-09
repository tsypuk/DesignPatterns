package gof.creational.prototype;

import java.util.Hashtable;

/**
 * Created by rtsy on 20.02.2016.
 */
public class ShapeCache {

    private static Hashtable<Long, Shape> shapeMap  = new Hashtable<Long, Shape>();

    public static Shape getShape(Long shapeId) {
        return (Shape) shapeMap.get(shapeId).clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1L);
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId(2L);
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(3L);
        shapeMap.put(rectangle.getId(), rectangle);
    }
}