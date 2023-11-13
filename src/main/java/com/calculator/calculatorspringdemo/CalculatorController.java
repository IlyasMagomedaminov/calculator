package com.calculator.calculatorspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping()
    public String greeting() {
        return service.greeting();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return service.plus(a, b);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return service.minus(a, b);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return service.multiply(a, b);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return service.divide(a, b);
    }
}



