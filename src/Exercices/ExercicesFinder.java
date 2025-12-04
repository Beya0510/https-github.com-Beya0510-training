package Exercices;
import java.util.Scanner;

public class ExercicesFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -------------------------------
        // 1️⃣ Salutation
        // -------------------------------
        greeting();

        // -------------------------------
        // 2️⃣ Vérifier si une lettre est dans une plage
        // -------------------------------
        whichLetter();
        System.out.println();

        // -------------------------------
        // 3️⃣ Tester si un nombre entré par l'utilisateur est premier
        // -------------------------------
        System.out.print("Entrez un nombre pour tester s'il est premier : ");
        int number = scanner.nextInt();
        checkPrime(number);
        System.out.println();

        // -------------------------------
        // 4️⃣ Plus petit diviseur
        // -------------------------------
        int numb = 5977;
        int smallestDivisor = findSmallestDivisor(numb);
        System.out.println("Le plus petit diviseur de " + numb + " est : " + smallestDivisor);
        System.out.println();

        // -------------------------------
        // 5️⃣ Fibonacci : somme jusqu'à dépasser 1000
        // -------------------------------
        fibonacciUntilLimit(1000);
        System.out.println();

        // -------------------------------
        // 6️⃣ Fibonacci : afficher et sommer les 10 premiers termes
        // -------------------------------
        fibonacciFirstNTerms(10);
        System.out.println();

        // -------------------------------
        // 7️⃣ Opérations bitwise
        // -------------------------------
        bitwiseExample(38, 54);
        System.out.println();

        // -------------------------------
        // 8️⃣ Modifier une chaîne (password)
        // -------------------------------
        String modified = modifyString("my password is 12345");
        System.out.println("Chaîne modifiée : " + modified);
        System.out.println();

        // -------------------------------
        // 9️⃣ Afficher les 25 premiers termes de Fibonacci
        // -------------------------------
        fibonacci25Terms();
        System.out.println();

        // -------------------------------
        // 🔟 Plus grand nombre premier < 459
        // -------------------------------
        int greatestPrime = greatestPrimeBelow(459);
        System.out.println("Le plus grand nombre premier inférieur à 459 est : " + greatestPrime);

        scanner.close();
    }

    // ===============================
    // Méthodes
    // ===============================

    // Salutation
    public static void greeting() {
        String greeting = "Hello Grace";
        if (greeting.contains("e")) greeting += "!";
        System.out.println(greeting);
        System.out.println("Shutting down\n");
    }

    // Vérifier lettre dans plage
    public static void whichLetter() {
        char start = 'C';
        char end = 'Z';
        char letter = 's';
        char normalized = Character.toUpperCase(letter);

        for (char c = start; c <= end; c++) {
            if (c == normalized) {
                System.out.printf("Character %s is within the range %s-%s.%n", letter, start, end);
                return;
            }
        }
        System.out.printf("Character %s is not within the range %s-%s%n", letter, start, end);
    }

    // Test de primalité simple
    public static void checkPrime(int number) {
        System.out.println(number + " est premier : " + isPrime(number));
        isPrimeVerbose(number);
    }

    // Tester si nombre est premier (simple)
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Version verbose pour expliquer pourquoi nombre n'est pas premier
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

    // Plus petit diviseur
    public static int findSmallestDivisor(int number) {
        if (number <= 1) return number;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return i;
        }
        return number; // nombre premier
    }

    // Fibonacci jusqu'à dépasser un certain nombre
    public static void fibonacciUntilLimit(int limit) {
        int prev = 1, curr = 1, sum = prev + curr;

        while (true) {
            int next = prev + curr;
            prev = curr;
            curr = next;
            sum += curr;

            if (curr > limit) {
                System.out.println("FibonacciCurrent dépasse " + limit + " : " + curr);
                System.out.println("Somme des Fibonacci jusqu'à ce terme : " + sum);
                break;
            }
        }
    }

    // Afficher et sommer les N premiers termes
    public static void fibonacciFirstNTerms(int n) {
        int prev = 1, curr = 1;
        int sum = prev + curr;

        System.out.println(prev);
        System.out.println(curr);

        for (int count = 2; count < n; count++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
            System.out.println(curr);
            sum += curr;
        }
        System.out.println("Somme des " + n + " premiers termes : " + sum);
    }

    // Opérations bitwise exemple
    public static void bitwiseExample(int number1, int number2) {
        number1 = number1 << 2; // décalage gauche
        number2 = number2 >> 1; // décalage droit
        int result = number1 ^ number2; // XOR
        System.out.println("Résultat bitwise XOR : " + result);
        System.out.println("Binaire : 0b" + Integer.toBinaryString(result));
    }

    // Modifier chaîne (password)
    static String modifyString(String initial) {
        String mod = initial;

        mod = mod.substring(0, 2) + mod.substring(10);
        if (mod.contains(" ")) mod += "ABC";
        int space = mod.indexOf(" ");
        if (space >= 0) mod = mod.substring(space + 1) + mod.substring(0, space);
        if (mod.contains("a")) mod += "1248";
        mod = mod.replaceFirst("\\s", "\\$");
        if (mod.length() < 15) mod = new StringBuilder(mod).reverse().toString();
        mod += "18B20";

        return mod;
    }

    // Afficher 25 premiers termes Fibonacci
    static void fibonacci25Terms() {
        int prev = 0, curr = 1;
        for (int i = 0; i <= 25; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
            System.out.println("indice " + i + " : " + curr);
        }
    }

    // Plus grand nombre premier inférieur à une limite
    static int greatestPrimeBelow(int limit) {
        int greatest = 2;
        for (int i = 2; i < limit; i++) {
            if (isPrime(i) && i > greatest) greatest = i;
        }
        return greatest;
    }
}
