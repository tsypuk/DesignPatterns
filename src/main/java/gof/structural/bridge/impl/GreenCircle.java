package gof.structural.bridge.impl;

import gof.structural.bridge.DrawAPI;

/**
 * Created by rtsy on 21.03.2016.
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
