package gof.behavioral.mediator;

/**
 * Created by rtsy on 21.03.2016.
 * Mediator pattern is used to reduce communication complexity between multiple objects or classes.
 * This pattern provides a mediator class which normally handles all the communications
 * between different classes and supports easy maintenance of the code by loose coupling.
 * -java.util.Timer
 -java.util.concurrent.Executor#execute()
 -java.util.concurrent.ExecutorService#submit()
 -java.lang.reflect.Method#invoke()
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}