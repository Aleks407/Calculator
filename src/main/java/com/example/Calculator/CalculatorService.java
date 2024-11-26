package com.example.Calculator;

public interface CalculatorService {
    String sayWelcome();

    String getSum(Integer num1, Integer num2);

    String getMinus(Integer num1, Integer num2);

    String getMultiply(Integer num1, Integer num2);

    String getDivide(Integer num1, Integer num2);
}
