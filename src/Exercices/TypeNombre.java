package Exercices;

import java.util.Scanner;

public class TypeNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre :");

        // Lire l'entrée de l'utilisateur comme un double
        double nombre = scanner.nextDouble();

        // Fermer le scanner, plus besoin de lire
        scanner.close();

        // Vérifier si le nombre est un entier
        if (nombre % 1 != 0) {
            // Si le reste de la division par 1 n'est pas 0, ce n'est pas un entier
            System.out.println("non-integer");
        } else {
            // Sinon, c'est un entier, on peut le traiter comme un int
            int entier = (int) nombre;

            // Vérifier si l'entier est positif, négatif ou zéro
            if (entier > 0) {
                System.out.println("positive");
            } else if (entier < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }
    }
}
