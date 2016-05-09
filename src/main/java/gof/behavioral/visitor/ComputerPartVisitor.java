package gof.behavioral.visitor;

import gof.behavioral.visitor.impl.Computer;
import gof.behavioral.visitor.impl.Keyboard;
import gof.behavioral.visitor.impl.Monitor;
import gof.behavioral.visitor.impl.Mouse;

/**
 * Created by rtsy on 22.03.2016.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}