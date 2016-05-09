package gof.structural.proxy;

import gof.structural.proxy.impl.ProxyImage;

/**
 * Created by rtsy on 21.03.2016.
 * In proxy pattern, a class represents functionality of another class.
 * This type of design pattern comes under structural pattern.
 * In proxy pattern, we create object having original object to interface its functionality to outer world.
 * Hibernate lazy init, spring proxy. MQ proxy.
 * -java.lang.reflect.Proxy
 -RMI
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}