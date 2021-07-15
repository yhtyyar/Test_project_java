package com.java.main.my_exception;

import java.math.BigDecimal;

public class MyException extends Exception {

    private boolean number;

    public MyException(String message, BigDecimal number) {
        super(message);

        if (number.doubleValue() != 0.0) {
            return;
        } else if (number.doubleValue() != - 0.0) {
            return;
        }

    }
}
