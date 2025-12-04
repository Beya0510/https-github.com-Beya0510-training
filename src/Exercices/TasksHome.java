package Exercices;

import java.util.Scanner;
import static java.lang.System.in;

public class TasksHome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);

        int password = 76543210;

        // États initiaux
        String speakersState = "off";
        String lampState = "off";
        String doorState = "closed";

        // Lire le mot de passe
        System.out.println("Enter password: ");
        int passwordInput = sc.nextInt();

        if (passwordInput != password) {
            System.out.println("Wrong password");
        } else {

            // Choix de l’objet
            System.out.println("Choose the object : 1 - speakers, 2 - lamp, 3 - door");
            String objectChoice = sc.next();

            switch (objectChoice) {

                case "1":  // SPEAKERS
                    System.out.println("Speakers are currently: " + speakersState);
                    System.out.println("Choose action: 1 - turn ON, 2 - turn OFF");
                    String spAction = sc.next();

                    switch (spAction) {
                        case "1":
                            speakersState = "on";
                            System.out.println("Speakers are now ON.");
                            break;
                        case "2":
                            speakersState = "off";
                            System.out.println("Speakers are now OFF.");
                            break;
                        default:
                            System.out.println("Invalid speakers action.");
                    }
                    break;

                case "2":  // LAMP
                    System.out.println("Lamp is currently: " + lampState);
                    System.out.println("Choose action: 1 - turn ON, 2 - turn OFF");
                    String lampAction = sc.next();

                    switch (lampAction) {
                        case "1":
                            lampState = "on";
                            System.out.println("Lamp is now ON.");
                            break;
                        case "2":
                            lampState = "off";
                            System.out.println("Lamp is now OFF.");
                            break;
                        default:
                            System.out.println("Invalid lamp action.");
                    }
                    break;

                case "3":  // DOOR
                    System.out.println("Door is currently: " + doorState);
                    System.out.println("Choose action: 1 - OPEN, 2 - CLOSE");
                    String doorAction = sc.next();

                    switch (doorAction) {
                        case "1":
                            doorState = "open";
                            System.out.println("Door is now OPEN.");
                            break;
                        case "2":
                            doorState = "closed";
                            System.out.println("Door is now CLOSED.");
                            break;
                        default:
                            System.out.println("Invalid door action.");
                    }
                    break;

                default:
                    System.out.println("Invalid object choice.");
            }
        }

        sc.close();
    }
}
