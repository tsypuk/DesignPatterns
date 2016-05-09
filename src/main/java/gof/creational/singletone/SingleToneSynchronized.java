package gof.creational.singletone;

/**
 * Created by rtsy on 21.02.2016.
 */
public class SingleToneSynchronized {
    private static SingleToneSynchronized instance;

    private SingleToneSynchronized() {
    }

    /**
     * Thread safe but:
     * But the problem is that only 1 thread has access to getInstance method at time. All other are
     * waiting. So if instance is initialized we are loozing time.
     */
    public static synchronized SingleToneSynchronized getInstance() {
        if (instance == null) {
            instance = new SingleToneSynchronized();
        }
        return instance;
    }
}