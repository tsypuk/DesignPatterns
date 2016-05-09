package gof.behavioral.visitor;

/**
 * Created by rtsy on 22.03.2016.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}