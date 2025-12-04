import java.util.Arrays;
import java.util.Scanner;


public class Tableaux {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        /*
        LES TABLEAUX (ARRAY)
        Lorsque vous devez traiter plusieurs objets du même type, vous pouvez les enregistrer dans un tableau puis les
        traiter ensemble comme une seule unité.
        On peut considérer un tableau comme une collection d'éléments de même type. Tous les éléments sont stockés en
        mémoire de manière séquentielle.
        Tous les éléments d'une collection portent le même nom. Le nombre maximal d'éléments pouvant être stockés est
        déterminé lors de la création du tableau et ne peut être modifié. En revanche, un élément stocké peut être modifié
        à tout moment.

        En Java, un tableau possède les caractéristiques importantes suivantes :
            • un tableau est un type référence ;
            • tous les éléments du tableau sont stockés séquentiellement en mémoire ;
            • chaque élément du tableau est accessible par son indice numérique, le premier élément ayant l’indice 0 ;
            • le dernier élément est accessible par un indice égal à la taille du tableau moins 1 ;
            • il est possible de créer un tableau pour stocker des éléments de tout type.

        Déclaration, instanciation, initialisation.

        Pour créer un tableau contenant des éléments, il faut :
            • déclarer une variable de type tableau (déclaration) ;
            • créer une instance de l’objet tableau (instanciation) ;
            • initialiser le tableau avec des valeurs (initialisation).

        Lorsqu’on déclare une variable, on définit son type et son nom. L’instanciation a lieu lorsqu’une zone mémoire
        est allouée à cet objet. Initialiser l’objet tableau signifie placer certaines valeurs de ce tableau dans la
        mémoire du programme.

        Pour déclarer un tableau, il faut utiliser les crochets "[ ]" après le type des éléments du tableau :

         - int[] array; // forme de déclaration 1.

         - Il peut également être utilisé après le nom de la variable du tableau :
           int array1[];  // forme de déclaration 2.


        Création d'un tableau avec des éléments spécifiés.
        Java propose plusieurs méthodes pour créer un tableau avec des éléments spécifiés.
        La méthode la plus simple pour instancier et initialiser un tableau consiste à énumérer tous ses éléments :
        */
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // instanciation & initialisation d'un tableau de 10 éléments.
        System.out.println("Tableau numbers : " + Arrays.toString(numbers));
        // Seconde façon d'initialiser un tableau en utilisant des variables.
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6;
        int[] numbers1 = {a, b, c, d, e, f};  // instanciation & initialisation d'un tableau de 6 éléments.
        System.out.println("Tableau numbers1 : " + Arrays.toString(numbers1));
        System.out.println();
        /*
        Création d'un tableau avec le mot-clé "new".
        La méthode la plus courante pour créer un tableau consiste à utiliser le mot-clé spécial "new" et à spécifier
        le nombre d'éléments souhaité :
        int n = ...; // n is a length of an array
        int[] numbers = new int[n] ;

        Cette forme est utile lorsque le nombre d'éléments est connu avant le lancement du programme. Lorsqu'on crée
        une instance de l'objet tableau avec une longueur spécifiée, comme "[n]" ou "[5]", sans énumérer explicitement
        ses éléments, le tableau est initialisé avec les valeurs par défaut de son type.

        Le tableau contient alors "n" éléments. Chaque élément est égal à zéro (la valeur par défaut du type "int").
        Il est donc nécessaire d'initialiser explicitement les éléments.

        La taille d'un tableau ne peut pas dépasser "Integer.MAX_VALUE" En réalité, elle est même légèrement inférieure.

        Il est possible de séparer la déclaration et l'instanciation sur deux lignes distinctes.
        int[] numbers; // declaration
        numbers = new int[n]; // instantiation and initialization with default values

        De plus, nous pouvons écrire le mot-clé new et énumérer tous les éléments d'un tableau :
        float[] floatNumbers; // declaration
        floatNumbers = new float[] { 1.02f, 0.03f, 4f }; // instanciation and initialisation.

        Par défaut, un tableau de type primitif est initialisé avec des valeurs par défaut. Pour d'autres valeurs,
        vous devez les renseigner explicitement ou utiliser la classe utilitaire Arrays. Celle-ci offre une méthode
        pratique pour remplir un tableau entier ou une partie de celui-ci avec des valeurs :
        */
        int size = 10;
        char[] characters = new char[size];

