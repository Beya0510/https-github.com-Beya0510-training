public class NamingVariables {

    public static void main(String[] args) {
        /*
        * Naming variables
        * Constants, finals variables
        * Comments
        */

        // NAMING VARIABLES
        System.out.println("Hi!");
        System.out.println("I'm a Java programmer.");

        String greeting = "Hello, my name is ";
        System.out.println(greeting + "Jean-Marie.");
        String firstName = "Grace";
        String secondName = "Beya Mulumba";
        System.out.println(firstName + " " + secondName + "\n");



        // CONSTANTS, FINAL VARIABLES
        final double PI = 3.1415;
        final String HELLO_MSG = "Hello, my name is ";
        System.out.println(HELLO_MSG + firstName + " " + secondName + ".");
        System.out.println("The value of PI is " + PI + ".\n");
        final boolean FALSE = false;
        System.out.println(FALSE);
        final int count = 10;
        System.out.println("count  = " + count);
        int cnt = count;
        System.out.println("cnt = " + cnt);
        cnt = 20;
        System.out.println("Now cnt = " + cnt);

        /*
         Final reference variables
         Le mot-clé final peut être utilisé légalement avec des « variables de référence ». Dans ce cas,
         il signifie qu'il est impossible de réaffecter une référence à la variable.
         Voici un exemple avec la "classe StringBuilder" qui est une version mutable de "String".

        final StringBuilder builder = new StringBuilder();
        builder = new StringBuilder(); // error line

        Notez qu'il est toujours possible de modifier l'état interne d'un objet pointé par une variable de référence
        finale, c'est-à-dire que la constante n'est que la variable elle-même (la référence), pas l'objet auquel elle
        fait référence.
        Ainsi, le code suivant est absolument correct :
        */
        final StringBuilder builder = new StringBuilder();
        builder.append("Hello !"); // Ca fonctionne.
        System.out.println(builder.toString());
        // → Ce code change l'état interne d'un objet ("" → "Hello !") par la variable finale (laz constante).
        /*
        Lorsque nous avons invoqué la méthode append(), nous avons modifié non pas l'objet lui-même, mais uniquement
        la valeur de ses champs. La méthode append() est l'une des principales opérations d'un StringBuilder,
        non disponibles dans String. Elle convertit son argument en String, puis ajoute ses caractères à la séquence
        de caractères. Nous aborderons la classe StringBuilder et ses méthodes dans d'autres sections.
         */

        // Depuis Java 11, il est également possible d'utiliser final avec var pour utiliser l'inférence de type
        // automatique pour une variable constante.
        final var FINAL_VAR = 10; // int
        final var MSG = "Hello!"; // String

        System.out.println(FINAL_VAR);
        System.out.println(MSG + "\n");


        // COMMENTS

        // Single line comments
        // The line below will be ignored
        // System.out.println("Hello, World");
        // It prints the string "Hello, Java"
        System.out.println("Hello, Java"); // Here can be any comment

        // Multi-line comments

        /* This is a single-line comment */
        /*  This is an example of
            a multi-line comment */

        /*
        Vous pouvez imbriquer des commentaires de fin de ligne dans des commentaires multilignes :

        System.out.println("Hello"); // print "Hello"
        System.out.println("Java");  // print "Java"

        */


        

    }
}
