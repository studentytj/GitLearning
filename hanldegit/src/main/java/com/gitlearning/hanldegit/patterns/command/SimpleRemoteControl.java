package com.gitlearning.hanldegit.patterns.command;


import lombok.Setter;

/**
 *
 */
@Setter
class SimpleRemoteControl {
    Command command;

    public void buttonWasPressed() {
        command.execute();
    }
}