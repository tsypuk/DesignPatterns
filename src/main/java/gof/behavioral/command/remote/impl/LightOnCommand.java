package gof.behavioral.command.remote.impl;

import gof.behavioral.command.remote.Command;

/**
 * Created by rtsy on 21.03.2016.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
