package Exercices;

import java.util.Scanner;

public class Control {
    // method that turns the music on and off

    public static void controlMusic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("on/off?");
        String tumbler = scanner.next();
        if (tumbler.equals("on")) {
            System.out.println("The music is on");
        } else if (tumbler.equals("off")) {
            System.out.println("The music is off");
        } else {
            System.out.println("Invalid operation");
        }
    }
}
