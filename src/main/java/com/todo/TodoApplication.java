package com.todo;

import com.todo.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TodoApplication.class, args);
		TodoController controller = context.getBean(TodoController.class);
		controller.run();
	}
}
