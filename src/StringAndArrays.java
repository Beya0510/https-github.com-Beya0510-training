import java.util.Arrays;
import java.util.Scanner;

public class StringAndArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       /*
       Chaînes de caractères et tableaux.
       Il est possible de convertir des chaînes de caractères en tableaux de caractères et inversement grâce à des
       méthodes spéciales comme valueOf() et toCharArray().
       */
        char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };
        String stringFromChars = String.valueOf(chars); // "ABCDEF"
        System.out.println(stringFromChars);

        char[] charsFromString = stringFromChars.toCharArray();// { 'A', 'B', 'C', 'D', 'E', 'F' }
        System.out.println(Arrays.toString(stringFromChars.toCharArray()));

        String theSameString = new String(charsFromString); // "ABCDEF"
        System.out.println(theSameString);
        System.out.println();

        // Il existe une autre façon de convertir une chaîne de caractères en tableau. Voyez plutôt :
        String text = "Hello";
        String[] parts = text.split(""); // {"H", "e", "l", "l", "o"}
        System.out.println(Arrays.toString(parts));

        /*
        Nous avons utilisé ici une méthode beaucoup plus concise qui divise une chaîne de caractères en plusieurs parties.
        Examinons-la plus en détail !

        Fractionner une chaîne.
        Une chaîne peut être divisée en un tableau de chaînes en fonction d'un délimiteur. Pour ce faire, on utilise
        la méthode "split", qui divise la chaîne en sous-chaînes à l'aide d'un séparateur. Dans l'exemple précédent,
        nous avons utilisé le délimiteur `"`, qui divise automatiquement une chaîne en éléments plus petits (sous-chaînes)
        composés d'un seul caractère.

        Si le délimiteur est spécifié, la méthode renvoie un tableau contenant toutes les sous-chaînes. Notez que le
        délimiteur lui-même n'est inclus dans aucune des sous-chaînes.
        */
        String sentence = "a long text";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println();

        /*
        Essayons de décomposer un numéro de téléphone américain en indicatif de pays, indicatif régional, indicatif du
        central téléphonique et autres chiffres restants :
        */
        String number = "+1-213-345-6789";
        String[] parts2 = number.split("-");
        System.out.println(Arrays.toString(parts2));

        /*
        N'oubliez pas que tous ces éléments restent des chaînes de caractères, quelle que soit leur apparence !
        Choisissez judicieusement votre délimiteur, sinon vous risquez d'obtenir des phrases commençant par un espace.
        */
        String text1 = "That's one small step for a man, one giant leap for mankind.";
        String[] parts3 = text1.split(",");
        // {"That's one small step for a man", " one giant leap for mankind."}
        System.out.println(Arrays.toString(parts3));
        System.out.println();

        // Vous pouvez choisir le délimiteur de votre choix, y compris une combinaison d'espaces et de mots :
        String tekst = "I'm gonna be a programmer";
        String[] partz = tekst.split(" gonna be "); // {"I'm", "a programmer"}
        System.out.println(Arrays.toString(partz));
        System.out.println();

        /*
        Comme vous pouvez le constater ici, la méthode de fractionnement est également un bon outil pour se débarrasser
        de quelque chose dont vous n'avez pas besoin ou que vous ne souhaitez pas utiliser.

        Parcourir une chaîne de caractères.
        Il est possible de parcourir les caractères d'une chaîne de caractères à l'aide d'une boucle (boucle "while",
        boucle "do-while", boucle "for").

        Voir l'exemple suivant :
        */
        String scientistName = "Isaac Newton";

        for(int i = 0; i < scientistName.length(); i++) {
            System.out.print(scientistName.charAt(i) +  " ");
        }
        System.out.println();

        /*
        Dans les chaînes de caractères, comme dans les tableaux, l'indexation commence à 0. Dans notre exemple,
        la boucle "for" parcourt la chaîne "Isaac Newton". À chaque itération, la méthode "charAt" renvoie le caractère
        courant à l'indice "i", qui est ensuite affiché dans la console, suivi d'un espace.

        Voici le résultat obtenu :
        I s a a c   N e w t o n


        Conclusion
        Dans ce chapitre, vous avez découvert différentes manières de manipuler une chaîne de caractères. Vous pouvez
        convertir une chaîne en tableau et inversement grâce aux méthodes "valueOf()" et "toCharArray()", ou encore
        diviser une chaîne en sous-chaînes avec la méthode "split()". Vous pouvez également parcourir les caractères
        d'une chaîne à l'aide d'une boucle. Toutes ces méthodes vous aideront à résoudre différents problèmes et à
        améliorer vos compétences en programmation.

        Exercice StringAndArrays : Trouver le mot le plus long d'une phrase
        Écrivez un programme Java qui reçoit une chaîne de caractères représentant une phrase. Votre programme doit
        trouver le mot le plus long de la phrase et l'afficher. On suppose que les mots de la phrase sont séparés par
        un seul espace et qu'il n'y a pas de ponctuation.

        Exemple d'entrée 1 :
        Ceci est une phrase d'exemple

        Exemple de sortie 1 :
        phrase

        Exemple d'entrée 2 :
        Java est un langage puissant

        Exemple de sortie 2 :
        puissant
        */

        String sentence1 = sc.nextLine(); // Lire la phrase entrée par l'utilisateur

        // Découper la phrase en mots (séparés par des espaces)
        String[] wordz = sentence1.split(" ");

        String longestWord = ""; // Variable pour stocker le mot le plus long

        // Parcourir chaque mot du tableau
        for (int i = 0; i < wordz.length; i++) {
            if (wordz[i].length() > longestWord.length()) {
                longestWord = wordz[i]; // Met à jour si on trouve un mot plus long
            }
        }

        // Afficher le mot le plus long
        System.out.println(longestWord);

        /*
        Exercice StringAndArrays : Modifier une chaîne de caractères en changeant des lettres et des chiffres
        En programmation Java, vous disposez d'une chaîne de caractères contenant uniquement des lettres minuscules et
        des chiffres. Votre tâche consiste à modifier cette chaîne selon les règles suivantes : si c'est une lettre,
        remplacez-la par la lettre suivante dans l'alphabet ; si c'est un chiffre, remplacez-le par le chiffre précédent ;
        si le caractère est "0", remplacez-le par "9" ; si le caractère est "z", remplacez-le par "a".
        Vous devez renvoyer la chaîne modifiée.

        Exemple d'entrée 1 :
        abc123

        Exemple de sortie 1 :
        bcd012

        Exemple d'entrée 2 :
        def456

        Exemple de sortie 2 :
        efg34
         */





        sc.close();

    }
}
