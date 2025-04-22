package main;

import calc.Calculator;
public class Main extends Calculator{

    public static void main(String[] args) {
        Calculator c=new Calculator(10, 2, 10&2);
        System.out.println(c);
        c.add();
        System.out.println("value of num1+num2 =" +getAnswer());
        c.subt();
        System.out.println("value of num1-num2 =" +getAnswer());
        c.mult();
        System.out.println("value of num1*num2 =" +getAnswer());
        c.divide();
        System.out.println("value of num1/num2 =" +getAnswer());
    }
}