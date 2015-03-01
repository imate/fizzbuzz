package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        String message = "";
        if (number % 3 == 0) {
            message += "fizz";
        }
        if (number % 5 == 0) {
            message += "buzz";
        }
        if (number % 7 == 0) {
            message += "wizz";
        }

        if (String.valueOf(number).contains("3")) {
            message += "fizz";
        }

        if (message.isEmpty()) {
            message += number;
        }
        return message;
    }

}
