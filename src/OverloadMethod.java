import java.util.Scanner;
public class OverloadMethod {

    public static void print1(short a) {
        System.out.println("short arg: " + a);
    }

    public static void print2(int a) {
        System.out.println("int arg: " + a);
    }

    public static void print3(long a) {
        System.out.println("long arg: " + a);
    }

    public static void print4(double a) {
        System.out.println("double arg: " + a);
    }




    public static void print(String stringToPrint){
        System.out.println(stringToPrint);
    }

    public static void print(String stringToPrint, int times){
        for(int i = 0; i < times; i++){
            System.out.println(stringToPrint);
        }
    }

    public static void print( int times, String stringToPrint){
        for(int i = 0; i < times; i++){
            System.out.println(stringToPrint);
        }
    }

    public static void print(int val){
        System.out.println(val);
    }


    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        /*
        La surcharge de méthodes est un concept de programmation qui permet de concevoir plusieurs méthodes portant
        le même nom, mais avec des arguments différents. Lors de l'appel d'une méthode, le langage détermine quelle
        version exécuter en fonction du nombre, du type et de l'ordre des arguments fournis. Grâce à la surcharge,
        vous pouvez déclarer différentes versions d'une méthode portant le même nom, ce qui permet de créer un code
        plus concis et plus facile à comprendre, tout en gérant divers types d'entrées.

        La surcharge permet de modifier la signature d'une méthode : le nombre de paramètres, leur type, ou les deux.
        Si des méthodes ont le même nom, mais un nombre ou un type de paramètres différent, elles sont surchargées.
        Cela signifie que vous pouvez appeler différentes méthodes portant le même nom en leur passant des arguments
        différents.

        Qu'est-ce qu'une signature de méthode ?
        Une signature de méthode est un identifiant unique pour une méthode. Elle comprend le nom de la méthode et
        les types de ses arguments. Elle spécifie le nombre, le type et l'ordre des paramètres attendus par la méthode
        pour déterminer son entrée.


        public int sum(int a, int b);

        Ici, le nom de la méthode est "sum", et elle prend deux paramètres entiers nommés "a" et "b". Cette signature
        indique que la fonction "sum" accepte deux entiers en entrée. Les signatures de méthode permettent de distinguer
        les méthodes portant le même nom, mais acceptant différents types ou quantité de paramètres, et qui peuvent donc
        être surchargées. Lorsqu'une méthode est appelée, le compilateur compare sa signature à celle de la spécification
        de la méthode afin d'identifier la méthode appelée.

        Comment surcharger des méthodes ?
        Prenons l'exemple de quelques méthodes surchargées de la classe standard Math :

        public static int abs(int a) { return (a < 0) ? -a : a; } // abs(int) est déjà défini

        public static float abs(int a) { return (a < 0.0F) ? 0.0F - a : a; } // abs(int) est déjà défini

        Comme l'une de ces méthodes prend un paramètre entier et l'autre un paramètre flottant, mais qu'elles portent
        le même nom, il s'agit d'une surcharge de méthode.

        Il est impossible de déclarer plusieurs méthodes avec la même signature (nom et numéro de la méthode, types et
        ordre des paramètres). L'extrait de code ci-dessous génère une erreur de compilation : `abs(int)` est déjà défini.
        Bien que les méthodes aient des types de retour différents, leurs signatures sont identiques :

        public static int abs(int a) { return (a < 0) ? -a : a; } // abs(int) is already defined

        public static float abs(int a) { return (a < 0.0F) ? 0.0F - a : a; } // abs(int) is already defined

        Voici quatre méthodes d'impression pour imprimer différentes valeurs.

        public static void print(String stringToPrint){
            System.out.println(stringToPrint);
        }

        public static void print(String stringToPrint, int times){
            for(int i = 0; i < times; i++){
                System.out.println(stringToPrint);
            }
        }

        public static void print( int times, String stringToPrint){
            for(int i = 0; i < times; i++){
                System.out.println(stringToPrint);
            }
        }

        public static void print(int val){
            System.out.println(val);
        }

        La première méthode affiche une chaîne de caractères saisie, les deuxième et troisième l'affichent un certain
        nombre de fois, et la dernière affiche une valeur entière. Ces méthodes sont surchargées.

        Appelons ces méthodes :
        */

        print("Bonjour ma chère épouse bien-aimée!");
        print("Hello world !");
        print("Java c'est cool !");
        System.out.println();

        print("Salut", 3);        // Affiche "Salut" 3 fois
        print("Test", 1);         // Affiche "Test" une seule fois
        print("Youpi", 5);        // Affiche "Youpi" 5 fois
        System.out.println();

        print(3, "Bonjour");      // Affiche "Bonjour" 3 fois
        print(2, "Ok");           // Affiche "Ok" 2 fois
        print(5, "Java");         // Affiche "Java" 5 fois
        System.out.println();

        print(42);
        print(2025);
        print(-10);
        System.out.println();

