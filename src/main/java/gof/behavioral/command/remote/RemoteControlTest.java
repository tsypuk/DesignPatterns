package gof.behavioral.command.remote;

import gof.behavioral.command.remote.impl.GarageDoorOpenCommand;
import gof.behavioral.command.remote.impl.Light;
import gof.behavioral.command.remote.impl.LightOnCommand;

/**
 * Created by rtsy on 21.03.2016.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.addCommand(lightOn, 0);

        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand();
        remote.addCommand(garageOpen, 1);
        remote.buttonWasPressed(0);
        remote.buttonWasPressed(1);
    }
}
