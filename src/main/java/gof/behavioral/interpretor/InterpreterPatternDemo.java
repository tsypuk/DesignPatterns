package gof.behavioral.interpretor;

import gof.behavioral.interpretor.impl.AndExpression;
import gof.behavioral.interpretor.impl.OrExpression;
import gof.behavioral.interpretor.impl.TerminalExpression;

/**
 * Created by rtsy on 21.03.2016.
 * Interpreter pattern provides a way to evaluate language grammar or expression.
 * This type of pattern comes under behavioral pattern.
 * This pattern involves implementing an expression interface which tells to interpret a particular context.
 * This pattern is used in SQL parsing, symbol processing engine etc.
 * -java.util.Pattern
 -java.text.Normalizer
 -java.text.Format
 */
public class InterpreterPatternDemo {

    //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married woman
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John Roberts"));
        System.out.println("Robert is male? " + isMale.interpret("Robert"));

        System.out.println("Julie is male? " + isMale.interpret("Julie"));

        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
        System.out.println("Anna is a married women? " + isMarriedWoman.interpret("Anna"));
    }
}