        // Elle prend un tableau, un indice de début, un indice de fin (exclu) et la valeur à renseigner dans le tableau.
        Arrays.fill(characters, 0,  size / 2, 'A');
        Arrays.fill(characters, size / 2, size / 2, 'B');
        System.out.println("Tableau caractères : " + Arrays.toString(characters));

        /*
        Longueur d'un tableau
        Pour obtenir la longueur d'un tableau existant, accédez à la propriété spéciale "arrayName.length".
        Voici un exemple :
        */
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // un tableau de nombres.
        int length = tab.length; // nombres d'éléments du tableau.
        System.out.println("Tableau tab : " + Arrays.toString(tab));
        System.out.println("Nombres d'éléments du tableau tab : \n" + length);

        /*
        Accéder aux éléments
        Les valeurs des éléments d'un tableau peuvent être modifiées. Vous pouvez utiliser l'indice pour définir ou
        récupérer une valeur du tableau.

        Définir la valeur par son indice :
            • tableau[indice] = val ;

        Récupérer la valeur par son indice :
            • val = tableau[indice] ;

        Les indices d'un tableau sont des nombres compris entre "0" et la longueur du tableau moins 1.

        Voici un exemple.
        */
        int[] numbers2 = new int[3]; // numbers: [0, 0, 0]
        numbers2[0] = 1; // numbers: [1, 0, 0]
        numbers2[1] = 2; // numbers: [1, 2, 0]
        numbers2[2] = numbers[0] + numbers[1]; // numbers: [1, 2, 3]
        System.out.println("Tableau numbers2 : \n" + Arrays.toString(numbers2));


        /*
        Ce code fonctionne comme suit :
        • À la première ligne, un tableau d'entiers nommé "numbers2", contenant trois éléments, est créé.
          Il est initialisé à "0" pour le type "int".
        • À la deuxième ligne, la valeur "1" est attribuée au premier élément du tableau (l'indice 0).
        • À la troisième ligne, la valeur "2" est attribuée au deuxième élément du tableau (le deuxième élément est `numbers[1]`).
        • À la dernière ligne, la somme des deux premiers éléments est attribuée au troisième élément.

        Si l'on tente d'accéder à un élément inexistant par son indice, une exception d'exécution est levée.

        Par exemple, essayons d'accéder au quatrième élément (d'indice 3) du tableau "numbers2".
        int elem = numbers2[3] ;
        Le programme génère une exception "ArrayIndexOutOfBoundsException".

        Conclusion
        Un tableau est une collection d'éléments de même type. Il permet de stocker les éléments en mémoire de manière
        séquentielle et de les traiter ensemble comme une seule unité. Dans ce chapitre, vous avez appris à déclarer,
        instancier et initialiser un tableau, ainsi qu'à créer un tableau avec des éléments spécifiques.
        Nous vous avons également montré comment créer un tableau à l'aide du mot-clé "new", obtenir sa longueur et
        accéder à ses éléments pour modifier leurs valeurs.

        Exercice :
        Créez un tableau de type "long" nommé "longNumbers" contenant trois éléments : "100000000001", "100000000002"
        et "100000000003".
        Affichez ensuite le tableau.
        Utilisez le modèle de code fourni.
        Le type "long" permet de stocker de grandes valeurs entières. Pour indiquer une valeur de type "long",
        utilisez le littéral "L" ou "l". Sinon, elle sera considérée comme un "int".
        long twentyTwo = 22L; // "L" or "l" is a literal for longs
        */
        long[] longNumbers = {100000000001L, 100000000002L, 100000000003L};
        System.out.println(Arrays.toString(longNumbers));
        System.out.println();

        /*
        Somme des multiples de 3 dans un tableau.
        Écrivez un programme qui effectue les tâches suivantes :
        1. Il prend en entrée un entier "n" indiquant le nombre d’éléments du tableau.
        2. Il prend ensuite en entrée "n" entiers pour les éléments du tableau.
        3. Le programme doit calculer la somme de tous les éléments du tableau qui sont des multiples de 3.
        4. Il doit afficher cette somme.
        */
        int n = sc.nextInt();

