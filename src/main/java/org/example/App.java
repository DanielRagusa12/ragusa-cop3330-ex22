package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class App
{
    public static void main(String[] args)
    {
        int first;
        int second;
        int third;
        int biggest_num=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = input.nextInt();

        System.out.print("Enter the second number: ");
        second = input.nextInt();

        System.out.print("Enter the third number: ");
        third = input.nextInt();

        if(first>second)
        {
            if(first>third)
            {
                biggest_num=first;
            }
        }

        if(second>first)
        {
            if(second>third)
            {
                biggest_num=second;
            }
        }

        if(third>first)
        {
            if(third>second)
            {
                biggest_num=third;
            }
        }

        System.out.print("The largest number is "+(biggest_num)+".");

    }

}