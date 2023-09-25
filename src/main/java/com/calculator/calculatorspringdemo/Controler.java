package com.calculator.calculatorspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    private final Service service;
    public Controler(Service service){
        this.service = service;
    }

    @GetMapping(path ="/calculator")
    public String greeting(){
        return service.greeting();
    }

    @GetMapping(path ="/calculator/plus")
    public String plus(@RequestParam("num1") String a,@RequestParam("num2") String b){

        return service.plus(a,b);
    }

    @GetMapping(path ="/calculator/minus")
    public String minus(@RequestParam("num1") String a,@RequestParam("num2") String b){

        return service.minus(a,b);
    }

    @GetMapping(path ="/calculator/multiply")
    public String multiply(@RequestParam("num1") String a,@RequestParam("num2") String b){

        return service.multiply(a,b);
    }

    @GetMapping(path ="/calculator/divide")
    public String divide(@RequestParam("num1") String a,
                       @RequestParam("num2") String b){

        return service.divide(a,b);
    }



}
