package Exercices;

import java.util.Scanner;

public class DivByThreeFiveNone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    /*
    Vérification de la divisibilité et affichage des chaînes de caractères appropriées :
    Écrivez un programme Java qui prend un entier en entrée. Si le nombre est divisible par 3, il doit afficher "Fizz",
    et s'il est divisible par 5, il doit afficher "Buzz". S'il est divisible à la fois par 3 et par 5, il doit afficher
    "FizzBuzz". Pour tout autre entier, il doit afficher "None". Vous devez créer des méthodes distinctes pour vérifier
    la divisibilité par 3, par 5 et par les deux.
    */


        int num = scanner.nextInt();

        if (isDivByThreeAndFive(num)) {
            System.out.println("FizzBuzz");
        } else if (isDivByThree(num)) {
            System.out.println("Fizz");
        } else if (isDivByFive(num)) {
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }

        scanner.close();
    }

    // check if divisible by 3
    public static boolean isDivByThree(int num) {
        return num % 3 == 0;
    }

    // check if divisible by 5
    public static boolean isDivByFive(int num) {
        return num % 5 == 0;
    }

    // check if divisible by both 3 and 5
    public static boolean isDivByThreeAndFive(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }
}
