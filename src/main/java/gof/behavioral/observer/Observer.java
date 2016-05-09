package gof.behavioral.observer;

/**
 * Created by rtsy on 22.03.2016.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}