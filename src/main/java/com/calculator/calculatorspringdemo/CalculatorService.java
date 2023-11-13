package com.calculator.calculatorspringdemo;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Service
public class CalculatorService {

    public String greeting(){
        return "<b>Добро пожаловать в калькулятор </b>";
    }


    public String plus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b){
        int num1 = Integer.parseInt(String.valueOf(a));
        int num2 = Integer.parseInt(String.valueOf(b));
        int  r = num1 - num2;
        return a+"-"+b+"="+r;
    }


    public String minus(@RequestParam("num1") Integer a,@RequestParam("num2") Integer b){
        int num1 = Integer.parseInt(String.valueOf(a));
        int num2 = Integer.parseInt(String.valueOf(b));
        int  r = num1 - num2;
        return a+"-"+b+"="+r;
    }


    public String multiply(@RequestParam("num1") Integer a,@RequestParam("num2") Integer b){
        int num1 = Integer.parseInt(String.valueOf(a));
        int num2 = Integer.parseInt(String.valueOf(b));
        int  r = num1 * num2;
        return a+"*"+b+"="+r;
    }


    public String divide(@RequestParam("num1") Integer a,@RequestParam("num2") Integer b){
        int num1 = Integer.parseInt(String.valueOf(a));
        int num2 = Integer.parseInt(String.valueOf(b));
        int  r = num1 / num2;
        return a+"/"+b+"="+r;
    }
}
