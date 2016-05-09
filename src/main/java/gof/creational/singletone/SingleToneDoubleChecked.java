package gof.creational.singletone;

/**
 * Created by rtsy on 21.02.2016.
 * -java.lang.Runtime#getRuntime()
 -java.awt.Toolkit#getDefaultToolkit()
 -java.awt.GraphicsEnvironment#getLocalGraphicsEnvironment()
 -java.awt.Desktop#getDesktop()
 */
public class SingleToneDoubleChecked {
    private static SingleToneDoubleChecked instance;

    private SingleToneDoubleChecked() {
    }

    /**
     * Thread safe but:
     * But the problem is that only 1 thread has access to getInstance method at time. All other are
     * waiting. So if instance is initialized we are loosing time.
     */
    public static SingleToneDoubleChecked getInstance() {
        if (instance == null) {
            /* The double check to make sure that instance is not created at the parallel thread at the same time.
            We are synchronising the code block not the all method to galatea that there would not be case with another singleton instance created.
             */
            synchronized (SingleToneDoubleChecked.class) {
                if (instance == null) {
                    instance = new SingleToneDoubleChecked();
                }
            }
        }
        return instance;
    }
}