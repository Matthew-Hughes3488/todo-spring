package com.todo;

import com.todo.task.TaskManager;
import com.todo.utils.InputManager;
import com.todo.utils.OutputManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class TodoController {
    private final TaskManager taskManager;
    private final OutputManager outputManager;
    private final InputManager inputManager;

    @Autowired
    public TodoController(TaskManager taskManager, @Qualifier("outputManager1") OutputManager outputManager, InputManager inputManager) {
        this.taskManager = taskManager;
        this.outputManager = outputManager;
        this.inputManager = inputManager;
    }

    public void run() {

        while (true){
            outputManager.printCommands();
            System.out.println("Please enter your command: ");

            int input = inputManager.getIntInput(0, 3);
            if(!processInput(input))
                break;
        }
    }

    private boolean processInput(int input) {

        switch (input){
            case 0:
                processNewTask();
                return true;
            case 1:
                processSetTaskComplete();
                return true;
            case 2:
                processDeleteTask();
                return true;
            case 3:
                processListTasks();
                return true;
            case 4:
                return false;
        }

        return false;
    }

    private void processListTasks() {
        System.out.println(taskManager);
    }

    private void processDeleteTask() {
    }

    private void processSetTaskComplete() {
    }

    private void processNewTask() {
        System.out.println("Enter your new task");
        String task = inputManager.getStringInput();
        taskManager.addTask(task);
    }
}
