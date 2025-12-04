import java.util.Scanner;

public class DeclarerLesMethodes {

    // Méthode qui calcule l'aire d'un rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Méthode qui calcule n^m en utilisant la récursion
    public static long power(int n, int m) {
        return (m == 0) ? 1 : n * power(n, m - 1);
    }

    // Méthode qui retourne le signe d'un nombre : 1 pour positif, -1 pour négatif, 0 pour nul
    public static int sign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int getNumberOfMaxParam(int a, int b, int c) {
        if (a >= b && a >= c) {
            return 1; // a est le maximum ou égal aux autres
        } else if (b >= a && b >= c) {
            return 2; // b est le maximum
        } else {
            return 3; // sinon c'est le maximum
        }
    }

    static void calculateVolume(int length, int width, int height) {
        int volume = length * width * height;
        System.out.println(volume);
    }

    public static int countCharacters(String input) {
         return input.length();
    }

    static void printStudent(String name, double averageScore) {
        System.out.println("Name: " + name);
        System.out.println("Average score: " + averageScore);
    }

        // Méthode principale : point d'entrée du programme
    public static void main(String[] args) {
      /*
      DECLARER DES METHODES.
      Les méthodes intégrées sont très pratiques pour gérer les tâches routinières. Cependant, elles ne constituent pas
      une solution miracle, car il est impossible de fournir une méthode standard pour chaque tâche spécifique.
      Par exemple, vous pourriez avoir besoin de convertir des dollars en euros, de calculer vos dépenses mensuelles,
      ou même de calculer la ration quotidienne de graines de votre perroquet à plusieurs reprises.
      C'est là qu'intervient la création de vos propres méthodes pour éviter de dupliquer inutilement votre code !

      Contrairement aux méthodes intégrées, les méthodes définies par l'utilisateur sont créées par le programmeur.
      Il est courant de créer un sous-programme personnalisé pour un usage spécifique.

      Mais comment procéder ? Voyons cela ensemble.
      Syntaxe d'une méthode

      Techniquement, une méthode est simplement une portion de code structurée, composée de plusieurs éléments.
      Prenons l'exemple d'une méthode qui calcule la ration quotidienne de graines pour un perroquet :

      modificateurs         type de             nom de la           liste des paramètres
                             retour              méthode

     public static            int               countSeeds          (int parrotweight, int parrotAge){

                    return parrotWeight / 5 + parrotAge;                <======    CORPS DE LA METHODE.

     }

     Une méthode comprend un ensemble de modificateurs, un type de retour, un nom, une liste de paramètres entre
     parenthèses () et un corps entre accolades {}. La combinaison du nom de la méthode et de la liste de ses paramètres
     constitue sa signature. Dans notre exemple, la signature est "countSeeds(int, int)".

     Certaines méthodes possèdent également une liste d'exceptions ; celles-ci définissent le comportement de la méthode
     en cas d'erreur dans le programme. Si, lors de l'exécution d'une méthode, une exception est levée, celle-ci est gérée
     en dehors de la méthode. Pour l'instant, nous nous concentrerons sur les méthodes simples sans gestion d'exceptions.

     Intéressons-nous maintenant aux principaux éléments nécessaires à l'écriture de méthodes simples.

     NOM DE LA METHODE.
     Chaque méthode possède un nom permettant de l'appeler. Généralement, ce nom reflète sa fonction : affichage,
     recherche, calcul, ou encore affichage d'informations.
     Le compilateur Java exige que le nom d'une méthode soit un identificateur valide. Les règles relatives aux
     identificateurs valides sont les suivantes :
        • les identificateurs sont sensibles à la casse ;
        • un identificateur peut contenir des lettres Unicode, des chiffres, le caractère de soulignement "_" ou des
          symboles monétaires, tels que "$" ;
        • un identificateur ne peut pas commencer par un chiffre ;
        • un identificateur ne doit pas être un mot-clé.

    De plus, une convention de nommage restreint les noms de méthodes possibles. Bien qu'optionnelle, elle est recommandée
    aux développeurs. Par convention, un nom composé d'un seul mot doit être un verbe en minuscules : somme, multiplication
    ou arrondi. En revanche, des noms tels que "enregistré", "étudiants" ou "le plus haut" ne respectent pas cette convention.

    Si une méthode a un nom composé de plusieurs mots, la première lettre du deuxième mot et des suivants doit être en
    majuscule : getValue, calculateNumberOfOranges ou findLetter.


    MODIFICATEURS.
    Les premiers mots sont appelés modificateurs. Il existe deux types de modificateurs en Java : les modificateurs d'accès
    et les modificateurs non liés à l'accès.
    Les modificateurs d'accès définissent la visibilité de la méthode. Ici, nous utilisons le modificateur d'accès "public",
    ce qui signifie que la méthode peut être appelée depuis n'importe quel endroit.

    Les modificateurs non liés à l'accès fournissent des informations à la "JVM" sur le comportement des méthodes.
    Le modificateur "static" indique que la méthode appartient à la classe et qu'elle est accessible sans avoir à créer
    d'objet. Ce type de méthode est appelé méthode statique.

    Si la méthode est déclarée sans le modificateur "static", cela signifie qu'elle ne peut être appelée que par
    l'intermédiaire d'un objet ou d'une instance de cette classe. Ces méthodes sont appelées méthodes d'instance.

    N'oubliez pas qu'il existe un ordre recommandé pour les modificateurs, que vous trouverez dans la spécification du
    langage Java. Dans notre cas, il s'agit de "public static".

    PARAMETRES DE LA METHODE.
    Entre parenthèses, après le nom de la méthode, nous définissons le type, le nombre et l'ordre des paramètres.
    Cela indique comment ils seront transmis à la méthode lors de son appel. Consultez ces signatures :

        convertEurosToDollars(double dlrRate, long eur);
        countMonthlySpendings(long food, long rent, long fun);
        replace(char a, char b);

    Comme vous le savez, il existe aussi des méthodes qui ne reçoivent aucune valeur en paramètre. Ces méthodes sont
    dites non paramétrées.

    CORPS ET INSTRUCTION DE RETOUR.
    Avant qu'une méthode ne termine son exécution et ne se termine, elle renvoie une valeur appelée valeur de retour.
    Le résultat de l'exécution de votre méthode peut être une valeur de type primitif comme int, float, double, boolean,
    ou de type référence comme "String". Prenons l'exemple de notre méthode "countSeeds", dont le type de retour est "int" :

        public static int countSeeds(int parrotWeight, int parrotAge){
            return parrotWeight / 5 + parrotAge;  // Cela retourne un entier.
        }

    Ce que vous voyez entre accolades s'appelle le corps de la méthode. Le corps contient la logique que nous voulons
    implémenter : un ensemble d'instructions à exécuter sur les valeurs passées en paramètre pour obtenir le résultat.
    Notre méthode "countSeeds" prend deux valeurs, effectue certains calculs et renvoie le résultat dans une instruction
    "return".
    Les méthodes ne sont pas obligées de renvoyer une valeur. Si l'on souhaite qu'une méthode n'effectue que des opérations
    sans renvoyer de valeur, on utilise le mot-clé "void" comme type de retour. Prenons l'exemple de la méthode "printSeedsCount" :

    // La méthode suivante se contente d'afficher la ligne, elle ne renvoie donc aucune valeur.
    public static void printSeedsCount(int seeds) {
        System.out.println("Give your parrot " + seeds + "g of seeds per day");
    }

    Lorsque cette méthode est appelée, elle affiche la ligne contenant les recommandations pour nourrir le perroquet et
    ne permet pas de conserver de valeur. Notez qu'elle ne contient aucune instruction de retour.
    Bien que les méthodes de type "void" ne renvoient rien, vous pouvez utiliser le mot-clé "return" pour quitter
    la méthode. Cela s'applique généralement aux méthodes conditionnelles.
    Voir :

    public static void isPositive(int num) {
	    if (num > 0) {
		    System.out.println("the number is positive");
	    } else {
		    return;
	    }
    }

    N'oubliez pas que si vous tentez de renvoyer une valeur depuis une méthode dont le type de retour est void,
    une erreur de compilation sera générée.

    Que se passe-t-il lorsqu'on appelle une méthode ?
    Lorsqu'on appelle une méthode, on peut stocker la valeur de retour dans une variable, l'afficher ou la transmettre
    à une autre méthode. Voici comment cela se présente dans un programme :


    public class Main {
    public static int countSeeds(int parrotWeight, int parrotAge) {
        return parrotWeight / 5 + parrotAge; // it returns an int
    }

    public static void printSeedsCount(int seeds) {
        System.out.println("Give your parrot " + seeds + "g of seeds per day");
    }

    public static void main(String[] args) {
        int myParrotWeight = 100;
        int myParrotAge = 3;

        /**
         * Now myParrotPortion equals 23
         * because our method countSeeds, as described above,
         * calculates parrotWeight / 5 + parrotAge
         */
        /*
         int myParrotPortion = countSeeds(myParrotWeight, myParrotAge);
         printSeedsCount(myParrotPortion);
        }
      }

      Si nous exécutons le programme ci-dessus, le résultat sera le suivant :
      Give your parrot 23g of seeds per day

      Il y a un autre point important à retenir. Lorsqu'on passe une variable de type primitif à une méthode, une copie
      de cette variable est créée avec la même valeur. À l'intérieur de la méthode, seule cette copie est traitée.
      Toute modification apportée à cette copie n'affectera pas la variable d'origine.

      Voir :
      public class Main {
    public static int countSeeds(int parrotWeight, int parrotAge) {
        return parrotWeight / 5 + parrotAge; // it returns an int
    }

    public static void printSeedsCount(int seeds) {
        System.out.println("Give your parrot " + seeds + "g of seeds per day");
    }

    /**
     * The method increases the portion of seeds by 50
     * and prints the resulting value
    */
    /*
        public static void addSeeds(int portion) {
            portion += 50;
            System.out.println("The increased portion is " + portion);
        }

        public static void main(String[] args) {
            int myParrotWeight = 100;
            int myParrotAge = 3;

            int myParrotPortion = countSeeds(myParrotWeight, myParrotAge);
            addSeeds(myParrotPortion); // try to change portion
            // now let's print a portion
            printSeedsCount(myParrotPortion);
            // 100, because the method didn't change portion, only its copy
        }
    }


     Le résultat ressemblera à ceci :
     The increased portion is 73
     Give your parrot 23g of seeds per day

    Bien que la méthode "addSeeds" modifie l'argument passé, cette modification s'applique à une variable différente
    ayant sa propre valeur, laissant intacte la valeur de la variable d'origine.
    Bravo ! Vous avez beaucoup appris sur la déclaration des méthodes et vous progressez à grands pas vers vos objectifs.
    Continuez ainsi à apprendre, à étoffer votre portfolio de projets et à vous rapprocher d'une certification qui
    témoigne de votre implication et de vos réussites.

    Conclusion
    Comme vous le voyez, une méthode est un bloc de code contenant des modificateurs, un type de retour, un nom,
    la liste de ses paramètres et un corps. Une méthode peut retourner une valeur ou ne rien retourner, ce qui est
    indiqué par le mot-clé "void".
    Si vous maîtrisez la syntaxe des méthodes, vous pouvez créer les vôtres et les adapter à vos besoins.
    Cette pratique rendra votre code plus structuré et réutilisable.


    Exercice :
    Rectangles : La forme des choses à additionner
    Complétez le code pour créer une classe Rectangle avec une méthode calculant l'aire d'un rectangle.
    La méthode principale doit appeler cette méthode et afficher le résultat pour un rectangle de longueur 5,0 et
    de largeur 3,0.
    Complétez les espaces vides avec les éléments pertinents.
    */

    System.out.println(calculateRectangleArea(5.0, 3.0));

    /*
    Exercice 2 :
    Élever à la puissance :
    On vous donne la méthode "power" qui prend deux entiers "n" et "m".
    La méthode doit renvoyer la valeur de "nm" sous forme de "long".

    Écrivez le corps de la méthode.
    Sample Input 1:
    4 3

    Sample Output 1:
    64

    Sample Input 2:
    5 0

    Sample Output 2:
    1

    Sample Input 3:
    10 10

    Sample Output 3:
    10000000000
    */
    // Scanner pour lire les entrées utilisateur
    final Scanner scanner = new Scanner(System.in);

    // Lecture de n et m pour la puissance
    System.out.print("Entrez n et m pour n^m : ");
    final int n = scanner.nextInt();
    final int m = scanner.nextInt();
    System.out.println("Résultat de n^m : " + power(n, m));


    /*
    Signe d'un nombre.
    Écrivez une méthode nommée "sign" qui prend un entier ("int") en paramètre et vérifie si ce nombre est négatif,
    positif ou nul. La méthode doit renvoyer respectivement -1, +1 ou 0.

    Exemple d'entrée 1 :
    11

    Exemple de sortie 1 :
    1

    Exemple d'entrée 2 :
    0

    Exemple de sortie 2 :
    0

    Exemple d'entrée 3 :
    -3

    Exemple de sortie 3 :
    -1
    */

    // Lecture d'un nombre pour tester le signe
    System.out.print("Entrez un nombre pour tester le signe : ");
    final int n1 = scanner.nextInt();
    System.out.println("Signe du nombre : " + sign(n1));

    /*
    Trouver le maximum de trois nombres
    Voici la méthode "getNumberOfMaxParam" qui prend trois entiers et renvoie la position du premier maximum dans
    l'ordre des paramètres.
    La méthode doit renvoyer respectivement 1, 2 ou 3.
    Écrire uniquement le corps de la méthode.

    Exemple d'entrée 1 :
    12 3 12

    Exemple de sortie 1 :
    1
    */
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();
    final int c = scanner.nextInt();
    System.out.println(getNumberOfMaxParam(a, b, c));

    /*
    LA METHODE MAIN
    La méthode "main" en Java est la porte d'entrée du monde de la programmation Java. C'est le point de départ de toute
    application Java, l'endroit où l'exécution commence et le fondement sur lequel votre code est construit.
    Dans ce chapitre, nous explorerons l'importance et la structure de la méthode "main", ainsi que son rôle dans le
    lancement de vos programmes Java.

    Déclaration de la méthode "main"
    Java est avant tout un langage orienté objet. Cela signifie qu'un programme Java peut être considéré comme un ensemble
    d'objets communiquant entre eux par l'appel de leurs méthodes respectives. Un programme Java typique comprend de
    nombreuses classes, interfaces, objets et autres concepts issus de la programmation orientée objet.
    Même le programme procédural le plus simple doit comporter au moins une classe et la méthode "main" en son sein pour
    démarrer l'exécution. La méthode "main" est le point d'entrée de toute application. Autrement dit, l'exécution du
    programme commence ici. Depuis Java 7, il n'existe aucun autre moyen de démarrer une application qu'avec cette méthode
    (sauf dans le cas où l'application est lancée dans un conteneur dédié, mais ce cas n'est pas abordé ici).

    Voyons un exemple d'application très simple affichant le texte "Hello, Java" sur la sortie standard :
    */
        System.out.println("Hello, Java");

    /*
    Voici une classe nommée Main. Cette classe contient la méthode principale permettant de démarrer le programme.
    Il est important de noter qu'une classe contenant la méthode principale peut porter n'importe quel nom,
    mais la méthode principale elle-même doit toujours s'appeler "main".

    Examinons de plus près la déclaration de la méthode principale :
    public static void main(String[] args)
        • Le mot-clé "public" indique que la méthode peut être appelée de partout  ;
        • le mot-clé "static" indique que la méthode peut être appelée sans créer d'instance de la classe ;
        • le mot-clé "void" indique que la méthode ne renvoie aucune valeur ;
        • le tableau "args" contient les arguments passés en ligne de commande ; il est vide en l'absence d'arguments.

    Comme vous pouvez le constater, même l'application Java la plus simple repose sur de nombreux concepts.
    Nous les aborderons tous dans les prochains chapitres consacrés aux méthodes et à la programmation orientée objet.
    Pour l'instant, il vous suffit de comprendre comment écrire et exécuter un programme Java simple avec la méthode "main".

    Raccourci clavier : tapez "psvm" (quatre lettres) et appuyez sur la touche Tabulation dans l'environnement de
    développement IntelliJ IDEA pour créer automatiquement une méthode "main" avec le paramètre "args".


    Déclarations invalides de la méthode main
    Si la méthode "main" contient une déclaration invalide, deux cas sont possibles :
        • Votre programme ne peut pas être compilé.
        • Votre programme est compilé avec succès, mais ne peut pas être exécuté.

    Votre programme ne peut pas être compilé. Cela se produit lorsque la déclaration de la méthode "main" enfreint
    la syntaxe de Java.

    Exemples :
        • Déclaration de méthode invalide : absence de valeur de retour (même void).

        public static main(String[] args)

        • Déclaration de méthode invalide : erreur dans le mot-clé ("pulic" au lieu de public).

        public static void main(String[] args)

    Un programme peut être compilé, mais ne peut pas être exécuté. Cela se produit lorsque la méthode main est correctement
    déclarée comme une méthode classique, mais ne satisfait pas aux exigences spécifiques d'une méthode main.

    Exemples :
        • Arguments invalides (devrait être un tableau de chaînes de caractères "String[] args")

          public static void main(String args) {
                    System.out.println("Hello, Java");
          }


        • La déclaration de la méthode ne contient pas le mot-clé "static"

        public void main(String[] args) {
                    System.out.println("Hello, Java");
        }

    Dans les deux cas, une erreur se produit à l'exécution.

    Conclusion
    La méthode "main" est le point d'entrée de tout programme Java. Elle possède une syntaxe très spécifique qu'il est
    important de mémoriser. Sa déclaration doit respecter certaines règles, notamment l'utilisation des mots-clés "public",
    "static" et "void", ainsi que du paramètre "String[] args". Une déclaration incorrecte de la méthode "main" peut
    empêcher la compilation du programme.


    Exercice sur la méthode main :
    Compter le nombre de caractères d'une chaîne de caractères.
    Vous devez créer une méthode Java simple nommée « countCharacters ». Cette méthode lira une chaîne de caractères
    depuis l'entrée standard. Cette chaîne peut contenir n'importe quel caractère ASCII. Votre tâche consiste à calculer
    le nombre total de caractères dans la chaîne et à l'afficher. Par exemple, si la chaîne d'entrée est "Hello, world !",
    votre programme doit afficher « 13 ». N'oubliez pas d'inclure cette méthode dans la méthode « main » de votre programme.

    Exemple d'entrée 1 :
    Hello, world!

    Exemple de sortie 1 :
    13

    Exemple d'entrée 2 :
    Hello

    Exemple de sortie 2 :
    5
    */
    String input = scanner.nextLine();
    System.out.println(countCharacters(input));

    /*
    Qu'est-ce qu'appeler une méthode ?
    Supposons qu'il existe une méthode qui calcule le volume d'une boîte :

    static void calculateVolume(int length, int width, int height) {
    int volume = length * width * height;
    System.out.println(volume);
    }

    Ne vous inquiétez pas, pour l'instant, vous n'avez pas besoin de comprendre tout le code. Il s'agit d'une déclaration
    de méthode, et nous l'aborderons plus loin. Cependant, pour une compréhension plus détaillée, analysons-la :
        • La méthode s'appelle "calculateVolume", et nous utiliserons ce nom pour l'appeler ultérieurement.
        • La partie entre parenthèses déclare les variables que la méthode utilisera. Nous initialisons ces variables
          lors de l'appel de la méthode. Dans l'exemple ci-dessus, il y en a trois : la longueur, la largeur et la hauteur
          d'une boîte.
        • Le code entre accolades est une séquence d'instructions qui sera exécutée lors de l'appel de cette méthode.
          Dans l'exemple, il multiplie simplement trois valeurs passées en paramètres et affiche le résultat.

    Pour appeler une méthode dans votre programme, vous devez écrire son nom et passer les valeurs de ses paramètres
    entre parenthèses. Voici comment procéder :
    */
    calculateVolume(3,  7,  2);

    /*
    Ici, nous appelons la méthode "calculateVolume" avec trois paramètres : 3, 7 et 2. Cela signifie que les variables
    "length", "width" et "height" sont respectivement initialisées avec ces valeurs. Ensuite, le code entre accolades
    est exécuté, calculant le volume et affichant le résultat. L'exécution du programme complet produit donc le résultat
    suivant :

    The volume of a box is equal to 42

    Cela dit, appeler une méthode signifie demander au programme d'exécuter un ensemble de code spécifique au sein de
    cette méthode. Cela implique d'utiliser le nom de la méthode et de fournir les arguments nécessaires.

    Appeler une méthode avec des paramètres différents.
    Comme la méthode que nous appelons dépend des paramètres qui lui sont transmis, si nous lui passons d'autres valeurs,
    le résultat du programme sera également différent.
    */
        calculateVolume(3, 7, 2); // The volume of a box is equal to 42
        calculateVolume(14, 6, 8); // The volume of a box is equal to 672
        calculateVolume(2, 2, 2); // The volume of a box is equal to 8

    /*
    Cependant, lors de l'appel d'une méthode, il est impératif de toujours fournir le nombre et le type corrects des
    arguments attendus. Cela étant dit, les appels suivants généreront une erreur de compilation :

    calculateVolume(1, 2);
    calculateVolume("Hello", true, 6);

    Supposons qu'il existe une autre méthode qui prend en paramètres le nom et la moyenne d'un étudiant, puis les affiche :

    Dans ce cas, la méthode attend que nous lui passions deux valeurs de types différents. Par conséquent,
    voici un exemple d'utilisation correcte de cette méthode :
    */
    printStudent("Grace", 20);

    /*
    Certaines méthodes ne nécessitent aucun paramètre ; elles sont conçues pour fonctionner sans aucune donnée.
    Lors de l’appel de telles méthodes, il n’est pas nécessaire de fournir d’arguments ; il suffit donc de laisser les
    parenthèses vides, comme suit : doSomething().

    Différentes méthodes.
    Certaines méthodes s'appellent de manières légèrement différentes. Examinons-en quelques-unes.
    Pour appeler une méthode depuis l'extérieur de la classe à laquelle elle appartient, il faut indiquer le nom de la
    classe en préfixe. Consultez ces méthodes :
    */
        Math.round(79.378); // method with Math class name
        Character.isLetter('a'); // method with Character class name

    // Essayons d'effectuer une petite tâche en invoquant une méthode:

        double weight = 63.85;
        weight = Math.round(weight); // now weight equals 64.0
        System.out.println("The volume of a box is equal to " + weight);

    /*
    Les méthodes qui agissent sur des instances spécifiques sont appelées méthodes d'instance.
    Ces méthodes nécessitent un objet pour être invoquées. Voyez par exemple :
    */
        String s = "HellO, WoRlD!";
        s = s.toLowerCase(); // hello, world!
        System.out.println(s);

    /*
    Avant d'appeler la méthode "toLowerCase()", nous avons créé un objet de type "String" nommé "s", car cette méthode
    manipule des chaînes de caractères. Nous pouvons maintenant l'appeler sur cette instance, ce qui a pour effet de
    convertir toutes les lettres de notre chaîne en minuscules.
    Comme vous le voyez, cette méthode nécessite la création d'une instance avant de pouvoir être appelée ; c'est pourquoi
    on l'appelle une méthode d'instance. Nous aborderons ce type de méthode plus loin.


    Méthodes intégrées.
    Pourquoi réécrire des algorithmes existants ? Bien sûr, nous ne parlons pas de cas particuliers comme les projets
    pédagogiques. Il est néanmoins plus efficace d'utiliser des méthodes prédéfinies, toujours accessibles à l'utilisateur.
    C'est pourquoi il existe deux types de méthodes en Java : les méthodes intégrées et les méthodes définies par
    l'utilisateur.

    Les méthodes intégrées font partie de la bibliothèque standard Java (SJSL). Elles permettent de convertir ou de comparer
    des valeurs, d'arrondir les nombres à virgule flottante double précision, de trouver la valeur maximale ou minimale,
    et d'effectuer de nombreuses opérations utiles. Nous avons déjà abordé les méthodes "round()" et "isLetter()",
    mais le nombre de méthodes intégrées est considérable et ne cesse de croître. Vous trouverez la méthode dont vous
    avez besoin dans la documentation Oracle. Par exemple, consultez le lien vers la bibliothèque "Math".

    Contrairement aux méthodes intégrées, les méthodes définies par l'utilisateur sont créées par le programmeur.
    Il est courant de créer un sous-programme personnalisé pour un usage spécifique. Nous verrons plus loin pourquoi
    il est judicieux d'utiliser des méthodes définies par l'utilisateur et comment les créer.

    Conclusion
    De manière générale, une méthode est un outil indispensable pour un programmeur soucieux d'un style de code clair et
    réutilisable. Grâce aux méthodes, vous pouvez réaliser n'importe quelle tâche spécifique. Elles rendent le programme
    plus lisible et vous évitent de répéter des lignes de code répétitives. Certaines tâches sont encapsulées dans des
    méthodes intégrées de la bibliothèque standard Java. Il existe également des méthodes définies par l'utilisateur,
    créées par le programmeur. Nous aborderons ces méthodes dans d'autres sections.


    Exercice sur l'appel des méthodes.
    Aire d'un parallélogramme
    Selon la formule, l'aire d'un parallélogramme est le produit de sa base et de sa hauteur. Appelez la méthode
    "countAreaOfParallelogram" qui calcule l'aire du parallélogramme avec les paramètres suivants :
    b et h.

    Un parallélogramme de hauteur 8 et de base 10
    Exemple d'entrée 1 :
    8 10

    Exemple de sortie 1 :
    80
    */
    countAreaOfParallelogram(8, 10);







     scanner.close();
    }

    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}





