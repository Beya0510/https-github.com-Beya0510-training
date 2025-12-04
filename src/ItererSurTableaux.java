import java.util.Scanner;
import java.util.Arrays;

class ItererSurTableaux {

    // Méthode pour effectuer une rotation à droite
    private static void rotate(int[] arr, int steps) {
        int n = arr.length;
        if (n == 0) return; // tableau vide, rien à faire

        // Réduire le nombre de rotations si steps > n
        steps = steps % n;
        if (steps == 0) return; // pas besoin de rotation

        // Créer un tableau temporaire pour stocker les derniers 'steps' éléments
        int[] temp = new int[steps];
        for (int i = 0; i < steps; i++) {
            temp[i] = arr[n - steps + i];
        }

        // Décaler les éléments restants vers la droite
        for (int i = n - 1; i >= steps; i--) {
            arr[i] = arr[i - steps];
        }

        // Placer les éléments sauvegardés au début
        for (int i = 0; i < steps; i++) {
            arr[i] = temp[i];
        }
    }

    // code principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
        🧠 Explication du code :
        Normalisation du nombre de rotations
        steps = steps % n;

        → Si steps est supérieur à la taille du tableau, on ne fait que la rotation effective nécessaire.
        Sauvegarde des derniers éléments à déplacer
        int[] temp = new int[steps];
        for (int i = 0; i < steps; i++) temp[i] = arr[n - steps + i];

        → Ces éléments seront placés au début après le décalage.
       Décalage des éléments restants vers la droite
       for (int i = n - 1; i >= steps; i--) arr[i] = arr[i - steps];

       Insertion des éléments sauvegardés au début
       for (int i = 0; i < steps; i++) arr[i] = temp[i];
       🔹 Exemples :
        Entrée : 1 2 3 4 5, 1 → Sortie : 5 1 2 3 4
        Entrée : 1 2 3 4 5, 2 → Sortie : 4 5 1 2 3
        Entrée : 1 2 3 4 5, 8 → Sortie : 3 4 5 1 2
        */
        /*
        Un tableau de tableaux.
        Un tableau multidimensionnel est un tableau de tableaux.

        Tableaux bidimensionnels
        Si un tableau unidimensionnel peut être représenté par une séquence d'éléments, une représentation intuitive
        d'un tableau bidimensionnel consiste à utiliser une matrice ou un tableau. Si vous manipulez des matrices ou
        des tableaux dans votre programme, il est judicieux de les présenter sous forme de tableaux bidimensionnels.

        Créons un tableau bidimensionnel d'entiers (int) à 3 lignes et 3 colonnes. Voici à quoi il ressemble :
        */
        int [][] twoDimArray = {
                {0, 0, 0}, // premier tableau d'entiers
                {0, 0, 0}, // second tableau d'entiers
                {0, 0, 0}  // troisième tableau d'entiers
        };
        System.out.println(Arrays.deepToString(twoDimArray));


        /*
        On peut dire que les tableaux contenant trois zéros sont imbriqués dans le tableau "twoDimArray. Le tableau
        principal, qui contient les autres tableaux, est appelé le tableau principal.
        Voici une particularité intéressante : les tableaux imbriqués n’ont pas forcément la même taille. Dans l’exemple
        ci-dessous, chaque nouveau tableau imbriqué a une longueur différente :
        */
        int[][] twoDimArray1 = {
                {0, 0},       // the length is 2
                {1, 2, 3, 4}, // the length is 4
                {3, 3, 3}     // the length is 3
        };
        System.out.println(Arrays.deepToString(twoDimArray1));

        /*
        Vous pouvez créer des tableaux imbriqués avec un nombre différent d'éléments dans le même tableau 2D.

        Accéder aux éléments
        Voyons comment accéder à un élément d'un tableau. Le principe est le même que pour les tableaux unidimensionnels,
        mais il faut maintenant indiquer deux indices :
        1. L'indice de l'élément dans le tableau principal,
        2. Puis l'indice du tableau imbriqué.

        Supposons que nous souhaitions accéder à un élément situé à la première ligne et à la première colonne.
        Comment trouver cet élément ? Comme vous le savez, un tableau 2D est un tableau de tableaux. Il faut donc
        commencer par sélectionner l'un des tableaux imbriqués par son indice dans le tableau principal.
        Le principe est similaire à celui d'un tableau 1D.
        */
        int[][] twoDimArray2 = {
                {3, 4, 5},   // [0]
                {6, 7, 8},   // [1]

        };
        System.out.println(Arrays.deepToString(twoDimArray2));
        System.out.println();
        /*
        Tout d'abord, accédez au tableau principal et sélectionnez le tableau imbriqué à l'aide de son index :
        twoDimArray[0]      3       4       5
        twoDimArray[1]      6       7       8

        Ensuite, dans ce tableau imbriqué, sélectionnez l'élément souhaité à l'aide de son index. La procédure est
        identique à celle des tableaux simples :
        twoDimArray[0][0]       twoDimArray[0][1]       twoDimArray[0][2]
                3                       4                       5


        Créons une nouvelle variable "int number" et stockons-y l'élément situé à l'intersection de la première ligne
        et de la première colonne de notre tableau :
        */
         // int number = twoDimArray2[0][0]; // C'est 3.

