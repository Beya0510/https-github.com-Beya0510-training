package Exercices;

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        Arrêt, cédez le passage, avancez : la valse du contrôleur de feux de circulation
        Concevez un contrôleur de feux de circulation simple. Créez des méthodes pour gérer les différents états du feu
        (rouge, jaune, vert) et les faire défiler. La méthode principale doit simuler le cycle des feux.
        L'entrée est l'état actuel (0 pour rouge, 1 pour jaune, 2 pour vert), et la sortie est l'état suivant et l'action
        qui s'ensuit.
        */
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = String.valueOf(getNextState(currentState));
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);
    }

    // Méthode pour obtenir l'état suivant
    public static int getNextState(int currentState) {
        return switch (currentState) {
            case 0 -> // Rouge
                    1; // Jaune
            case 1 -> // Jaune
                    2; // Vert
            case 2 -> // Vert
                    0; // Rouge
            default -> -1; // Valeur invalide
        };
    }

    // Méthode pour obtenir l'action associée à l'état actuel
    public static String getAction(int currentState) {
        return switch (currentState) {
            case 0 -> "Change to Yellow";
            case 1 -> "Change to Green";
            case 2 -> "Change to Red";
            default -> "Invalid State";
        };
    }
}
