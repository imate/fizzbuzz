package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String message = "";
            if (number % 3 == 0) {
                message += "fizz";
            }
            if (number % 5 == 0) {
                message += "buzz";
            }
            if (message.isEmpty()) {
                message=number+"";
            }
        
        return message;
    }

}
