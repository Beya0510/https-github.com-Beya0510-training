import java.util.*;

public class ComparingValuesAndRelationalOperators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        Les opérateurs relationnels en Java servent à comparer des valeurs. Ils permettent de déterminer les relations
        entre les variables, par exemple en vérifiant si une valeur est supérieure à une autre ou si deux valeurs sont
        égales. Ces opérateurs sont essentiels pour prendre des décisions et contrôler le flux d'exécution du programme
        en fonction de conditions spécifiques.

        Liste des opérateurs relationnels.
        Java propose six opérateurs relationnels pour comparer les nombres :
        • == (égal à)
        • != (différent de)
        • > (supérieur à)
        • >= (supérieur ou égal à)
        • < (inférieur à)
        • <= (inférieur ou égal à)
        L’application d’un opérateur relationnel à ses opérandes renvoie un booléen (vrai ou faux), quel que soit
        le type des opérandes.
        */

        // Comparer des nombres entiers.
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;

        boolean oneIsOne = one == one; // true
        System.out.println("One is one? " + oneIsOne);
        boolean res1 = two <= three; // true
        System.out.println("Two is less then three? " + res1);
        boolean res2 = two != four;  // true
        System.out.println("Three is different then four? " + res2 );
        boolean res3 = two > four;   // false
        System.out.println("Two is greater then four? " + res3);
        boolean res4 = one == three; // false
        System.out.println("One is equal to three? " + res4);


        /*
        Les opérateurs relationnels peuvent être utilisés conjointement avec des opérateurs arithmétiques dans des
        expressions mixtes. Dans ces expressions, les opérateurs relationnels sont moins prioritaires que les opérateurs
        arithmétiques.
        Dans l'exemple suivant, deux sommes sont d'abord calculées, puis comparées à l'aide de l'opérateur >.
        */
        int number = 1000;
        boolean result = number + 10 > number + 9;
        System.out.println("Le résultat donne : " + result);  // Le résultat est : true (vrai).

        /*
        Opérations relationnelles combinées avec des opérateurs logiques
        En Java, il est impossible d'écrire une expression comme `a <= b <= c`. Il faut combiner deux expressions
        booléennes à l'aide d'opérateurs logiques tels que `||` et `&&`.
        Voici un exemple :
        */

        result = number > 100 && number < 200; // it means 100 < number < 200
        System.out.println("Résultat = " + result);
        // Nous pouvons aussi l'écrire avec des parenthèses comme ceci :
        boolean result1 = (number > 100) && (number < 200);
        System.out.println("Résultat 1 = " + result1);

        /*
        Mais les parenthèses ne sont pas nécessaires ici, car les opérateurs relationnels sont prioritaires sur
        les opérateurs logiques!!!
        Voici un exemple plus général de variables.
        */
        int num = scanner.nextInt();            // it has a value
        int low = 100, high = 200;   // borders

        boolean inRange = num > low && num < high;  // joining two expressions using AND.
        System.out.println("inRange? " + inRange);

        /*
        Le code vérifie si la valeur du nombre appartient à une plage!!!
        Ainsi, les opérateurs logiques permettent de combiner une séquence d'opérations relationnelles en une seule
        expression.

        Exemple :
        Exemple de programme
        Supposons qu'il y ait trois enfants dans le cours de sport. Vous souhaitez vérifier si leurs tailles sont
        classées par ordre décroissant. Le programme suivant lit trois nombres entiers h1, h2 et h3, puis vérifie
        si h1 ≥ h2 et h2 ≥ h3. Notez que h représente la taille d'un enfant.
        */
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrdered = (h1 >= h2) && (h2 >= h3);
        System.out.println(descOrdered);


        // Exercice pour embaucher un candidat
        boolean knowJava = scanner.nextBoolean();
        boolean knowPython = scanner.nextBoolean();
        int yearsOfExperienceInJava = scanner.nextInt();
        int yearsOfExperienceInPython = scanner.nextInt();
        String nameOfCandidate = scanner.next();

        // Condition pour offrir le job
        boolean offerAJob = (knowJava && yearsOfExperienceInJava >= 1)
                || (knowPython && yearsOfExperienceInPython >= 3);

        // Affichage avec printf
        System.out.printf("The job decision for %s is %b%n", nameOfCandidate, offerAJob);

        /*
        Marmottes à la fête - Signaler une faute de frappe Les marmottes aiment organiser des fêtes amusantes et,
        lors de ces fêtes, elles aiment manger des Reese's Peanut Butter Cups. Mais pas trop, sinon elles sont malades !
        Une fête de marmottes réussie comprendra entre 10 et 20 Reese's Peanut Butter Cups, sauf si c'est le week-end,
        auquel cas, il leur en faudra entre 15 et 25. Écrivez un programme Java qui lit deux valeurs :
        la première est le nombre de Reese's Peanut Butter Cups ; la seconde est un booléen indiquant si c'est le week-end.
        Le programme doit afficher une valeur booléenne indiquant si la fête a été réussie. Une fois les valeurs lues,
        vous devez déterminer si la fête a été réussie. Pour cela, vous devrez vérifier deux conditions :
        une pour les jours de semaine et une autre pour les week-ends. N'oubliez pas de tenir compte des intervalles
        spécifiés dans l'énoncé du problème.
        */
        int cups = scanner.nextInt();

        // Lire si c'est le week-end
        boolean isWeekend = scanner.nextBoolean();

        boolean successful;

        if(isWeekend){
            // Week-end : entre 15 et 25 inclus
            successful = cups >= 15 && cups <= 25;
        }else{
            // Semaine : entre 10 et 20 inclus
            successful = cups >= 10 && cups <= 20;
        }

        System.out.println(successful);

        /*
        Exercice :
        Evaluer si la somme de deux nombres fait 20.
        On demande à l'utilisateur d'entrer 3 nombres entiers.
        On évalue en suite si la somme d'au moins 2 des 3 nombres est égale à 20.
        */

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a + b == 20 || b + c == 20 || a + c == 20));

        /*
        Vérifiez la valeur.
        Écrivez un programme qui lit une valeur et vérifie si elle est inférieure à 10.
        Il doit afficher « vrai » si la valeur est inférieure à 10, et « faux » sinon.
        Exemple d'entrée 1 : 5
        Exemple de sortie 1 : vrai
        */
        // Lire la valeur
        int value = scanner.nextInt();

        // Vérifier si elle est inférieure à 10
        boolean isLessThan10 = value < 10;

        // Afficher le résultat
        System.out.println(isLessThan10);






        scanner.close();


    }
}
