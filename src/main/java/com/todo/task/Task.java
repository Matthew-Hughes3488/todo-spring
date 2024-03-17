package com.todo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Task {
    private static int numberOfTasks = 0;
    private int taskId;
    private String task;
    private boolean isComplete;
    @Autowired
    public Task(String task){
        this.taskId = numberOfTasks++;
        this.task = task;
        isComplete = false;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getTaskId() {
        return taskId;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete() {
        isComplete = !isComplete;
    }
}
