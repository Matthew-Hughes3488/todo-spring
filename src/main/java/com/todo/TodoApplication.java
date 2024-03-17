package com.todo;

import com.todo.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TodoApplication {

	private void buildAndStart(){
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TodoController controller = (TodoController) context.getBean("controller");
		controller.run();
	}

	public static void main(String[] args) {

		SpringApplication.run(TodoApplication.class, args);
	}

}
