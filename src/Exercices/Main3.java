package Exercices;

import java.util.*;

public class Main3 {

    // Méthode pour multiplier deux nombres
    public static int calculate(int a, int b) {
        return a * b;
    }

    // Méthode pour additionner les deux premiers et multiplier par le troisième
    public static int calculate(int a, int b, int c) {
        return (a + b) * c;
    }

    // Méthode pour lire l'entrée et appeler la bonne méthode
    public static void processInputAndCallFunctions() {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();
        String[] strArr = inputString.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        if (intArr.length == 2) {
            // Appel à calculate(int, int)
            System.out.println(calculate(intArr[0], intArr[1]));
        } else if (intArr.length == 3) {
            // Appel à calculate(int, int, int)
            System.out.println(calculate(intArr[0], intArr[1], intArr[2]));
        } else {
            System.out.println("Invalid number of inputs");
        }

        scn.close();
    }

    public static void main(String[] args) {
        processInputAndCallFunctions();

        /*
        Explications

        1. Surcharge des méthodes calculate
            • calculate(int a, int b) → multiplie deux entiers.
            • calculate(int a, int b, int c) → additionne a + b puis multiplie par c.
        2. Lecture de l’entrée
            • Scanner lit une ligne avec 2 ou 3 nombres.
            • split(" ") découpe la chaîne en éléments séparés par espace.
            • Chaque élément est converti en int.
        3. Appel conditionnel
            • intArr.length == 2 → appelle calculate(int, int).
            • intArr.length == 3 → appelle calculate(int, int, int).
         */
    }
}
