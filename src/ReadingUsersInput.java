import java.util.Scanner;

public class ReadingUsersInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom: ");
        String name = scanner.nextLine();
        System.out.println("Bonjour, " + name + "!");

        System.out.print("Entrez votre prénom: ");
        String firstName = scanner.nextLine();

        System.out.print("Entrez votre nom de famille: ");
        String lastName = scanner.nextLine();

        System.out.println("Welcome, " + firstName + " " + lastName + "!");


        System.out.print("Entrez un entier: ");
        int a = scanner.nextInt();
        scanner.nextLine(); // consommer le \n

        System.out.print("Entrez un nombre décimal: ");
        double b = scanner.nextDouble();
        scanner.nextLine(); // consommer le \n

        System.out.print("Entrez un booléen (true/false): ");
        String boolInput = scanner.nextLine();
        boolean c = Boolean.parseBoolean(boolInput);



        System.out.println("Valeurs entrées: " + a + ", " + b + ", " + c + "!");

        String word1 = scanner.next(); // "This"
        String line1 = scanner.nextLine(); // " is a simple"
        String word2 = scanner.nextLine(); // "multiline"
        String word3 = scanner.nextLine(); // "input,"
        String line2 = scanner.nextLine(); // ""

        // Read the next integer
        int n = scanner.nextInt();

        // Elever à la puissance

        // Compute and print the square of n
        System.out.println(n*n);
        // Compute and print the cube of n
        System.out.println(n*n*n);
        // Compute and print the fourth power of n
        System.out.println(n*n*n*n);

        System.out.println((int) Math.pow(n, 2)); // carré
        System.out.println((int) Math.pow(n, 3)); // cube
        System.out.println((int) Math.pow(n, 4)); // puissance 4

        // Read the first integer
        int num1 = scanner.nextInt();

        // Read the second integer
        int num2 = scanner.nextInt();

        // TODO: Perform addition, multiplication, and division operations
        int addition = num1 + num2;
        System.out.println(addition);

        int multiplication = num1 * num2;
        System.out.println(multiplication);

        int division = (num1 / num2);
        System.out.println(division);

        double basePrice = 100.0, taxRate = 8.0, discountAmount = 10.0;
        double taxAmount = basePrice * (taxRate/ 100);
        double finalPrice = basePrice + taxAmount * discountAmount;
        System.out.printf("Final price: $%.2f\n", finalPrice);

        int input = scanner.nextInt();

        // Compute the remainder when divided by 2
        int remainder = input % 2;

        // Multiply the remainder by 3
        int triple = remainder * 3;

        // Output the results
        System.out.println(remainder);
        System.out.println(triple);


        // Calcul entre 2 moments.
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();

        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        int time1 = h1 * 3600 + m1 * 60 + s1;
        int time2 = h2 * 3600 + m2 * 60 + s2;

        int difference = time2 - time1;

        System.out.println(difference);

        // Calcul du temps en minutes

        int minutes = scanner.nextInt();

        // Your code comes here!
        int hours = minutes / 60;
        int totalMinutes = minutes % 60;
        System.out.printf("%d hours and %d minutes", hours, totalMinutes);

        // entrer les nombres un à la suite de l'autre avec un espace
        // Lecture des 4 entiers sur une seule ligne
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        int numD = scanner.nextInt();

        // Affichage de chaque nombre sur une ligne différente
        System.out.println(numA);
        System.out.println(numB);
        System.out.println(numC);
        System.out.println(numD);

        // long et int
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        long sum = A + B;
        System.out.println(sum);



        scanner.close();
    }
}
