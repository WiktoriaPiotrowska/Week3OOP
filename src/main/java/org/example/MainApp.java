package org.example;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter your 1st number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter your 2nd number: ");
        int secondNumber = scan.nextInt();

        calculator calc = new calculator();
       int result = calc.add(firstNumber, secondNumber);
       System.out.println( "The result is: " + result);


    }
}
