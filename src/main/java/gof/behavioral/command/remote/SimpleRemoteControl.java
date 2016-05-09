package gof.behavioral.command.remote;

import java.util.List;

/**
 * Created by rtsy on 21.03.2016.
 */
public class SimpleRemoteControl {
    Command[] slots = new Command[10];

    public void addCommand(Command command, int slotIndex) {
        if (slotIndex > slots.length) {
            throw new IllegalArgumentException("No such slot" + slotIndex);
        }
        slots[slotIndex] = command;
    }

    public void buttonWasPressed(int slotIndex) {
        slots[slotIndex].execute();
    }
}
