package Exercices;

import java.util.Scanner;

public class SousChaine {

    public static void main(String[] args) {
        // Création du scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // ------------------- SOLUTION 1 : substring() -------------------
        System.out.println("Entrez une chaîne :");
        String chaine = scanner.nextLine(); // lire la chaîne complète

        System.out.println("Entrez deux indices (début et fin) :");
        int debut = scanner.nextInt();
        int fin = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne restant après nextInt()

        // Extraire la sous-chaîne avec substring()
        // La méthode substring(inclu_debut, exclu_fin) : donc on ajoute +1 pour inclure l'indice final
        String sousChaine = chaine.substring(debut, fin + 1);
        System.out.println("Sous-chaîne extraite : " + sousChaine);



        // ------------------- SOLUTION 2 : boucle -------------------
        System.out.println("Entrez une autre chaîne :");
        String inputString = scanner.nextLine();

        System.out.println("Entrez deux indices (début et fin) :");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne restant

        // Construire la sous-chaîne avec une boucle
        String substring = "";
        for (int i = start; i <= end; i++) {
            substring += inputString.charAt(i);
        }
        System.out.println("Sous-chaîne extraite avec boucle : " + substring);

        // On peut fermer le scanner maintenant
        scanner.close();
    }
}
