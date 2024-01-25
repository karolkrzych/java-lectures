package com.company;

import java.io.IOException;

public class ImpossibleFigureException extends IOException {

    @Override
    public String getMessage() {
        return "This is not figure.";
    }
}
