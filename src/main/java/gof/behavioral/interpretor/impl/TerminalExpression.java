package gof.behavioral.interpretor.impl;

import gof.behavioral.interpretor.Expression;

/**
 * Created by rtsy on 21.03.2016.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        if(context.contains(data)){
            return true;
        }
        return false;
    }
}