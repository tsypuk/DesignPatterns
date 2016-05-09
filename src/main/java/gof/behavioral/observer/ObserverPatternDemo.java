package gof.behavioral.observer;

/**
 * Created by rtsy on 22.03.2016.
 *
 * Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified,
 * its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.
 * -java.util.EventListener
 -javax.servlet.http.HttpSessionBindingListener
 -javax.servlet.http.HttpSessionAttributeListener
 -javax.faces.event.PhaseListener
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Subject subject2 = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        new BinaryObserver(subject2);
        new OctalObserver(subject2);

        System.out.println("Subject1 First state change: 15");
        subject.setState(15);
        System.out.println("Subject1 Second state change: 10");
        subject.setState(10);

        System.out.println("Subject2 255");
        subject2.setState(255);
    }
}