package Exercices;

import java.util.Scanner;

public class Kettel {

    // État de la bouilloire (variable globale pour simplifier)
    static String kettleState = "off";

    // Méthode qui contrôle la bouilloire électrique
    public static void controlKettle() {
        Scanner scanner = new Scanner(System.in);

        // Affiche l’état actuel de la bouilloire
        System.out.println("The kettle is currently: " + kettleState);

        // Propose les actions possibles (switch imbriqué)
        System.out.println("Choose action: 1 – turn ON, 2 – turn OFF");
        String action = scanner.next();

        // Switch imbriqué : selon l’action choisie
        switch (action) {
            case "1":   // Allumer la bouilloire
                kettleState = "on";
                System.out.println("The kettle is now ON.");
                break;

            case "2":   // Éteindre la bouilloire
                kettleState = "off";
                System.out.println("The kettle is now OFF.");
                break;

            default:
                System.out.println("Invalid kettle action.");
        }
    }

    // Méthode avec le menu principal (choix des objets)
    public static void chooseAction() {
        Scanner scanner = new Scanner(System.in);

        // Affiche la liste des objets contrôlables
        System.out.println("Choose the object: 1 – speakers, 2 – lamp, 3 – door, 4 – kettle");
        String choice = scanner.next(); // Lecture du choix

        // Switch principal (switch imbriquant d’autres switch)
        switch (choice) {

            case "1":
                System.out.println("Speakers selected.");
                System.out.println("Currently OFF. (example)");
                break;

            case "2":
                System.out.println("Lamp selected.");
                System.out.println("Currently OFF. (example)");
                break;

            case "3":
                System.out.println("Door selected.");
                System.out.println("Currently CLOSED. (example)");
                break;

            case "4":
                // Appel de la méthode imbriquée
                controlKettle();
                break;

            default:
                System.out.println("Invalid option.");
        }
    }

    // Méthode principale
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int password = 76543210;

        // Demande du mot de passe
        System.out.println("Enter password:");
        int input = scanner.nextInt();

        // Vérification du mot de passe
        if (input != password) {
            System.out.println("Wrong password");
        } else {
            // Si le mot de passe est correct : afficher le menu
            chooseAction();
        }
    }
}
