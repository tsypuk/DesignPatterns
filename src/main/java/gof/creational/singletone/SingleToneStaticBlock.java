package gof.creational.singletone;

/**
 * Created by rtsy on 21.02.2016.
 */
public class SingleToneStaticBlock {
    private static final SingleToneStaticBlock instance;

    static {
        instance = new SingleToneStaticBlock();
    }

    private SingleToneStaticBlock() {
    }

    public static SingleToneStaticBlock getInstance() {
        return instance;
    }
}