package gof.creational.singletone;

/**
 * Created by rtsy on 21.02.2016.
 */
public class SingleToneLazy {
    private static SingleToneLazy instance;

    private SingleToneLazy() {
    }

    /**
     *
     * The instance is initialized only on first call. This is useful when this initialization needs some time
     * for ex. services call, DB access and there is no sence to do this if the object is not using. So the first call
     * of getInstance will take more time then others after it.
     * This is not threadsafe implementation.
     */
    public static SingleToneLazy getInstance() {
        if (instance == null) {
            instance = new SingleToneLazy();
        }
        return instance;
    }
}