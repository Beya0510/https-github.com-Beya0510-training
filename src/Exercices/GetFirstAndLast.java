package Exercices;
import java.util.*;

public class GetFirstAndLast {

    // La méthode prend un tableau d'entiers et retourne un nouveau tableau
    // contenant uniquement le premier et le dernier élément
    public static int[] getFirstAndLast(int[] array) {
        // Création d'un nouveau tableau avec 2 éléments
        return new int[] { array[0], array[array.length - 1] };
    }

    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur depuis la console
        Scanner scanner = new Scanner(System.in);

        // Lecture d'une ligne complète (ex: "1 2 3 4")
        // puis on découpe la ligne en sous-chaînes avec split(" ") => ["1","2","3","4"]
        // mapToInt(Integer::parseInt) transforme chaque chaîne en entier
        // toArray() convertit le flux d'entiers en un tableau d'entiers
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Appel de la méthode getFirstAndLast pour obtenir un nouveau tableau
        // contenant uniquement le premier et le dernier élément du tableau original
        int[] result = getFirstAndLast(array);

        // Parcours du tableau result et affichage de chaque élément
        // Les éléments sont affichés séparés par un espace
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }

}
