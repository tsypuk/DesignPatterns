package gof.behavioral.strategy;

/**
 * Created by rtsy on 22.03.2016.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}