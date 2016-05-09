package gof.creational.abstractfactory.impl;

import gof.creational.abstractfactory.Color;

/**
 * Created by rtsy on 20.02.2016.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill RED color");
    }
}
