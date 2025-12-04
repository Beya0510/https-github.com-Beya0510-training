import java.util.*;

public class DataTypes {

    public static void main(String[] args) {
      // En Java, tous les types de données sont séparées en deux groupes : les types primitifs et les types références.
     /* En Java, il n'existe que 8 types primitifs. Ils sont intégrés à la syntaxe du langage sous forme de mots-clés.
        Les noms de tous les types primitifs sont en minuscules. Le type le plus couramment utilisé est int,
        qui représente un nombre entier.
      */

        int num = 100;

        /* Les types de référence les plus fréquemment utilisés sont String, Scanner et les tableaux.
           Dans la plupart des cas, un objet de type référence peut être créé à l'aide du mot-clé new.
           Ce mot-clé alloue de la mémoire à l'objet créé. On parle alors d'instanciation de l'objet,
           car on en crée une instance. Ensuite, on initialise la variable en lui attribuant une valeur.
           Souvent, comme dans notre exemple, cela se fait en une seule ligne.
         */

       String language = new String("java");

       // Onpeut aussi utilisé un litéral pour les chaînes de caractères :
       String language1 = "java";

        /*
        La première approche, avec le mot-clé new, est courante pour les types référence,
        tandis que la seconde est spécifique aux chaînes. Les deux approches donnent le même résultat pour les chaînes,
        mais présentent des différences techniques que nous n'aborderons pas ici.

        Principale différence
        La principale différence entre les types primitifs et les types référence réside dans le fait qu'une variable
        de type primitif stocke les valeurs réelles, tandis qu'une variable de type référence stocke une adresse en
        mémoire (référence) où se trouvent les données. Les données peuvent être présentées sous la forme d'une structure
        complexe incluant d'autres types de données.

        L'image suivante illustre simplement cette différence. Il existe deux principaux espaces mémoire :
        la pile et le tas. Toutes les valeurs des types primitifs sont stockées dans la pile, tandis que les variables
        de type référence stockent les adresses des objets situés dans le tas.

        Affectation
        La manière de stocker les données affecte également le mécanisme d'affectation de la valeur d'une variable
        à une autre variable :
        - types primitifs : la valeur est simplement copiée ;
        - types référence : l'adresse de la valeur est copiée (les données sont partagées entre plusieurs variables).

        Voici un extrait de code et une image illustrant ce principe :
         */
        int a = 100;
        int b = a; // 100 is copied to b

        String language2 = new String("java");
        String java = language;

        /*
        N'oubliez pas que lorsque vous attribuez une valeur d'une variable de référence à une autre,
        nous faisons simplement une copie d'une référence plutôt que de la valeur elle-même.

        Comparaisons
        Comparer des types référence avec == et != n'est pas la même chose que comparer des types primitifs.
        En fait, lorsque vous comparez deux variables de type String, vous comparez des références (adresses) plutôt
        que des valeurs réelles.

        Le code suivant le démontre :
        */
        String s1 = new String("java"); // adresse différente
        String s2 = new String("java"); // adresse différente
        String s3 = s2;

        System.out.println(s1 == s2); // false, car adresses sont différentes
        System.out.println(s2 == s3); // true
        System.out.println();
        /*
        Il est donc déconseillé d'utiliser des opérateurs de comparaison pour comparer des valeurs.
        La méthode appropriée pour comparer du contenu consiste à invoquer la méthode spéciale equals.
        */

        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println();

        /*
        Le type null
        Contrairement aux types primitifs, une variable de type référence peut faire référence à une valeur null spéciale
        qui représente le fait qu'elle n'est pas encore initialisée ou qu'elle n'a pas de valeur.
        */

        String str = null;
        System.out.println(str); // null
        str = "hello";
        System.out.println(str); // hello

        int myNumber = 10;  //primitive type
        String myString = "Hello, World!";  //reference type
        System.out.println("My number is " + myNumber + " and my string is '" + myString + "'.\n");

    }
}
