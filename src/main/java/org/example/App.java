package org.example;
import java.util.Scanner;

/**
 * Computing Simple Interest;
 * UCF cop3330 Fall 2021 Assignment 12 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int principal = scan.nextInt();
        System.out.print("Enter the rate of interest: ");
        float interest = scan.nextFloat();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();

        int total_accrued = (int)(principal * (1 + years * (interest/100)));
        System.out.print("After " + years + " years at " + interest + "%, the investment will be worth $" + total_accrued + ".");

    }
}
