package com.todo.task;

import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(String task){
        tasks.add(new Task(task));
    }

    public void removeTask(int taskId){
        tasks.removeIf(task -> task.getTaskId() == taskId);
    }

}
