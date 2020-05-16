package com.JD1;

public class FactorialTest {
    public static void main(String[] args) {
        FactorialDemo ob = new FactorialDemo();
       int result = ob.fact(5);
        System.out.println("Factorial of 5 =  "+result);

        int result1 = ob.fact(4);
        System.out.println("Factorial of 4 =  "+result1);
    }
}