        // create your array here
        int[] array = new int[n];
        // use a loop to read the array elements
        for(int i = 0; i < n;i++){
        array[i] = sc.nextInt();
        }
        // use a loop to calculate the sum of elements that are multiples of 3
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(array[i] %3 == 0){
                sum += array[i];
            }
        }
        System.out.println("La somme des multiples de 3 est : " + sum);

        /*
        Traitement des tableaux à l'aide de boucles.
        Il est très utile de traiter un tableau en le parcourant avec une boucle. La propriété "length" d'un tableau
        permet d'éviter une exception "ArrayIndexOutOfBoundsException".
        Vous pouvez remplir un tableau avec le carré de l'indice de son élément. L'exemple ci-dessous illustre cette
        méthode :
        */
       int n2 = 10; // la taille du tableau
       int[] squares = new int[n2]; // Création d'un tableau de la taille spécifiée
       System.out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

       /*Itérer sur le tableau */
       for(int i = 0; i < squares.length; i++){
           squares[i] = i * i; // Définir la valeur par l'index de l'élément
       }
        System.out.println(Arrays.toString(squares));

       /*
       Le code ci-dessus crée un tableau de dix éléments, initialement rempli de zéros. Ensuite, il attribue à chaque
       élément la valeur du carré de son indice. Il convertit le tableau en une chaîne de caractères, en affichant tous
       les éléments entre crochets, et affiche cette chaîne à l'écran.

        Voyons maintenant comment utiliser une boucle pour vérifier l'ordre des éléments d'un tableau.
        Le programme ci-dessous vérifie si le tableau fourni est trié par ordre croissant. Il affiche "OK" si c'est le cas,
        et "BROKEN" dans le cas contraire.
       */
        int[] numbers3 = {1, 2, 3, 4, 5, 10, 6}; // l'ordre est brisé.
        boolean broken = false; // on suppose que le tableau est bien ordonné.

        /* Itération sur le tableau */

        for(int i = 1 ; i < numbers3.length; i++){
            if (numbers3[i] < numbers3[i - 1]){ // Si l'ordre est brisé
                broken = true;  // écrire un résultat
                break;      // termine la boucle
            }
        }

        if(broken){
            System.out.println("BROEKN");
        }else{
            System.out.println("OK");
        }

        /*
        Dans ce programme, pour le tableau fourni, le résultat est "BROKEN".
        Vous pouvez également utiliser les boucles "while" et "do-while" pour parcourir le tableau, mais elles sont
        moins courantes.

        Lecture d'un tableau depuis l'entrée standard.
        Vous pouvez aussi utiliser une boucle pour lire tous les éléments d'un tableau depuis l'entrée standard.
        Par exemple, l'entrée suivante se compose de deux lignes. La première ligne indique la longueur du tableau et
        la seconde ligne contient tous ses éléments.

        5
        101 102 504 302 881

        Nous allons lire ces nombres à l'aide de Scanner (d'autres outils de lecture peuvent aussi être utilisés) puis
        afficher tous les nombres lus.
        */
        int len = sc.nextInt();  //lecture de la longueur
        int[] tab2 = new int[len];  // création d'un tableau avec la longueur spécifiée.

        for(int i = 0; i < len; i++){
            tab2[i] = sc.nextInt(); // lit le prochain nombre du tableau.
        }
        System.out.println(Arrays.toString(tab2));  // sortie de tableau

        /*
        Le programme affiche :
        [101, 102, 504, 302, 881]

        Utilisation de la boucle "for-each".
        Depuis Java 5, une variante de la boucle for, appelée "for-each", est disponible. Elle permet de parcourir
        chaque élément d'un tableau, d'une chaîne de caractères ou d'une collection. Grâce à elle, il n'est plus nécessaire
        de manipuler les indices.

        Voici à quoi elle ressemble :
        for(type var : array){
            instruction utilisant var
        }


        Voici comment l'interpréter : pour chaque élément "var" de type "type" dans le tableau "array",
        exécutez les instructions du corps de la fonction.

        Examinons de plus près ses composants. "type" spécifie le type de la variable qui stockera un élément du tableau
        à chaque itération. Généralement, ce type correspond à celui de l'élément du tableau. La variable "var" contient
        un élément du tableau à chaque itération. Sa valeur change à chaque itération pour stocker l'élément suivant.

        Calculons maintenant le nombre de lettres "a" dans un tableau de caractères donné à l'aide d'une boucle "for-each":
        */
        char[] characters1 = { 'a', 'b', 'c', 'a', 'b', 'c', 'a'};
        int counter = 0;
        for(char ch : characters1){
            if(ch == 'a'){
                counter++;
            }
        }
        System.out.println("Number of 'a' is : "+ counter + ".");

        /*
        La boucle "for-each" présente certaines limitations. On ne peut pas l'utiliser pour modifier un tableau,
        car la variable utilisée pour les itérations ne contient pas l'élément lui-même, mais seulement une copie.
        De même, il est impossible de récupérer un élément par son index, puisque celui-ci n'est pas utilisé.
        Enfin, on ne peut parcourir un tableau en plusieurs étapes par itération : chaque élément est traité individuellement.

        L'absence d'index rend le code plus lisible. La boucle "for-each" permet également d'éviter l'exception
        "ArrayIndexOutOfBoundsException". Ces avantages en font un choix populaire pour l'itération sur les tableaux.

        Conclusion
        L'utilisation de boucles est une méthode pratique pour manipuler un tableau d'éléments. Les boucles permettent
        d'exécuter divers algorithmes, de parcourir un tableau et de lire des données depuis l'entrée standard.
        La boucle "for-each", un type particulier de boucle "for", est fréquemment utilisée pour parcourir chaque élément
        d'un tableau, d'une chaîne de caractères ou d'une collection sans utiliser leurs indices.
        Malgré certaines limitations, elle améliore la lisibilité du code et prévient l'exception "ArrayIndexOutOfBoundsException".


        Exercice :
        Ordre alphabétique.
        Écrivez un programme qui lit un tableau de chaînes de caractères minuscules et vérifie si le tableau est trié
        par ordre alphabétique.

        Voici quelques règles pour comparer deux chaînes de caractères a et b :
        On compare les premiers caractères des chaînes : a[0] et b[0]. Si a[0] précède b[0] dans l’ordre alphabétique,
        alors a précède b. Si les premiers caractères sont identiques, on compare les suivants, et ainsi de suite.
        Si l’une des chaînes ne contient plus de caractères à comparer tandis que l’autre en contient encore,
        la chaîne la plus courte est considérée comme étant en premier dans l’ordre alphabétique.
        Enfin, les chaînes identiques sont toujours triées par ordre alphabétique.

        Vous pouvez utiliser la méthode "compareTo" de la classe "String" pour comparer deux chaînes.
        Si l’objet "String" précède alphabétiquement la chaîne d’argument, le résultat est un entier négatif.
        Le résultat est un entier positif si l’objet "String" suit alphabétiquement la chaîne d’argument.
        Le résultat est zéro si les chaînes sont identiques. Voici exactement ce qu'il vous faut pour comparer deux
        chaînes de caractères par ordre alphabétique !

        Par exemple : "System.out.println("abc".compareTo("acd")); // -1 "abc" < "acd""
        `System.out.println("abc".compareTo("aac")); // 1 "abc" > "aac"`
        `System.out.println("abc".compareTo("abc")); // 0 "abc" = "abc" + Format des données d'entrée`

        La ligne d'entrée unique contient des chaînes de caractères en minuscules séparées par des espaces.

        Format des données de sortie :
        Un seul mot : vrai ou faux.

        Exemple d'entrée 1 :
        a b c

        Exemple de sortie 1 :
        true

        Exemple d'entrée 2 :
        a aa az aza

        Exemple de sortie 2 :
        true
        */

        // Lecture de toute la ligne d'entrée (ex: "a aa az aza")
        // Lecture de toute la ligne d'entrée (ex: "a aa az aza")
        String line = sc.nextLine();

        // Séparation des mots dans un tableau
        String[] words = line.split(" ");

        boolean inOrder = true; // on suppose que le tableau est en ordre

        // Comparer chaque mot avec le suivant
        for (int i = 0; i < words.length - 1; i++) {
            // compareTo() renvoie un nombre négatif si words[i] < words[i + 1]
            if (words[i].compareTo(words[i + 1]) > 0) {
                inOrder = false; // désordre détecté
                break;
            }
        }

        System.out.println(inOrder);
        /*
        🧠 Explication étape par étape :
        1. Scanner scanner = new Scanner(System.in);
           → Permet de lire la ligne entrée par l’utilisateur.
        2. String line = scanner.nextLine();
           → Récupère toute la ligne d’un coup (par ex. "a aa az aza").
        3. String[] words = line.split(" ");
           → Découpe la ligne en mots séparés par un espace.
           Résultat : ["a", "aa", "az", "aza"].
        4. Boucle de comparaison :
           for (int i = 0; i < words.length - 1; i++) {
              if (words[i].compareTo(words[i + 1]) > 0)

          → Compare chaque mot avec le suivant :
           Si compareTo() > 0 → l’ordre alphabétique est brisé.
        5. inOrder reste true → tout est bien trié.
           Sinon → on affiche false.
        6. Résultat final :
           • Entrée : a b c → true
           • Entrée : b a → false
           • Entrée : a aa az aza → true
         */

        /*
        Exercice :
        Somme des éléments d'un tableau supérieurs à une valeur donnée

        Écrivez un programme qui lit un tableau d'entiers et un entier "n". Le programme doit calculer la somme de tous
        les éléments du tableau supérieurs à n.

        Format des données d'entrée
        La première ligne contient la taille du tableau.
        La deuxième ligne contient les éléments du tableau séparés par des espaces.
        La troisième ligne contient le nombre n.

        Format des données de sortie
        Un seul nombre représentant la somme.

        Exemple d'entrée 1 :
        5
        5 8 11 2 10
        8

        Exemple de sortie 1 :
        21

        Exemple d'entrée 2 :
        4
        -5 -4 -6 -11
        -10

        Exemple de sortie 2 :
        -15
       */
        // lecture de la taille du tableau
        int size1 = sc.nextInt();

        // Lecture des éléments du tableau
        int[] numbers4 = new int[size1];
        for(int i = 0; i < size1; i++){
            numbers4[i] = sc.nextInt();
        }

        // lecture du nombre "n3"
        int n3 = sc.nextInt();

        // Calcul de la somme des éléments supérieurs à "n3".
        int sum4 = 0;
        for(int num : numbers4){
            sum4 += num;
        }
        // Affichage du résultat
        System.out.println(sum);

        /*
        Exercice :
        Rotation à droite
        Une rotation à droite est une opération qui décale chaque élément d'un tableau vers la droite.
        Par exemple, si le tableau est {1, 2, 3, 4, 5} et qu'on lui applique une rotation à droite de 1,
        le nouveau tableau sera {5, 1, 2, 3, 4}.
        Si on le fait pivoter de 2, le nouveau tableau sera {4, 5, 1, 2, 3}. Le processus est le suivant :
        {1, 2, 3, 4, 5} → {5, 1, 2, 3, 4} → {4, 5, 1, 2, 3}.

        Implémentez une méthode `rotate` qui effectue une rotation à droite d'un tableau selon un nombre donné.
        Remarque : Si votre solution génère l'avertissement de qualité de code "System.arraycopy est plus efficace",
        veuillez simplement l'ignorer pour ce défi.

        Exemple d'entrée 1 :
        1 2 3 4 5
        1

        Exemple de sortie 1 :
        5 1 2 3 4

        Exemple d'entrée 2 :
        1 2 3 4 5
        2

        Exemple de sortie 2 :
        4 5 1 2 3

        Exemple d'entrée 3 :
        1 2 3 4 5
        8

        Exemple de sortie 3 :
        3 4 5 1 2

        Exemple d'entrée 4 :
        11 21 1 41 51 78 90
        4

        Exemple de sortie 4 :
        41 51 78 90 11 21 1
        */

        sc.close();
    }
}
