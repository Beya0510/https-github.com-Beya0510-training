package FigureEtoile;
import java.util.Scanner;

public class Etoile {

    public static void main(String[] args) {
        /*
        Figure en forme d'étoile.
        Votre tâche consiste à dessiner une étoile sur un champ "n×n" en utilisant les symboles "." et "*". "n" est impair
        et ne dépasse pas 15.

        Pour ce faire, suivez les instructions :
            • Tout d'abord, créez un tableau bidimensionnel (matrice) de "n×n" éléments en le remplissant de symboles ".".
              Chaque élément de la matrice est une chaîne de caractères contenant un seul symbole.
            • Ensuite, remplissez la ligne centrale, la colonne centrale et les diagonales de la matrice avec des symboles
              "*". Ainsi, tous les "*" du tableau doivent former une étoile.
            • Troisièmement, affichez cette matrice ; les éléments du tableau doivent être séparés par des espaces.

         Exemple d'entrée 1 : 9
        */

        Scanner scanner = new Scanner(System.in);

        // Lire la taille n du carré (n est impair et <= 15)
        int n = scanner.nextInt();

        // Créer une matrice n x n remplie avec le symbole "."
        String[][] matrix = new String[n][n];

        // Remplissage initial de la matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ".";  // chaque case contient "."
            }
        }

        // Calcul de l'index du milieu
        int mid = n / 2;

        // Remplacer par "*" :
        for (int i = 0; i < n; i++) {

            matrix[mid][i] = "*";        // Ligne centrale
            matrix[i][mid] = "*";        // Colonne centrale

            matrix[i][i] = "*";          // Diagonale principale
            matrix[i][n - 1 - i] = "*";  // Diagonale secondaire
        }

        // Affichage de la matrice avec des espaces entre chaque élément
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // retour à la ligne après chaque ligne du carré
        }


        scanner.close();
    }

/*
✅ **Code commenté**

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire la taille n du carré (n est impair et <= 15)
        int n = scanner.nextInt();

        // Créer une matrice n x n remplie avec le symbole "."
        String[][] matrix = new String[n][n];

        // Remplissage initial de la matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ".";  // chaque case contient "."
            }
        }

        // Calcul de l'index du milieu
        int mid = n / 2;

        // Remplacer par "*" :
        for (int i = 0; i < n; i++) {

            matrix[mid][i] = "*";        // Ligne centrale
            matrix[i][mid] = "*";        // Colonne centrale

            matrix[i][i] = "*";          // Diagonale principale
            matrix[i][n - 1 - i] = "*";  // Diagonale secondaire
        }

        // Affichage de la matrice avec des espaces entre chaque élément
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // retour à la ligne après chaque ligne du carré
        }
    }
}

# 🧠 **Explication simple et détaillée**

### 🔹 **1. Lecture de la taille du carré**
int n = scanner.nextInt();

L’utilisateur entre un nombre impair (ex : 9).
C’est la taille de la grille `n × n`.

### 🔹 **2. Création de la matrice**
String[][] matrix = new String[n][n];

On crée un tableau 2D qui va contenir des `"."` et `"*"`.
### 🔹 **3. Remplir toute la matrice avec des points**

a
matrix[i][j] = ".";

Avant de dessiner l’étoile, toute la grille est remplie de `"."`.

### 🔹 **4. Calcul de la ligne/colonne centrale**

int mid = n / 2;


Ex : si `n = 9`, `mid = 4`.
C’est l’index central de la matrice.

### 🔹 **5. Dessiner l’étoile**

Dans la boucle :

java
matrix[mid][i] = "*";        // ligne du milieu
matrix[i][mid] = "*";        // colonne du milieu
matrix[i][i] = "*";          // diagonale principale
matrix[i][n - 1 - i] = "*";  // diagonale secondaire

On remplit **4 directions** en même temps :

* La croix : ligne centrale + colonne centrale.
* Les deux diagonales : comme un X.

Ensemble, elles forment une **étoile à 8 branches**.

### 🔹 **6. Affichage final**
System.out.print(matrix[i][j] + " ");


On affiche chaque élément séparé par un espace, comme demandé.

Exemple pour `n = 9` → une étoile parfaite.

🎉 Résultat : une étoile dans un carré n×n

Tu obtiens exactement ceci :

```
* . . . * . . . *
. * . . * . . * .
. . * . * . * . .
. . . * * * . . .
* * * * * * * * *
. . . * * * . . .
. . * . * . * . .
. * . . * . . * .
* . . . * . . . *
```
*/
}
