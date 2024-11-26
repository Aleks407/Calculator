package com.example.Calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorImpl implements CalculatorService {

    public String sayWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String getSum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите оба значения ";
        }
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    public String getMinus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите оба значения ";
        }
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }

    public String getMultiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите оба значения ";
        }
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    public String getDivide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите оба значения ";
        }
        if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        float result = (float) num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }
}