        /*
        Comme vous pouvez le constater, il est possible d'appeler n'importe laquelle de ces méthodes par son nom en lui
        passant les arguments appropriés. Le code affiche :
        Bonjour ma chère épouse bien-aimée!
        Hello world !
        Java c'est cool !

        Salut
        Salut
        Salut
        Test
        Youpi
        Youpi
        Youpi
        Youpi
        Youpi

        Bonjour
        Bonjour
        Bonjour
        Ok
        Ok
        Java
        Java
        Java
        Java
        Java

        42
        2025
        -10


        Notez que lorsque des méthodes ont des paramètres de même type, modifier l'ordre de ces paramètres constitue un
        cas valide de surcharge, comme vous pouvez le constater avec les deuxième et troisième méthodes de l'exemple
        ci-dessus.
        Le mécanisme de surcharge nous permet d'éviter de nommer différemment des méthodes effectuant des opérations
        similaires.
        Surcharge et conversion de type

        Pour comprendre comment la surcharge gère la conversion de type, prenons l'exemple de méthodes surchargées qui ne
        diffèrent que par le type de leur unique argument et voyons quand chacune d'elles sera appelée et pourquoi.

        public class OverloadingExample {

            public static void print(short a) {
                System.out.println("short arg: " + a);
            }

            public static void print(int a) {
                System.out.println("int arg: " + a);
            }

            public static void print(long a) {
                System.out.println("long arg: " + a);
            }

            public static void print(double a) {
                System.out.println("double arg: " + a);
            }

            public static void main(String[] args) {
                print(100);
            }
        }
        */
        print1((short) 100); // casting explicite
        print2(100);
        print3(100L);
        print4(100);
        System.out.println();

        /*
        Maintenant, si nous appelons "print(100)", le programme affiche :
        "int arg: 100"

        On constate ici que "100" est traité comme un "int", et la méthode correspondante est appelée.
        Lorsque le type du paramètre d'une méthode diffère du type de l'argument passé, le compilateur choisit la méthode
        dont le type d'argument est le plus proche, selon l'ordre de conversion implicite.

        Comme tous les littéraux entiers sont traités par défaut comme des "int", le point de départ est "int". Le type
        le plus proche est ensuite "long".

        Supprimons ou commentons la méthode "public static void print(int a)", puis recompilons et exécutons à nouveau
        le programme. Le résultat est conforme aux attentes :

        "long arg: 100"
        Supprimons maintenant également "public static void print(long a)". Comme nous n'avons pas de méthode acceptant
        un argument de type "float", le type suivant, selon l'ordre de conversion implicite, est "double".
        Après recompilation, le programme affiche :

        double arg : 100.0

        Si l'on supprime la méthode "public static void print(double a)", il ne reste que celle qui prend un argument de
        type "short". Le programme ne compilera pas si l'on appelle simplement `print(100)` comme précédemment.

        Voici pourquoi : lorsqu'on passe une valeur à la méthode, le compilateur ne l'évalue pas. Il sait seulement
        qu'il s'agit d'un entier littéral, donc de type "integer".

        Conclusion
        La surcharge de méthodes est un concept essentiel de la programmation orientée objet. Elle permet de rendre le
        code plus concis, plus lisible et plus facile à maintenir, et favorise sa réutilisation. En comprenant la signature
        des méthodes et le comportement du compilateur lors de la correspondance entre les appels et les définitions de
        méthodes, les développeurs peuvent tirer parti de la flexibilité de la surcharge et créer un code plus polyvalent
        et réutilisable.

        Exercice :
        */
        System.out.println("Exercices overloading : ");
        System.out.println("Exercices 1 :");
        method(10, 1.2f);
        method(12.f, 6);
        method(1, 10);
        method(1f, 1f);
        System.out.println();

        System.out.println("Exercices 2 :");
        System.out.println(add(5, 10));
        System.out.println(add(5.5, 10.5));
        System.out.println();

        System.out.println("Exercices 3 :");

        final String type = sc.nextLine();
        switch (type) {
            case "long":
                final long longVal = Long.parseLong(sc.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "int":
                final int intVal = Integer.parseInt(sc.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }
        System.out.println();

        System.out.println("Exercices 4 :");
        method(10);
        System.out.println();




        sc.close();

    }

    // Exercice 4
    public static void method(short s) {
        System.out.println("short");
    }

    public static void method(byte b) {
        System.out.println("byte");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(long l) {
        System.out.println("long");
    }

    // Exercice 3
    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }

    public static int getMaxMinusCurrent(int val){
        return Integer.MAX_VALUE - val;
    }

    // Exercice 2
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // Exercice 1
    public static void method(int i, float f) {
        System.out.println("int float method");
    }

    public static void method(float f, int i) {
        System.out.println("float int method");
    }

    public static void method(int i1, int i2) {
        System.out.println("int int method");
    }

    public static void method(double d1, double d2) {
        System.out.println("double double method");
    }


}
