import java.util.Locale;
import java.util.Scanner;


public class PrintMethode {

    public static void main(String[] args) {

        // LA METHODE "print()".
        System.out.printf("My name is %s. I was born in %d.\n", "Grace", 1983);

        // La première partie est «Mon nom est %s. Je suis né en %d», où %s et %d sont les spécificateurs de format.

        //La deuxième partie est la liste d'arguments : «Mike», 1998.

        //Je peux afficher un integer avec le format spécifique  "%d" .
        System.out.printf("Affiche un Nombre : %d.\n", 1973);

        // Si je veux afficher plusieurs nombres, je dois utiliser plus spécificateurs "%d".
        System.out.printf("La somme de  %d and %d donne %d.\n", 15, 40, 55);

        // Par contre, si je veux afficher un nombre réel (floating-point), il faut utiliser le spécificateur "%f".
        System.out.printf("J'affiche le Nombre %.2f.\n", 15.23);

        // ".2f" fait que le nombre qui sera afficher, sera un nombre avec 2 chiffre après la virgule.

        /* De même, vous pouvez afficher des caractères et des chaînes avec la méthode printf(). Examinez le code
           suivant : pour afficher un caractère, utilisez "%c"; pour une chaîne, utilisez "%s".
        */
        char abbr = 'H';
        String element = "Hydrogène";
        System.out.printf("%c signifie %s.\n", abbr, element);



        // LA METHODE "String.format().
        /*
           La méthode "format()" "de la classe "String" fonctionne de manière très similaire à la méthode "printf()".
           La principale différence réside dans le fait qu'elle renvoie une chaîne au lieu de l'afficher.
           Voyons quelques exemples.
         */

        int age = 52;
        String str = String.format("Je suis agé de %d ans.\n", age);
        System.out.println(str);


        // De même, vous pouvez formater d'autres types de données. Voir le code suivant.
        int age1 = 42;
        char initial = 'G';
        String surname = "Beya Mulumba";
        double height = 1.72;

        String details = String.format("Mon nom est %c. %s.%nJe suis agée de %d ans. %nJe mesure %.2f.", initial, surname, age1, height);
        System.out.println(details);

        /*
        Comme vous pouvez le constater,  nous avons utilisé quatre types de données dans cet exemple.
        Java remplacera %c, %s, %d et %f par l'initiale, le nom, l'âge et la taille respectivement.
        %n est le caractère de saut de ligne qui coupe la ligne à chaque utilisation.

        Gardez à l’esprit que "formatted" est une méthode d’instance tandis que la méthode "String.format" est une méthode
        statique.

        - Une instance est un objet concret créé à partir d'une classe. C’est un exemplaire réel de cette classe en
          mémoire, obtenu avec le mot-clé "new".
        - Classe : C'est un modèle, une structure, un moule ou une recette. Elle décrit ce qu'un objet doit contenir
                   (attributs, méthodes, comportements).

         */
        Voiture v1 = new Voiture();
        v1.marque = "Toyota";
        v1.vitesse = 35;

        Voiture v2 = new Voiture();
        v2.marque = "Honda";
        v2.vitesse = 25;

        System.out.println(v1.marque);
        System.out.println(v2.marque);
        v2.accelerer();
        v1.accelerer();



        /* Résumé
    FORMAT-SPECIFIER    DATATYPE       FORMAT PRINTING                                      FORMATTING A STRING
        %d              int, short,    System.out.printf("Display an Integer %d",15000);    String.format("Display an Integer %d",15000)
                        byte, long

        %c              char            System.out.printf("Display a Character %c",'c');    String.format("Display a Character %c",'c')

        %f              double, float   System.out.printf("Display a Floating-point Number  String.format("Display a Floating-point Number %f",123.45)
                                        %f",123.45);

        %s              String          System.out.printf("Display a String %s","String");  String.format("Display a String %s","String")


        - Méthode d'instance
        Une méthode d'instance est une fonction définie dans une classe qui agit sur une instance particulière (ses attributs).
        Elle nécessite un objet pour être appelée.
        Exemple :
         */

        v1.accelerer(); // méthode d’instance appelée sur l’objet v1
        v2.accelerer(); // méthode d’instance appelée sur l’objet v2

        /*
        À chaque fois :
        "this.vitesse" fait référence à l’attribut de l’instance courante.
        La méthode agit sur cet objet spécifique.

        | Type de méthode        | Appelée sur      | Accès aux attributs d’instance ? | Exemple                   |
        | ---------------------- | ---------------- | -------------------------------- | ------------------------- |
        |   Méthode d’instance   | une instance     | ✅ Oui                            | `voiture1.accelerer();`   |
        |   Méthode statique**   | la classe        | ❌ Non                            | `Voiture.afficherInfo();` |

         */
        // Exemple :
        Voiture v3 = new Voiture();
        v3.marque = "Beya Mulumba";
        v3.vitesse = 35;
        v3.demarrer();  //  méthode d'instance
        Voiture.info(); // méthode statique

        /*
        | Terme                  | Description                           | Exemple                       |
        | ---------------------- | ------------------------------------- | ----------------------------- |
        |   Classe               | Modèle, plan de fabrication           | `class Voiture { ... }`       |
        |   Instance             | Objet créé à partir d’une classe      | `Voiture v1 = new Voiture();` |
        |   Méthode d’instance   | Agit sur les attributs d’un objet     | `v1.accelerer();`             |
        |   Méthode statique     | Appartient à la classe, pas à l’objet | `Voiture.info();`             |


        Conclusion
        Lorsque vous écrivez des applications complexes, il est déconseillé de combiner des chaînes et des variables
        avec un signe "+". Les méthodes "printf()" et "format()" sont spécialement conçues à cet effet.
        Ces deux méthodes fonctionnent exactement de la même manière, à la différence que la méthode "printf()" affiche
        le résultat tandis que la méthode "format()" renvoie une chaîne. Cet article vous a présenté la plupart des
        utilisations de ces deux fonctions.


         */

        String welcome = "Welcome to Java!";
        System.out.printf("Output: %s%n\n", welcome);

        // Create a Scanner object which will allow us to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Use the Scanner's nextLine method to read a line of input
        String name = scanner.nextLine();

        // Use the Scanner's nextInt method to read the next integer
        int height1 = scanner.nextInt();

        // TODO: Print the given statement replacing the placeholders with given inputs using formatted string.
        System.out.printf("Hello, my name is %s and I am %d cm tall.\n\n", name, height1);

        Locale.setDefault(Locale.ENGLISH);
        double pi = Math.PI;
        //write your code below
        System.out.printf("%.3f\n\n", pi);

        String name1 = "Lazy";
        String status = "detected";
        int errorCode = 2;

        //Fix code below
        String formattedMessage = String.format("%s employee %s! Error code: %d", name1, status, errorCode);
        System.out.printf("Result of work - %s\n\n", formattedMessage);


        String name2 = "My name is %c. %s ";
        String age2 = "My age is %d ";
        String height2 = "My height is %.2fm";
        System.out.println(String.format(name2 + age2 + height2, 'M', "Anderson\n\n", 22, 1.53));

        long val = 120L;
        System.out.printf("The distance between two towns %d\n\n", val);

        double num1 = 35;
        double num2 = 23.34;
        System.out.printf("%f %f\n\n", num1, num2);
    }
}
