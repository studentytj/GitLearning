package com.gitlearning.hanldegit.patterns.command.remote;

import com.gitlearning.hanldegit.patterns.command.Command;
import com.gitlearning.hanldegit.patterns.command.NoCommand;

import java.util.stream.IntStream;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command initialCommand = new NoCommand();
        IntStream.range(0, onCommands.length).forEach(i -> {
            onCommands[i] = initialCommand;
            offCommands[i] = initialCommand;
        });
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
    }
}
