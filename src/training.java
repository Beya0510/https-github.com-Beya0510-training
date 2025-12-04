import Exercices.SomeClass;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class training {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] matrix = new String[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = ".";
            }
        }

        int mid = n / 2;

        // Fill middle row, middle column, and diagonals with '*'
        for (int i = 0; i < n; i++) {
            matrix[mid][i] = "*";     // middle row
            matrix[i][mid] = "*";     // middle column
            matrix[i][i] = "*";       // main diagonal
            matrix[i][n - 1 - i] = "*"; // secondary diagonal
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static double divide(long a, long b) {
        if (b == 0) {
            System.out.println("Divided by zero! Try again.");
            return Double.NaN; // valeur spéciale "Not a Number"
        } else {
            return (double) a / b; // division en double
        }
    }

    static class Circle {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void whatever(){
        String greeting = "Hello Grace";
        if(greeting.contains("a")){
            greeting += "!";
            System.out.println(greeting);
        }
        System.out.println("Shutting down");
    }


    public static void whatever1(){
        char rangeStart = 'C';
        char rangeEnd = 'Y';
        char findLetter = 'q';
        for(char c = rangeStart; c <= rangeEnd; c++){
            if(c == (Character.toUpperCase(findLetter))){
                System.out.printf("Character %s is within range %s-%s", findLetter, rangeStart, rangeEnd);
                return;
            }
        }
        System.out.printf("Character %s is not within range %s-%s", findLetter, rangeStart, rangeEnd);
    }

}

class Int {

    int val = 1;

    public Int() {
        val = 2;
    }

    public Int(int val) {
        this();
    }

    public Int(int val1, int val2) {
        this(val1 + val2);
    }
}

class Human{
    String name;
    int age;

    public static void printStatic(){
        System.out.println("It's a static method.");
    }

    public void printInstance(){
        System.out.println("It's an instance method.");
    }

    public static void averageWorking() {
        System.out.println("An average human works 40 hours per week.");
    }

    public void work(){
        System.out.println(this.name + "loves working!");
    }

    public void workTogetherWith(Human other){
        System.out.println(this.name + " loves working with " + other.name + ".");
    }
}



