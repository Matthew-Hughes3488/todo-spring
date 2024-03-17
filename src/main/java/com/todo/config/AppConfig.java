package com.todo.config;

import com.todo.utils.OutputManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.todo")
public class AppConfig {

    @Bean
    public OutputManager outputManager1() {
        String[] inputArray1 = {"New Task", "Set Task As Completed", "Delete Task", "List Tasks"};
        return new OutputManager(inputArray1);
    }

    @Bean
    public OutputManager outputManager2() {
        String[] inputArray2 = {"value4", "value5", "value6"};
        return new OutputManager(inputArray2);
    }

}
