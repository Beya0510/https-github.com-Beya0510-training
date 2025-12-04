package Exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindingLetter {

    // Variables d'instance pour la classe (pour l'exemple de tableau et liste)
    private int[] numArray = new int[6]; // tableau de 6 éléments
    private ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    // -------------------------------
    // Méthode principale
    // -------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1️⃣ Salutation
        greeting();

        // 2️⃣ Vérification d'une lettre dans une plage
        whichLetter();
        System.out.println();

        // 3️⃣ Tester si un nombre entré par l'utilisateur est premier
        int number = scanner.nextInt();
        System.out.println(number + " est premier : " + isPrime(number));
        System.out.println();

        // Version verbose : détails du test de primalité
        isPrimeVerbose(number);

        // Test simple de primalité
        boolean result = isPrime(number);
        System.out.println(result);
        System.out.println();

        // 4️⃣ Trouver le plus petit diviseur d'un nombre
        int numb = 5977;
        int smallestDivisor = findSmallestDivisor(numb);
        System.out.println("Le plus petit diviseur de " + numb + " est : " + smallestDivisor);
        System.out.println();

        // 5️⃣ Boucle Fibonacci : calculer la somme jusqu'à dépasser 1000
        int fibonacciPrevious = 1;
        int fibonacciCurrent = 1;
        int fibonacciSum = fibonacciPrevious + fibonacciCurrent;

        while (true) {
            int tmp = fibonacciPrevious + fibonacciCurrent;
            fibonacciPrevious = fibonacciCurrent;
            fibonacciCurrent = tmp;
            fibonacciSum += fibonacciCurrent;

            if (fibonacciCurrent > 1000) {
                System.out.println("FibonacciCurrent dépasse 1000 : " + fibonacciCurrent);
                System.out.println("Somme des Fibonacci jusqu'à ce terme : " + fibonacciSum);
                break;
            }
        }

        // 6️⃣ Affichage des 10 premiers termes de Fibonacci
        System.out.println("\n--- 10 premiers termes de Fibonacci ---");
        fibonacciPrevious = 1;
        fibonacciCurrent = 1;
        fibonacciSum = fibonacciPrevious + fibonacciCurrent;

        System.out.println(fibonacciPrevious); // 1er terme
        System.out.println(fibonacciCurrent);  // 2e terme

        int count = 2;       // déjà 2 termes
        int maxTerms = 10;   // nombre de termes à afficher

        while (count < maxTerms) {
            int tmp = fibonacciPrevious + fibonacciCurrent;
            fibonacciPrevious = fibonacciCurrent;
            fibonacciCurrent = tmp;
            System.out.println(fibonacciCurrent);
            fibonacciSum += fibonacciCurrent;
            count++;
        }

        System.out.println("Somme des " + maxTerms + " premiers termes : " + fibonacciSum);
        System.out.println();

        // 7️⃣ Opérations bitwise
        int number1 = 38; // 0010 0110 en binaire
        int number2 = 54; // 0011 0110 en binaire

        number1 = number1 << 2; // Décalage gauche : 38 << 2 = 152
        number2 = number2 >> 1; // Décalage droit : 54 >> 1 = 27

        int resultat = number2 ^ number1; // XOR
        System.out.println("Résultat bitwise XOR : " + resultat);
        System.out.println("Résultat en binaire : 0b" + Integer.toBinaryString(resultat));

        // 8️⃣ Modification d'une chaîne de caractères
        System.out.println(modifyString("my password is 12345"));

        // 9️⃣ Affichage des 25 premiers termes de Fibonacci avec indices
        fibonacci();

        // 🔟 Trouver le plus grand nombre premier inférieur à 459
        int greatestPrimeInRange = 2;
        for (int numba = 2; numba < 459; numba++) {
            if (isPrime(numba) && numba > greatestPrimeInRange) {
                greatestPrimeInRange = numba;
            }
        }
        System.out.println("Le plus grand nombre premier inférieur à 459 est : " + greatestPrimeInRange);

        // Fermeture du scanner
        scanner.close();

        int numArray[] = new int[5];
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        manageList(numList);

    }

    // -------------------------------
    // Méthode : salutation
    // -------------------------------
    public static void greeting() {
        String greeting = "Hello Grace";
        if (greeting.contains("e")) {
            greeting += "!";
            System.out.println(greeting);
        }
        System.out.println("Shutting down\n");
    }

    // -------------------------------
    // Méthode : vérifier si une lettre est dans une plage
    // -------------------------------
    public static void whichLetter() {
        char rangeStart = 'C';
        char rangeEnd = 'Z';
        char findLetter = 's';
        char normalized = Character.toUpperCase(findLetter);

        for (char c = rangeStart; c <= rangeEnd; c++) {
            if (c == normalized) {
                System.out.printf("Character %s is within the range %s-%s.%n", findLetter, rangeStart, rangeEnd);
                return;
            }
        }
        System.out.printf("Character %s is not within the range %s-%s%n", findLetter, rangeStart, rangeEnd);
    }

    // -------------------------------
    // Méthode : tester si un nombre est premier
    // -------------------------------
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // -------------------------------
    // Version verbose pour expliquer pourquoi un nombre n'est pas premier
    // -------------------------------
    public static void isPrimeVerbose(int number) {
        if (number <= 1) {
            System.out.println(number + " n'est pas un nombre premier.");
            return;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(number + " n'est pas un nombre premier, car divisible par " + i + ".");
                return;
            }
        }
        System.out.println(number + " est un nombre premier.");
    }

    // -------------------------------
    // Méthode : trouver le plus petit diviseur
    // -------------------------------
    public static int findSmallestDivisor(int number) {
        if (number <= 1) return number;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return i;
        }
        return number;
    }

    // -------------------------------
    // Méthode : modifier une chaîne
    // -------------------------------
    public static String modifyString(String initialString) {
        String modString = initialString;

        modString = modString.substring(0, 2) + modString.substring(10); // 1
        if (modString.contains(" ")) modString += "ABC"; // 2
        int space = modString.indexOf(" ");
        if (space != -1) modString = modString.substring(space + 1) + modString.substring(0, space); // 3
        if (modString.contains("a")) modString += "1248"; // 4
        modString = modString.replaceFirst("\\s", "\\$"); // 5
        if (modString.length() < 15) modString = new StringBuilder(modString).reverse().toString(); // 6
        modString += "18B20"; // 7
        int one = modString.indexOf("1");
        int five = modString.indexOf("5");
        if (one != -1 && five != -1) modString = modString.substring(one + 1) + modString.substring(0, five); // 8
        // ligne 9 inutile car non assignée

        return modString;
    }

    // -------------------------------
    // Méthode : afficher 25 premiers termes Fibonacci
    // -------------------------------
    public static void fibonacci() {
        int prev = 0;
        int current = 1;

        for (int i = 0; i <= 25; i++) {
            int swap = prev;
            prev = current;
            current += swap;
            System.out.println("indice " + i + " : " + current);
        }
    }

    // -------------------------------
    // Méthode : opérations XOR
    // -------------------------------
    public static void printXor(int condition1, int condition2) {
        System.out.println(condition1 ^ condition2);
    }

    // -------------------------------
    // Méthode : remplir le tableau
    // -------------------------------
    public void fillArray() {
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i;
        }
    }

    // -------------------------------
    // Méthode : gérer la liste
    // -------------------------------
    public static void manageList(ArrayList<Integer> numList) {
        int total = numList.stream().reduce(0, Integer::sum);
        System.out.println("Total de la liste : " + total);
    }
}
