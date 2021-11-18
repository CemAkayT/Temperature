package com.company;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("How many days? ");
        int numDays = console.nextInt();
        int[] temps = new int[numDays];

        int sum = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.print("Day" + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }

        double average = (double) sum / numDays;
        int above = 0;
        for (int i = 0; i < temps.length; i++) {

            if (temps[i] > average) {
                above++;
            }
        }
        System.out.println("Average temps is " + average);
        System.out.println( above + " days above average");
    }

}