package com.company;

public class Calculator {
    private Calculator(){}

    public static int calculate(int number1, int number2, String operator){
        int result = 0;
        switch (operator){
            case "+": result = number1 + number2; break;
            case "-": result = number1 - number2; break;
            case "*": result = number1 * number2; break;
            case "/": result = number1 / number2; break;
            default:throw  new IllegalArgumentException("Неверный знак операции");
        }
        return result;
    }

}
