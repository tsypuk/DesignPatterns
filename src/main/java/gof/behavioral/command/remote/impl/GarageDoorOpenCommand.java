package gof.behavioral.command.remote.impl;

import gof.behavioral.command.remote.Command;

/**
 * Created by rtsy on 21.03.2016.
 */
public class GarageDoorOpenCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Garage door is open");
    }
}
