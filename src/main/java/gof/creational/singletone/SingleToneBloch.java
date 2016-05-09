package gof.creational.singletone;

/**
 * Created by rtsy on 21.02.2016.
 *
 * Joshua Bloch suggests to use ENUM starting from JDK 1.5
 * for singleton implementation.
 *
 */
public enum SingleToneBloch {
    INSTANCE;

    public static SingleToneBloch getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}