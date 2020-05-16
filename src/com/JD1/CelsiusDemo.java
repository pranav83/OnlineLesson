package com.JD1;

import java.util.Scanner;

public class CelsiusDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fahren,cels;
        System.out.print("Fahrenheit : ");
        fahren = input.nextDouble();

        cels = fahren * 1.8 + 32;
        System.out.println("Celsius : " + cels);
    }
}
