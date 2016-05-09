package gof.behavioral.visitor.impl;

import gof.behavioral.visitor.ComputerPart;
import gof.behavioral.visitor.ComputerPartVisitor;

/**
 * Created by rtsy on 22.03.2016.
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}