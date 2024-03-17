package com.todo.utils;

import org.springframework.stereotype.Component;

import java.util.InputMismatchException;
import java.util.Scanner;
@Component
public class InputManager {

    private final Scanner SCANNER = new Scanner(System.in);


    public int getIntInput(int min, int max){
        while(true){
            try{
                int userInput = SCANNER.nextInt();

                if(!InputValidator.isValidIntInput(userInput, min, max))
                    throw new InputMismatchException(String.format("Number not in range of %d to %d", min, max));

                SCANNER.nextLine();
                return userInput;
            }catch (Exception e){
                System.out.println(e.getMessage());
                SCANNER.nextLine();
            }
        }
    }

    public String getStringInput(){
        while(true){
            try{
                String userInput = SCANNER.nextLine();

                if(!InputValidator.isValidString(userInput))
                    throw new InputMismatchException("String cannot be empty");

                return userInput;
            } catch (Exception e){
                System.out.println(e.getMessage());
                SCANNER.nextLine();
            }
        }
    }
}
