package com.todo;

import com.todo.task.TaskManager;
import com.todo.utils.InputManager;
import com.todo.utils.OutputManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class TodoController {
    private TaskManager taskManager;
    private OutputManager outputManager;
    private InputManager inputManager;

    @Autowired
    public TodoController(TaskManager taskManager, @Qualifier("outputManager1") OutputManager outputManager, InputManager inputManager) {
        this.taskManager = taskManager;
        this.outputManager = outputManager;
        this.inputManager = inputManager;
    }

    public void run() {
    }
}
