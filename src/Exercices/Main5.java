package Exercices;
import java.util.*;

public class Main5 {

    // Méthode qui ajoute une valeur à un élément du tableau à l'index donné
    public static void addValueByIndex(long[] array, int index, long value){
        array[index] += value; // on ajoute value à l'élément situé à la position index.
    }
    public static void method(int[] array) {
        array = new int[] { 1, 2, 3 };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] numbers = { 4, 5, 6 };


        method(numbers);


        System.out.println(Arrays.toString(numbers));
    }
}
