package com.todo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OutputManager {
    private final String[] commands;
    @Autowired
    public OutputManager(String[] commands) {
        this.commands = commands;
    }

    public void printCommands(){
        for (int i = 0; i < commands.length; i++) {
            System.out.printf("%d: %s%n", i, commands[i]);
        }
    }
}