        /*
        N'oubliez pas jamais que dans tous les tableaux, l'indexation commence par 0!

        Le code suivant affichera tous les éléments du tableau bidimensionnel twoDimArray2 :
        */
        System.out.println(twoDimArray2[0][0]); // 3
        System.out.println(twoDimArray2[0][1]); // 4
        System.out.println(twoDimArray2[0][2]); // 5
        System.out.println(twoDimArray2[1][0]); // 6
        System.out.println(twoDimArray2[1][1]); // 7
        System.out.println(twoDimArray2[1][2]); // 8
        System.out.println();

        /*
        Manipulation de tableaux 2D
        Dans les exemples précédents, nous créions des tableaux 2D en énumérant tous leurs éléments.
        Cependant, l'une des méthodes les plus courantes pour créer un tableau multidimensionnel consiste à utiliser
        une boucle "for".

        Créons un tableau "twoDimArray3" avec 2 lignes et 10 colonnes, et remplissons-le de 1. Pour accéder à chaque
        élément, nous devons parcourir les deux boucles "for". La première boucle sélectionne le tableau imbriqué,
        et la seconde parcourt tous les éléments de ce tableau.
        */


        int[][] twoDimArray3 = new int[2][10]; // Création d’un tableau 2D avec 2 lignes et 10 colonnes

                // Remplissage du tableau avec des 1
                for (int i = 0; i < twoDimArray3.length; i++) {
                    for (int j = 0; j < twoDimArray3[i].length; j++) {
                        twoDimArray3[i][j] = 1;
                    }
                }

                // Affichage des deux sous-tableaux
                for (int i = 0; i < twoDimArray3.length; i++) {
                    System.out.println(Arrays.toString(twoDimArray3[i]));
                }

                // Ou, pour afficher tout le tableau d’un coup :
                System.out.println("Tableau complet : " + Arrays.deepToString(twoDimArray3));
        System.out.println();

        /*
        Pour afficher chaque élément, il nous faut également deux boucles "for". Dans l'exemple ci-dessous,
        nous incrémentons tous les éléments de "un" et les affichons sur la sortie standard :
        */

