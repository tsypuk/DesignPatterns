package gof.creational.abstractfactory.impl;

import gof.creational.abstractfactory.Color;

/**
 * Created by rtsy on 20.02.2016.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Fill GREEN color");
    }
}
