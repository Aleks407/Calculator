package com.example.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class Controller {
    public final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "calculator")
    public String sayWelcome() {
        return calculatorService.sayWelcome();
    }

    @GetMapping(path = "/plus")
    public String getSum(@RequestParam(required = false)  Integer num1, @RequestParam(required = false)  Integer num2) {
        return calculatorService.getSum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String getMinus(@RequestParam(required = false)  Integer num1, @RequestParam(required = false)  Integer num2) {
        return calculatorService.getMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String getMultiply(@RequestParam(required = false)  Integer num1, @RequestParam(required = false)  Integer num2) {
        return calculatorService.getMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String getDivide(@RequestParam(required = false) Integer num1, @RequestParam(required = false)Integer num2) {
        return calculatorService.getDivide(num1, num2);
    }


}