        for(int i = 0; twoDimArray3.length > i; i++) {
            for(int j = 0; j < twoDimArray3[i].length; j++) {
                twoDimArray3[i][j]++;
                System.out.print(twoDimArray3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        Tableaux multidimensionnels (>2).
        Nous sommes enfin prêts à aborder des concepts plus complexes. Il existe des tableaux à plus de deux dimensions.
        Tout d'abord, un tableau tridimensionnel peut être représenté par un cube ou un parallélépipède :
        il possède exactement trois dimensions — longueur, largeur et hauteur.

        La situation pratique suivante peut également vous aider à comprendre les tableaux tridimensionnels :
        imaginez que vous deviez localiser une voiture dans un parking à étages. Vous devez alors définir trois nombres,
        ou trois coordonnées : l’étage, la rangée et la position dans la rangée.

        Enfin, voici un exemple de tableau tridimensionnel :

        [0, 0, 0, 0]      [1, 1, 1, 1]      [2, 2, 2, 2]
        [3, 3, 3, 3]      [4, 4, 4, 4]      [5, 5, 5, 5]

        Chaque élément d'un tableau bidimensionnel contient un autre tableau imbriqué.
        Le code ci-dessous crée le tableau tridimensionnel que vous venez de voir :
        */
        int[][][] threeDimArray = new int[2][3][4];

        int element = 0;

        for(int i = 0; i < threeDimArray.length; i++){
            for(int j = 0; j < threeDimArray[i].length; j++){
                for(int k = 0; k < threeDimArray[i][j].length; k++){
                    threeDimArray[i][j][k] = element;
                }
                element++;
            }
        }
        System.out.println(Arrays.deepToString(threeDimArray));
        System.out.println();
    /*
     Ici, 2 représente le nombre de lignes, 3 le nombre de colonnes et 4 le nombre d'éléments dans un tableau imbriqué.
     Et affichons les tableaux imbriqués :
    */
      for(int i = 0; i < threeDimArray.length; i++){
          for(int j = 0; j < threeDimArray[i].length; j++){
              System.out.print(Arrays.toString(threeDimArray[i][j]) + " ");
          }
          System.out.println();
      }
        System.out.println();

      /*
      Par conséquent, pour faire référence à un élément du tableau tridimensionnel, nous avons besoin de trois indices :
      */
        System.out.println(threeDimArray[0][0][0]); // 0
        System.out.println(threeDimArray[0][1][0]); // 1
        System.out.println(threeDimArray[1][0][1]); // 3
        System.out.println(threeDimArray[1][2][3]); // 5 – le dernier élément du tableau.
        System.out.println();

      /*
      Notez que vous pouvez simplifier votre code en utilisant des boucles "for-each" et les méthodes de la classe
      "Arrays" pour remplir et afficher des tableaux multidimensionnels.
      Et bien sûr, vous pouvez créer des tableaux d'autres dimensions par analogie : 4, 5, 6, etc.
      N'oubliez pas qu'un élément d'un tableau multidimensionnel possède autant d'indices que de dimensions de ce tableau.

      Conclusion
      Récapitulons. Vous avez découvert ce que sont les tableaux multidimensionnels et comment les créer en Java.
      Voici les points principaux à retenir :
        • un tableau multidimensionnel est essentiellement un tableau de tableaux ;
        • l’indexation commence à 0;
        • pour trouver un élément d’un tableau multidimensionnel, vous avez besoin d’un nombre d’indices égal à la
          dimension du tableau;
        • vous pouvez assembler des tableaux de tailles différentes dans un tableau multidimensionnel.



      Exercice : Rotation d'un tableau rectangulaire

      Étant donné un tableau rectangulaire de dimensions n×m, effectuez une rotation de 90 degrés dans le sens horaire
      et enregistrez le résultat dans un nouveau tableau de dimensions m×n.
      Format des données d'entrée

      L'entrée se compose des deux nombres n et m, inférieurs ou égaux à 100, suivis d'un tableau de dimensions n×m.

      Format des données de sortie
      Affichez le tableau résultant. Séparez les nombres par un espace.

      Exemple d'entrée 1 :

        3 4
        11 12 13 14
        21 22 23 24
        31 32 33 34
        Explication du code

      Exemple de sortie 1 :

        31 21 11
        32 22 12
        33 23 13
        34 24 14

      */
      // Lire n (lignes) et m (colonnes)
      int n = scanner.nextInt();
      int m = scanner.nextInt();

      int[][] array = new int[n][m]; // Tableau d'origine.


      // Remplir le tableau d'origine
      for(int i = 0; i < n; i++){
          for(int j = 0; j < m; j++){
                array[i][j] = scanner.nextInt();
         }
      }

      // Créer un nouveau tableau pour stocker le résultat après rotation
      int[][] rotated = new int[m][n];

      // Effectuer la rotation de 90° dans le sens horaire
      for(int i = 0; i < n; i++){ // Parcourt les lignes du tableau d’origine
          for(int j = 0; j < m; j++){   // Parcourt les colonnes du tableau d’origine
               rotated[j][n - 1 - i] = array[i][j];
          }
      }

        // Afficher le tableau tourné
       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
           }
            System.out.println();
        }

       /*
       Exercice 2 : Inverser les colonnes
       Étant donné un tableau bidimensionnel (matrice) et les deux nombres i et j, inversez les colonnes d'indices i et
       j dans la matrice.

       L'entrée contient les dimensions de la matrice n et m (inférieures à 100), puis les éléments de la matrice,
       et enfin les indices i et j.

       Exemple d'entrée 1 :

        3 4
        11 12 13 14
        21 22 23 24
        31 32 33 34
        0 1

        Exemple de sortie 1 :

        12 11 13 14
        22 21 23 24
        32 31 33 34
        */

        // Lire les dimensions de la matrice
        int p = scanner.nextInt();  // nombre de lignes
        int q = scanner.nextInt();  //  nombre de colonnes

        // Création de la matrice
        int[][] matrice = new int[p][q];

        // Remplissage de la matrice
        for(int row = 0; row < p; row++){
            for(int col = 0; col < q; col++){
                matrice[row][col] = scanner.nextInt();
            }
        }

        // Lecture des deux indices de colonne pour les échanger.
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        // Echange des colonnes i et j dans chaque ligne
        for(int row = 0; row < p; row++){
            int temp = matrice[row][i];
            matrice[row][i] = matrice[row][j];
            matrice[row][j] = temp;
        }

        // Affichage de la matrice résultante
        for(int row = 0; row < p; row++){
            for(int col = 0; col < q; col++){
                System.out.print(matrice[row][col] + " ");
            }
            System.out.println();
        }


        scanner.close();
    }
}
