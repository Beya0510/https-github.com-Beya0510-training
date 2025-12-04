import java.util.Scanner;
public class TableauMultidimensionnel {


    /*
       Exercice 3 : Création d'un motif à rayures diagonales dans une matrice
       Salut ! Ce problème est peut-être un peu imprévisible, mais essayez de le résoudre et dites-nous comment vous
       vous en sortez !
       En Java, créez un programme qui prend en entrée un entier n représentant le nombre de lignes et de colonnes
       d'une matrice carrée, et qui affiche une chaîne formatée de rayures diagonales sur la matrice. Pour cela,
       marquez les cellules avec un '#' si leur indice de ligne et leur indice de colonne sont identiques ou s'ils
       s'additionnent à n-1, et avec un espace '' sinon. Un saut de ligne doit suivre chaque ligne de la matrice.

       Exemple d'entrée 1 :
       3

       Exemple de sortie 1 :
       # #
       #
       # #

       Exemple d'entrée 2 :
       5

       Exemple de sortie 2 :
       # #
       # #
       #
       # #
       # #
       */



    Scanner sc = new Scanner(System.in);

    public static void printPattern(int n) {
        // Boucle pour chaque ligne
        for (int i = 0; i < n; i++) {
            // Boucle pour chaque colonne
            for (int j = 0; j < n; j++) {
                // Condition pour les diagonales :
                // - principale : i == j
                // - secondaire : i + j == n - 1
                if (i == j || i + j == n - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            // Passage à la ligne suivante
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
        scan.close();
    }
}
