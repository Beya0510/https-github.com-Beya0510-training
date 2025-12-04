package com.example.demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Read a positive integer from the user
        System.out.println("Enter duration in minutes :   ");
        int minutes = scanner.nextInt();

        // Calculate hours and remaining minutes
        int hours = minutes / 60;
        minutes = minutes % 60;

        // Print the result
        System.out.print(hours + " hours and " + minutes + " minutes");


        int number = scanner.nextInt();
        System.out.print(number + 1);

    }
}
