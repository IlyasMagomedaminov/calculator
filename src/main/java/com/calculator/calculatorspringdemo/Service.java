package com.calculator.calculatorspringdemo;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Service
public class Service {

    public String greeting(){
        return "<b>Добро пожаловать в калькулятор </b>";
    }


    public String plus(@RequestParam("num1") String a,@RequestParam("num2") String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int  r = num1 + num2;
        return a+"+"+b+"="+r;
    }


    public String minus(@RequestParam("num1") String a,@RequestParam("num2") String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int  r = num1 - num2;
        return a+"-"+b+"="+r;
    }


    public String multiply(@RequestParam("num1") String a,@RequestParam("num2") String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int  r = num1 * num2;
        return a+"*"+b+"="+r;
    }


    public String divide(@RequestParam("num1") String a,@RequestParam("num2") String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int  r = num1 / num2;
        return a+"/"+b+"="+r;
    }
}
