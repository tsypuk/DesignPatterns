package gof.structural.flyweight;

import gof.structural.flyweight.impl.Circle;

/**
 * Created by rtsy on 21.03.2016.
 * Flyweight pattern is primarily used to reduce the number of objects created and
 * to decrease memory footprint and increase performance.
 * This type of design pattern comes under structural pattern as this pattern provides
 * ways to decrease object count thus improving the object structure of application.
 * Flyweight pattern tries to reuse already existing similar kind objects by storing them and
 * creates java8 object when no matching object is found.
 *
 * All the wrapper classes valueOf() method uses cached objects showing use of Flyweight design pattern. The best example is Java String class String Pool implementation.
 * -java.lang.Integer#valueOf(int)
 -java.lang.Boolean#valueOf(boolean)
 -java.lang.Byte#valueOf(byte)
 -java.lang.Character#valueOf(char)
 */
public class FlyweightPatternDemo {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.draw(getRandomX(), getRandomY(), 100);
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}