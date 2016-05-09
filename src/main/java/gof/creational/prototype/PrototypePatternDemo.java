package gof.creational.prototype;

/**
 * Created by rtsy on 20.02.2016.
 * Prototype pattern refers to creating duplicate object while keeping performance in mind.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * This pattern involves implementing a prototype interface which tells to create a clone of the current object.
 * This pattern is used when creation of object directly is costly.
 * For example, an object is to be created after a costly database operation.
 * We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
 * -java.lang.Object#clone()
 -java.lang.Cloneable
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape(1L);
        clonedShape.draw();
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape(2L);
        clonedShape2.draw();
        System.out.println("Shape : " + clonedShape2.getType());
        System.out.println(clonedShape2.hashCode());
        clonedShape2 = ShapeCache.getShape(2L);
        System.out.println(clonedShape2.hashCode());

        Shape clonedShape3 = ShapeCache.getShape(3L);
        clonedShape3.draw();
        System.out.println("Shape : " + clonedShape3.getType());
    }
}