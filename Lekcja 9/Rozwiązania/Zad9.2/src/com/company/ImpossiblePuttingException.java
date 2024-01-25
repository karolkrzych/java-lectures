package com.company;

public class ImpossiblePuttingException extends Exception{

    @Override
    public String getMessage() {
        return ("Putting is impossible");
    }
}
