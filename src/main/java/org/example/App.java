package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "What is the first number? " );
        int num1 = scanner.nextInt();

        System.out.print( "What is the second number? " );
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1* num2;
        int quo = num1/ num2;

        System.out.printf("%d + %d = %d%n" +
                "%d - %d = %d%n"+
                "%d * %d = %d%n"+
                "%d / %d = %d%n",
                num1, num2, sum,
                num1, num2, diff,
                num1, num2, prod,
                num1, num2, quo );
    }
}
