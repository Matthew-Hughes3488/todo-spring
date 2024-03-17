package com.todo.utils;

import org.springframework.stereotype.Component;

@Component
public class InputValidator {

    public static boolean isValidIntInput(int input, int min, int max){

        return input >= min && input <=max;
    }

    public static boolean isValidString(String input){
        return !input.isBlank();
    }

}
