import java.util.*;

public class InstructionConditionnelle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        INSTRUCTION CONDITIONNELLE
        L'instruction conditionnelle est une construction qui permet à un programme d'effectuer différents calculs
        selon la valeur d'une expression booléenne. Si l'expression est vraie, le programme effectue un calcul ;
        sinon, si elle est fausse, il en effectue un autre. Voici quelques exemples d'expressions booléennes :
        a > b, i - j == 1, etc.
        L'instruction conditionnelle peut se présenter sous différentes formes. Nous les utiliserons toutes.

        L'instruction conditionnelle simple (if-case).
        La forme la plus simple de l'instruction conditionnelle se compose du mot-clé if, d'une expression booléenne
        entre parenthèses et d'un corps entre accolades.
        Exemple :
        */
        int age = sc.nextInt();
        if(age > 100){
            System.out.println("Very experienced person.");
        }

        /*
        Les cas "if-else".
        Le cas if ci-dessus peut être étendu avec le mot-clé "else" et un autre corps pour effectuer des actions
        alternatives lorsque l'expression est fausse.
        */
        int num =  sc.nextInt();
        if(num%2 == 0){
            System.out.println("It's an even number!");
        }else{
            System.out.println("It's an odd number!");
        }

        /*
        Le code suivant génère des recommandations sur l'ordinateur que vous devez acheter en fonction de votre budget.
        */
        long euros = sc.nextLong();

        if(euros < 1000){
            System.out.println("Buy a laptop.");
        } else if (euros < 2000) {
            System.out.println("Buy a personal computer.");
        }else if (euros < 100_000) {
            System.out.println("Buy a server.");
        }else{
            System.out.println("Buy a data center or a quantum computer.");
        }

        /*
        Lorsqu'ils abordent la question des conditions d'exécution, les programmeurs utilisent souvent le terme
        « instructions de contrôle de flux ». Le flux de contrôle correspond à l'ordre d'exécution des différentes
        parties d'un programme. Vous rencontrerez probablement ce terme dans nos tutoriels et dans d'autres ressources
        externes.

        Exercice :
        L'armée des unités
        Dans un jeu vidéo, chaque joueur dispose d'une armée d'unités.
        Écrivez un programme qui classe l'armée de vos ennemis selon les règles suivantes :
        Unités : Catégorie
        Moins de 1 : pas d'armée
        De 1 à 19 : groupe
        De 20 à 249 : horde
        De 250 à 999 : armée
        1000 et plus : légion

        Le programme doit lire le nombre d'unités et afficher la catégorie correspondante.
        Exemple d'entrée 1 : 5

        Exemple de sortie 1 : groupe

        Exemple d'entrée 2 : 303

        Exemple de sortie 2 : armée
        */
        int category = sc.nextInt();
        if(category < 1){
            System.out.println("no army");
        }else if((category >= 1) && (category <= 19)){
            System.out.println("pack");
        }else if((category >= 20) && (category <= 249)){
            System.out.println("throng");
        }else if((category >= 250) && (category <= 999)){
            System.out.println("zounds");
        }else{ // category >= 1000
            System.out.println("legion");
        }

        /*
        Exercice :
        Ecrire un programme qui affiche "YES" si le nombre est positif, et "NO", si le nombre est négatif.
        On demande à l'utilisateur d'entrer un entier positif, zéro n'est pas considéré ici comme positif!!!
        */
        // start coding here
        int number = sc.nextInt();

        if(number > 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        /*
        Un sommeil réparateur
        Anne a regardé une émission de santé à la télévision et a appris que trop dormir est aussi mauvais pour la santé
        que de ne pas dormir suffisamment. Elle a décidé de suivre les recommandations de l'émission et de noter son
        nombre d'heures de sommeil.
        Vous disposez de trois nombres : A, B et H. Selon l'émission, il faudrait dormir au moins A heures par jour,
        mais pas plus de B heures.
        H représente le nombre d'heures de sommeil d'Anne.

        Tâche : Si Ann dort moins de A heures, affichez « Insuffisance ». Si elle dort plus de B heures,
        affichez « Excès ». Si son sommeil correspond aux recommandations, affichez « Normal ».

        Format d'entrée : trois nombres : A, B, H où A est toujours inférieur ou égal à B.
        Conseil :
        1. N'oubliez pas que les tests sont sensibles à la casse : « excess » ou « EXCESS » est incorrect.
        2. Réfléchissez bien à toutes les conditions. Faites attention aux opérateurs conditionnels :
        distinguez : < et ≤ ; > et ≥.

        Exemple d'entrée 1 : 6 10 8

        Exemple de sortie 1 : Normal

        Exemple d'entrée 2 : 7 9 10

        Exemple de sortie 2 : Excès

        Exemple d'entrée 3 : 7 9 2

        Exemple de sortie 3 : Déficit
        */
        // Lire A, B et H.
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();

        // Vérifier le sommeil
        if(H <A){
            System.out.println("Insuffisant");
        }else if(H > B){
            System.out.println("Excès");
        }else{
            System.out.println("Normal");
        }

        /*
        Détermination de la plage d'un entier : bas, moyen ou haut
        Étant donné un entier « n » en entrée, votre programme doit afficher une chaîne de caractères.
        Si « n » est inférieur à 5, affichez « BAS ». Si « n » est égal à 5, affichez « MOYEN ».
        Si « n » est supérieur à 5, affichez « HAUT ».

        Exemple d'entrée 1 : 3
        Exemple de sortie 1 : BAS

        Exemple d'entrée 2 : 5
        Exemple de sortie 2 : MOYEN
        */

        // YOUR CODE HERE: If 'n' is less than 5, output 'LOW'. If 'n' is exactly 5, output 'MID'. If 'n' is greater than 5, output 'HIGH'.
        // Read an integer from the user
        int m = sc.nextInt();

        // Check the range of n and print the corresponding string
        if (m < 5) {
            System.out.println("BAS");
        } else if (m == 5) {
            System.out.println("MOYEN");
        } else { // m > 5
            System.out.println("HAUT");
        }

        /*
        Déterminer si un nombre est positif, négatif ou nul
        L'utilisateur saisit un nombre. Si le nombre est positif, afficher « Positive ».
        S'il est négatif, afficher « Negative ». S'il est nul, afficher « Zero ».
        */
        int number1 = sc.nextInt();

        // Your code here
        if(number1 > 0){
            System.out.println("Positive");
        }else if(number1 < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        /*
        Intervalle
        Étant donné un entier en entrée, affichez « Vrai » si sa valeur se situe dans l'intervalle
        [-15, 12] ∪ [14, 17] ∪ [19, +∞]. Sinon, affichez « Faux » (sensible à la casse).
        Remarques :
        Les nombres entre parenthèses () sont exclus ;
        Les nombres entre crochets [] sont inclus.

        Exemple d'entrée 1 : 20
        Exemple de sortie 1 : Vrai

        Exemple d'entrée 2 : -20
        Exemple de sortie 2 : Faux
        */
        int n1 = sc.nextInt();

        // Vérifier si n1 est dans l'un des intervalles
        if((n1 >= -15 && n1 <= 12) || (n1 >= 14 && n1 <= 17) || (n1 >= 19)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        // OU

        int N1 = sc.nextInt();

        boolean inInterval = (N1 > -15 && N1 <= 12) ||
                (N1 > 14 && N1 < 17) ||
                (N1 >= 19);

        System.out.println(inInterval ? "True" : "False");


        /*
        Condition sur une ligne avec opérateur ternaire

        Qu'est-ce que l'opérateur ternaire ?
        L'opérateur ternaire évalue une condition et choisit l'un des deux cas à exécuter. On l'appelle aussi opérateur
        conditionnel. Il peut être considéré comme une forme de l'instruction « si-alors-sinon ».
        Malgré leur ressemblance, il ne faut pas confondre l'opérateur ternaire avec l'instruction conditionnelle.
        Cet opérateur s'utilise lorsqu'une expression est attendue.
        */
        int a1 = sc.nextInt();
        int b1 =  sc.nextInt();
        int max1;
        if (a1 > b1){
            max1 = a1;
        }else{
            max1 = b1;
        }
        System.out.println("Maximum1 = " + max1);

        // Voici à quoi ressemble un opérateur ternaire équivalent :

        int a2 = sc.nextInt();
        int b2 =  sc.nextInt();
        int max2 = a2 > b2 ? a2 : b2;
        System.out.println("Maximum2 = " + max2);

        // Syntaxe de l'opérateur ternaire est la suivante :
        // result = condition ? trueCase : elseCase;

        /*
        Elle comprend deux symboles spéciaux ": ?" et ":".

        Ici, la condition est une expression booléenne qui s’évalue à vrai ou faux. Si cette expression est vraie,
        l’opérateur ternaire évalue `trueCase`, sinon `elseCase`. Il est important que `trueCase` et `elseCase` soient
        des expressions qui peuvent être réduites à un type commun. Ce type détermine le type du résultat.
        */
        int num2 = sc.nextInt(); ;  // it's initialized by a value
        System.out.println(num2 % 2 == 0 ? "even" : "odd");
        /*
        Cet opérateur ternaire se compose de trois opérandes : la valeur de l’expression num % 2 == 0,
        et deux chaînes de caractères littérales « even » et « odd ». Son type de résultat est une chaîne de caractères.
        */
        int a3 = sc.nextInt(); // it's initialized by a value
        int b3 = sc.nextInt(); // it's initialized by a value
        String result2 = a3 == b3 ? "equal" :
                a3 > b3 ? "more" : "less";
        System.out.println("Résultat 2 = " + result2);

        int a4 = sc.nextInt();
        int b4 =  sc.nextInt();
        int max4;
        if (a4 > b4){
            max4 = a4;
        }else{
            max4 = b4;
        }
        System.out.println("Maximum4 = " + max4);

        // Voici à quoi ressemble un opérateur ternaire équivalent :

        int a5 = sc.nextInt();
        int b5 =  sc.nextInt();
        int max5 = a5 > b5 ? a5 : b5;
        System.out.println("Maximum5 = " + max5);

        /* Etape 1 : x < y -> 15 < 20 -> vrai

           Etape 2 : Application de l'opérateur ternaire
           La syntaxe du ternaire est :
           condition ? valeur_si_vrai : valeur_si_fausse
           Ici :
           • condition → x < y.
           • valeur_si_vrai → y + x.
           • valeur_si_fausse → y - x.

           Etape 3 : Calculer selon la condition vraie.
           Puisque "x < y" est vrai, on prend "y + x".
           y + x = 20 + 15 = 35

           💡 Explication simple :
            Si x est plus petit que y, on additionne (y + x).
            Sinon, on soustrait (y - x).
            Ici, 15 < 20, donc on effectue l’addition → 35.
           */

            /*
            Résolution du problème des codes de réduction
            Un client bénéficie d'une réduction de 10 % pour tout achat de 100 dollars ou plus. Calculez le prix final
            pour un achat de 120 dollars à l'aide de l'opérateur ternaire et affichez le résultat avec deux décimales.
            Complétez le code pour résoudre ce problème.
            */
            double purchaseAmount = 120.0;
            double discount = purchaseAmount >= 100 ? 0.1 : 0.0;
            double finalPrice = purchaseAmount * (1 - discount);
            System.out.printf("Final price : $%.2f%n", finalPrice);

            /*
             LA BOUCLE FOR.
             Il arrive que l'on doive répéter un bloc de code un certain nombre de fois. Pour cela,
             Java propose la boucle "for". Cette boucle est souvent utilisée pour parcourir une plage de valeurs ou un
             tableau. Si le nombre d'itérations ou les limites de la plage sont connus, il est recommandé d'utiliser
             la boucle "for". Dans le cas contraire, la boucle `while` peut s'avérer plus appropriée.

             LA SYNTAXE DE BASE
             La boucle "for" a la syntaxe de base suivante :

            for (initialisation ; condition ; modification){
                // exécuter quelque chose
            };

            Éléments constitutifs de la boucle :
            • L’instruction d’initialisation est exécutée une seule fois, avant le début de la boucle ; généralement,
              les variables de boucle sont initialisées ici.
            • La condition est une expression booléenne qui détermine la nécessité de l’itération suivante ;
              si elle est fausse, la boucle s’arrête.
            • La modification est une instruction qui change la valeur des variables de boucle ;
              elle est appelée après chaque itération de la boucle ; habituellement, elle utilise l’incrémentation ou
              la décrémentation pour modifier la variable de boucle.

             À l'intérieur du corps de la boucle, le programme peut exécuter n'importe quelle instruction Java valide.
             Il peut même contenir d'autres boucles.

             L'ordre d'exécution d'une boucle `for` est toujours le même :
             1. l'instruction d'initialisation ;
             2. si la condition est fausse, la boucle se termine ;
             3. si la condition est vraie, le corps de la boucle est exécuté ;
             4. la modification est effectuée ;
             5. retour à l'étape 2 (la condition).

            Écrivons une boucle pour afficher les nombres entiers de 0 à 9 sur la même ligne.
            */
            int numero = 9;
            for(int i = 0; i <= numero; i++){
                System.out.print( i + " ");
            }

            /*
            Les variables déclarées dans l'instruction d'initialisation ne sont visibles que dans la portée qui englobe
            toutes les parties de la boucle : la condition, le corps et la modification. Les variables de boucle de type
            entier sont souvent nommées i, j, k ou index.

            Voici un autre exemple. Calculons la somme des nombres entiers de 1 à 10 (inclus) à l'aide de la boucle "for".
            */
        int startIncl = 1, endExcl = 11;

        int somme = 0;
        for (int i = startIncl; i < endExcl; i++ ){
            somme += i;
        }

        System.out.println("Voici la somme de nombre : " + somme);

        int somme2 = 0;
        for (int i = startIncl; i < endExcl; i++ ){
            System.out.println("Avant addition : somme = " + somme2 + ", i = " + i);
            somme2 += i;
            System.out.println("Après addition : somme = " + somme2 );
            System.out.println("--------------------------------------");
        }


        /*
        Ignorer certaines parties
        L'instruction d'initialisation, la condition et les parties de modification sont facultatives ;
        la boucle for peut ne pas toutes les contenir.

        Il est possible de déclarer une variable en dehors de la boucle :
        */
        int i = 10;
        for(; i > 0; i--){
            System.out.println(i + " ");
        }

        /*
        De plus, il est également possible d'écrire une boucle infinie sans aucun de ces éléments :
            for (;;) {
               // do something
            }

        Boucles imbriquées.
        Il est possible d'imbriquer une boucle "for" dans une autre. Cette approche est utilisée pour traiter des
        structures multidimensionnelles telles que les tableaux (matrices), les cubes de données, etc.

        Par exemple, le code suivant affiche la table de multiplication des nombres de 1 à 9 inclus.
        */

        for(int i1 = 1; i1 < 10; i1++){
            for(int j1 = 1; j1 < 10; j1++){
                System.out.print(i1 * j1 + "\t");
            }
            System.out.println();
        }

        /*
        Exercice :
        Nombres divisibles par six
        Trouvez la somme des nombres divisibles par 6 dans la suite de nombres naturels donnée.
        La première ligne de l'entrée indique le nombre d'éléments de la suite ;
        les lignes suivantes contiennent les éléments eux-mêmes.

        Il est garanti qu'il y a toujours un nombre divisible par 6 dans la suite.

        Exemple d'entrée 1 :

        12
        39
        36
        21
        57
        12
        19
        6
        52
        73
        49
        44
        47


        Exemple de sortie 1 : 54
         */
        // Lire le nombre d'éléments de la suite


        int n2 = sc.nextInt();

        int somme1 = 0;

        // Boucle pour lire tous les éléments
        for (int i2 = 0; i2 < n2; i2++) {
            int nombre = sc.nextInt();

            // Vérifier si le nombre est divisible par 6
            if (nombre % 6 == 0) {
                somme += nombre; // Ajouter à la somme
            }
        }

        System.out.println(somme);

        /*
        💡 Explication :
        1. int n = scanner.nextInt(); → lit le nombre d’éléments de la suite.
        2. for (int i = 0 ; i < n ; i++) → boucle pour lire chaque élément.
        3. if (nombre % 6 == 0) → teste si le nombre est divisible par 6.
        4. somme += nombre ; → additionne les nombres divisibles par 6.
        5. System.out.println(somme); → affiche la somme finale.


        Exercice sur la somme de nombres entiers de a à b.
        Somme des entiers de a à b.
        Afficher la somme de tous les entiers de a à b inclus.
        On garantit que a < b dans tous les cas de test.

        Exemple d'entrée 1 : 5
                             21
        Exemple de sortie 1 : 221
        */
        // Lire les bornes a et b.
        int a = sc.nextInt();
        int b = sc.nextInt();

        int somme3 = 0;

        // Boucle pour additionner tous les entiers de a à b.
        for (int i3 = a; i3 <= b; i3++) {
            somme3 += i;
        }

        // Afficher le résultat
        System.out.println(somme3);

        // Lire les bornes a et b.
        int A1 = sc.nextInt();
        int B1 = sc.nextInt();

        int somme4 = 0;

        // Boucle pour additionner tous les entiers de a à b
        for (int i3 = A1; i3 <= B1; i3++) {
            somme4 += i3;
        }

        // Afficher le résultat
        System.out.println(somme4);

        // Version avec ce qu'il se passe dans la boucle.
        int AA = sc.nextInt();
        int BB = sc.nextInt();

        int Somme = 0;

        for (int I = AA; I <= BB; I++) {
            System.out.println("Avant addition : somme = " + Somme + ", I = " + I);
            Somme += I;
            System.out.println("Après addition : somme = " + Somme);
            System.out.println("------------------------");
        }

        System.out.println("Voici la somme totale : " + Somme);

        /*
        Exercice sur la puissance de 2.
        Puissances de deux

        On vous donne un programme inachevé qui doit afficher toutes les puissances de deux inférieures au nombre saisi
        par l'utilisateur.
        */

        long num3 = sc.nextLong();

        // Boucle pour afficher les puissances de 2 inférieures à num3
        for(long i4 = 1; i4 < num3 ; i4 *= i4){
            System.out.println(i4);
        }

        /*
        🔹 Explications détaillées :

        for (long i4 = 1; i4 < num3 ; i4 *= 2)
        Initialisation : i = 1 → commence avec 2⁰ = 1.

        Condition : i4 < num3 → continue la boucle tant que i est inférieur au nombre saisi.
        Incrémentation : i4 *= 2 → à chaque itération, i est multiplié par 2 (c’est-à-dire qu’on passe à la puissance suivante de 2).


        Exercice :
        Notes
        Trouvez le nombre de notes D, C, B et A obtenues lors du dernier examen d'informatique, sachant que n élèves
        d'une classe l'ont réussi.
        Le programme reçoit le nombre "n" en entrée. Cela signifie qu'il y a "n" notes. Ensuite, il récupère les notes,
        une par ligne.
        Créez un programme qui compte le nombre d'occurrences de chaque note et affiche quatre nombres sur une seule
        ligne: le nombre de D, C, B et A (dans cet ordre), séparés par des espaces.

        Exemple d'entrée 1 :
        13
        B
        C
        D
        C
        B
        C
        D
        D
        B
        C
        C
        B
        A

        Exemple de sortie :
        3 5 4 1
        */

        int n = sc.nextInt();  // nombre d'élèves
        sc.nextLine(); // consommer le retour à la ligne après l'entier

        // Compteurs pour chaque note
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        // Lire les notes et compter
        for (int i5 = 0; i5 < n; i5++) {
            String note = sc.nextLine().trim(); // lire une note et enlever les espaces

            if (note.equals("D")) {
                countD++;
            } else if (note.equals("C")) {
                countC++;
            } else if (note.equals("B")) {
                countB++;
            } else if (note.equals("A")) {
                countA++;
            }
        }

        // Afficher les résultats sur une seule ligne
        System.out.println(countD + " " + countC + " " + countB + " " + countA);

        /*
        Explication du code étape par étape.

        public class Main { ... }
        Déclare la classe principale Main. En Java, tout code doit être dans une classe.

        public static void main(String[] args)
        Méthode principale qui est exécutée lorsque le programme démarre.

        Scanner sc = new Scanner(System.in);
        Crée un objet Scanner pour lire les entrées utilisateur.

        int n = sc.nextInt();
        Lit le premier entier qui représente le nombre d’élèves ou le nombre de notes à lire.

        sc.nextLine();
        Consomme le retour à la ligne restant après nextInt().

        Sans ça, la première lecture de note pourrait être vide.
        Déclaration des compteurs :
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        • Initialise à 0 le nombre de notes pour chaque type : D, C, B, A.

        Boucle for (int i = 0; i < n; i++)
        • Parcourt toutes les notes, de i = 0 jusqu’à i = n-1.

        Lecture d’une note :
        String note = sc.nextLine().trim();

        • Lit une ligne de texte (la note) et supprime les espaces avant et après (trim()).

        Vérification et incrémentation :
        if (note.equals("D")) { countD++; }
        else if (note.equals("C")) { countC++; }
        else if (note.equals("B")) { countB++; }
        else if (note.equals("A")) { countA++; }

        Compare la note à "D", "C", "B" ou "A".
        • Incrémente le compteur correspondant si la note correspond.
        • Affichage du résultat :

         System.out.println(countD + " " + countC + " " + countB + " " + countA);
        • Affiche sur une seule ligne le nombre de D, C, B et A séparés par des espaces.

        Fermeture du scanner :
        sc.close();


        WHILE AND DO-WHILE LOOPS.
        THE WHILE LOOP.
        La boucle "while" consiste en un block de code et une condition (une expression booléenne). Si la condition est
        vraie, le code à l'intérieur du block est exécuté. Ce code se répète jusqu'à ce que la condition devienne fausse.
        Puisque cette boucle vérifie la condition avant l'exécution du bloc, la structure de contrôle est également
        appelée boucle de pré-test. On peut considérer la boucle "while" comme une instruction conditionnelle répétitive.

        La syntaxe de base de la boucle "while" est la suivante :
        while (condition){
            // corps : faire quelque chose de répétitif.
        }

        Le corps d'une boucle peut contenir n'importe quelle instruction Java valide, y compris des instructions
        conditionnelles et même d'autres boucles, ces dernières étant appelées boucles imbriquées.

        Il est aussi possible d'écrire une boucle infinie si la condition est toujours vraie.

        while (true) {
           // body: do something indefinitely
        }

        Exemple 1. La boucle suivante affiche les nombres entiers tant que la variable est inférieure à 5.
        */
        int i1 = 0;
        int sum = 0;
        while (i1 <= 5){
            sum += i1;
            System.out.println("i1 = " + i1 + ", somme = "+ sum);
            i1++;
        }
        System.out.println("Somme finale  =  " + sum);
        // prochaine instruction.

        // Exemple 1 : La boucle suivante affiche des nombres entiers tant qu'une variable est inférieure à 5.
        int i2 = 0;
        while (i2 < 5) {
            System.out.println(i2);
            i2++;
        }
        // next statement

        /*
        Explication du fonctionnement de cette boucle.
        Tout d'abord, la valeur 0 est attribuée à la variable "i2". Avant  la première exécution du corps de la boucle,
        le programme vérifie si la condition "i2 < 5" est vraie. Dans notre cas, "i" vaut 0, la condition est donc vraie.
        Le corps de la boucle est exécutée. ce corps contient deux instructions :
        - L'affichage de la valeur actuelle de "i" et son incrémentation de 1.
        - Ensuite, l'expression "i < 5 " est réévaluée. "i" vaut maintenant 1, la condition est donc toujours vraie et
          le corps de la boucle est répétée. Ce processus se répète jusqu'à ce que "i" prenne la valeur de 5, après quoi
          l'expression "i < 5" cesse d'être vraie et l'exécution de cette boucle se termine. Le programme passe alors à
          l'instruction suivante.
        - Notez que la dernière valeur de "i", c'est-à-dire 5, n'est pas imprimée.

        Exemple 2 : Le programme suivant affiche les lettres anglaises sur une seule ligne.
        */
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.println(letter);
            letter++;
        }

        /*
        Le programme prend la première lettre « A » et procède ainsi :
        • si la lettre est inférieure ou égale à « Z », le programme entre dans le corps de la boucle ;
        • à l’intérieur de ce corps, il affiche le caractère courant et passe à la lettre suivante de l’alphabet.

        La boucle "do-while".
        Dans une boucle "do-while", le corps du bloc est exécuté en premier, puis la condition est testée.
        Si la condition est vraie, les instructions du bloc sont exécutées à nouveau. Ce processus se répète jusqu'à ce
        que la condition devienne fausse. Comme la boucle "do-while" vérifie la condition après l'exécution du bloc,
        on l'appelle souvent boucle à post-test. Contrairement à la boucle while, qui teste la condition avant l'exécution
        du code du bloc, la boucle "do-while" est une boucle à condition de sortie. Ainsi, le code du bloc est toujours
        exécuté au moins une fois.

        Cette boucle comprend trois parties : le mot-clé do, un corps et while(condition).
        do {
            // body: do something
        } while (condition);

        Un bon exemple d'utilisation est un programme qui lit des données depuis l'entrée standard jusqu'à ce que
        l'utilisateur saisisse un nombre ou une chaîne de caractères. Le programme suivant lit les nombres entiers
        depuis l'entrée standard et les affiche. Si le nombre 0 est saisi, le programme l'affiche puis s'arrête.
        L'exemple suivant illustre la boucle "do-while" :
        */
        int value;
        do {
            value = sc.nextInt();
            System.out.println(value);
        }while (value != 0);


        /*
        Lecture d'une séquence de longueur inconnue.
        La boucle while permet également de lire une séquence de caractères de longueur arbitraire. Pour cela,
        on peut appeler la méthode "hasNextInt()" de "Scanner" dans la condition. Cette méthode attend une éventuelle
        saisie d'entier par l'utilisateur et renvoie "true" si l'élément suivant est un entier ; sinon, false.

        Voici un exemple de code qui calcule la somme de tous les éléments de la séquence fournie :
        */
        int somme5 = 0;
        while(sc.hasNextInt()){
            int element = sc.nextInt();
            somme5 += element;
        }
        System.out.println(somme5);

        // Version améliorée
        int somme6 = 0;
        System.out.println("Entrez des nombres à additionner (tapez 'stop' pour terminer) :");

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int element1 = sc.nextInt();
                somme6 += element1;
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("stop")) {
                    break; // sort de la boucle
                } else {
                    System.out.println("Entrée non valide, essayez encore :");
                }
            }
        }
        System.out.println("Somme totale = " + somme6);


        /*
        Si la séquence d'entrée est 1 2 3, le code affiche 6 ; si elle est 5 18 9 23 4, il affiche 59.
        La méthode "hasNext()" et les méthodes similaires attendent de savoir si un jeton est disponible pour la saisie.
        Si vous implémentez cela dans votre programme, vous constaterez qu'il attend indéfiniment une entrée de la console.
        La méthode ne renverra "false" que lorsque aucun jeton n'est disponible. Pour quitter un tel programme,
        vous pouvez envoyer le signal EOF (End-Of-File) à la console, indiquant ainsi qu'aucune autre entrée n'est possible.
        Pour envoyer ce signal, appuyez sur "Ctrl + Z" puis "Entrer" sous Windows. Sous Linux, appuyez sur "Ctrl + D" et
        sous macOS, sur "cmd + D". Certaines applications, comme IntelliJ IDEA, interprètent Ctrl + D comme "EOF" même
        sous Windows ; essayez différentes combinaisons pour trouver celle qui vous convient.

        Le signal "EOF" est cependant peu utilisé, car des instructions comme "break" et "continue" permettent de manipuler
        la boucle si nécessaire. Nous examinerons ces deux points en détail dans un prochain article.


        Exercice : Determine the result.
        */
        int i4 = 5;
        do{
            i4++; // On incrémente d'abord de 1 et ensuite on commence à traiter!
            System.out.println(i4 + " ");
            i4 -= 2;
        }while(i4 > 1);  // 6543

        /*
        Exercice : Powers of two.
        Voici un programme inachevé qui devrait afficher toutes les puissances de deux inférieures au nombre saisi par
        l'utilisateur. Complétez la boucle while pour que le programme fonctionne correctement.
        */
        long num4 = sc.nextLong();
        long result3 = 1;

        while(result3 < num4){
            System.out.println(result3);
            result3 *= 2;
        }

        /*
        Explications 👏.
        Tu touches ici à une **subtilité logique importante** des boucles `while` en Java.

        Regardons ton code :
        long num4 = sc.nextLong();
        long result3 = 1;

        while (result3 < num4) {
            System.out.println(result3);
            result3 *= 2 ;
        }

        🔍 Ce qu’il fait :
            • tu demandes un nombre à l’utilisateur (`num4`)
            • tu démarres avec `result3 = 1`
            • à chaque tour :
                * tu affiches "result3"
                * tu multiplies "result3" par 2.

        La boucle continue tant que "result3" est inférieur à "num4".

        💡 Pourquoi tu n’as pas besoin d’un "i++".
        Tu n’as pas besoin d’incrémenter parce que ta variable "result3" change déjà à chaque itération grâce à :
        result3 *= 2 ;

        Ce qui équivaut à :
        result3 = result3 * 2 ;
`
        ➡️ Donc tu modifies bien la valeur de ta variable de contrôle dans la boucle.
        C’est cette modification qui permet à la condition "result3 < num4" de finir par devenir fausse (et donc,
         de sortir de la boucle).

        🔁 Exemple concret
        Si "num4 = 50", la boucle se déroule ainsi :

        | Itération | result3 avant | Affiche | result3 après `*=2`            |
        | --------- | ------------- | ------- | ------------------------------ |
        | 1         | 1             | 1       | 2                              |
        | 2         | 2             | 2       | 4                              |
        | 3         | 4             | 4       | 8                              |
        | 4         | 8             | 8       | 16                             |
        | 5         | 16            | 16      | 32                             |
        | 6         | 32            | 32      | 64  (boucle stop, car 64 ≥ 50) |

        🧠 En résumé
        • Dans une boucle "while", tu dois toujours modifier la variable de contrôle d’une manière ou d’une autre pour
          éviter une boucle infinie.
        • Ce n’est **pas obligé** d’être `i++`.

        Ça peut être :
        • "i++" → si tu comptes de 1 en 1
        • "i += 2" → si tu comptes de 2 en 2
        • "i *= 2" → si tu doubles à chaque fois (ton cas)
        • "i /= 10" → si tu divises à chaque tour, etc.


        Exercice : Les boucles "while" and "do-while".

        Course aux degrés Celsius : Une ascension fulgurante jusqu'à l'arrêt
        Écrivez un programme Java qui lit une séquence de relevés de température en degrés Celsius jusqu'à ce qu'une
        valeur de 100 degrés ou plus soit rencontrée. Votre programme doit afficher la température la plus élevée
        enregistrée jusqu'à ce point. Vous devez prendre en entrée une séquence de valeurs entières de température et
        afficher la valeur la plus élevée avant que la condition d'arrêt ne soit atteinte.

        INDICE : Considérez que vous ne traitez que des températures positives.
        */
        // 1. Le programme doit lire des températures (valeurs entières positives.
        // 2. Il doit s'arrêter dès qu'une température >= 100 est rencontrée.
        // 3. Afficher la plus haute température enregistrée avant celle qui déclenche l'arrêt.
        int maxTemperature = sc.nextInt();

        while (true) {
            int temp = sc.nextInt(); // lire une température.

            if(temp >= 100){
                break; // arrêter la boucle si 110 ou plus.
            }

            if(temp > maxTemperature){
                maxTemperature = temp;
            }
        }
        System.out.println(maxTemperature); //

        // Version avec do-while
        int maxTemperature1 = 0;
        int temp1; // variable pour stocker la température lue

        do {
            temp1 = sc.nextInt(); // lire une température

            if (temp1 < 100 && temp1 > maxTemperature) {
                maxTemperature = temp1; // mettre à jour le max si la température < 100
            }

        } while (temp1 < 100); // continuer tant que temp < 100.


        // Version avec une boucle "for".
        int maxTemperature2 = 0;

        for (;;) { // boucle infinie
            int temp2 = sc.nextInt(); // lire une température

            if (temp2 >= 100) {
                break; // arrêter la boucle si temp >= 100
            }

            if (temp2 > maxTemperature2) {
                maxTemperature2 = temp2; // mise à jour du max
            }
        }

        System.out.println(maxTemperature2); // afficher la température maximale avant 100+

        /*
        Exercice : The sequence.
        On vous donne une suite de nombres naturels. Trouvez le plus grand élément divisible par 4.
        L'entrée du programme est la suivante :
            - 1. Le premier nombre est le nombre total d'éléments de la suite.
                 Utilisez ce nombre comme condition pour votre boucle.
            - 2. Les nombres suivants font partie de la suite et doivent être évalués.

        Les nombres de la suite peuvent être ou non divisibles par 4. Le programme doit afficher un seul nombre :
        le plus grand élément de la suite divisible par 4.
        Essayez de résoudre ce problème à l'aide d'une boucle "while".

        Remarque : Le premier nombre passé au programme (le nombre total d'éléments de la suite) ne fait pas partie de
        la suite.
        */
        int n3 = sc.nextInt(); // lire le nombre total d'éléments.
        int count = 0; // compteur pour la boucle.
        int maxDiv4 = 0;  // variable pour stocker le max divisible par 4.

        while(count < n3){
            int num5 = sc.nextInt(); // lire l'élément suivant
            if((num5 % 4 == 0) && (num5 > maxDiv4)){
                maxDiv4 = num5;   // mettre à jour le maximum si divisible par 4.
            }
            count++;  // incrémenter le compteur
        }
        System.out.println(maxDiv4);


        /*
        L'INSTRUCTION BREAK.
        L'instruction `break` a deux utilités :
          • elle interrompt la boucle courante, quel que soit son type ("for", "while", "do-while") ;
          • elle interrompt une instruction "case" dans une instruction "switch".
        Dans ce chapitre, nous apprendrons à l'utiliser pour interrompre les boucles.

        L'exemple suivant illustre une boucle contenant une instruction `break`.
         */
        int i5 = 10;
        while(true){ // la condition maintient la boucle.
                if(i5 == 0){ // la condition permettant d'effectuer la rupture qui arrête cette boucle.
                break;
            }
            System.out.println("i5 = " + i5);
            i5--;
        }

        // version 2 : déplacer la condition vers la boucle.
        int i6 = 10;
        // la condition permettant d'effectuer la rupture qui arrête cette boucle.
        while (i6 != 0) { // la condition maintient la boucle.
            System.out.println("i = " + i6);
            i6--;
        }

        /*
        Dans le code ci-dessus, la condition de poursuite de la boucle est toujours vraie, mais celle-ci sera correctement
        interrompue lorsque la variable "i" prendra la valeur "0" grâce à l'instruction "break" à l'intérieur de la condition.
        L'instruction "break" interrompt uniquement la boucle dans laquelle elle se trouve. Si cette boucle est imbriquée
        dans une autre, cette dernière ne sera pas interrompue.

        Le code suivant affiche une suite de nombres.
        */
        for(int i7 = 0; i7 < 10; i7++){
            for(int j7 = 0; j7 < 10; j7++){
                System.out.print(j7 + " ");
                if (i7 == j7){
                    break;
                }
            }
            System.out.println();
        }

        /*
        Pour arrêter la boucle externe, nous pourrions déclarer une variable booléenne « stopped » et l'utiliser comme
        un indicateur booléen spécial.
        */

        boolean stopped = false;
        for(int i8 = 0; i8 < 10 && !stopped; i8++){
            for(int j8 = 0; j8 < 10; j8++){
                System.out.println(j8 + " ");
                if(i8 == j8){
                    stopped = true;
                    break;
                }
            }
            System.out.println();
        }
        /*
        Le résultat du programme n'est plus le même : 0.

        Il existe une autre façon d'interrompre la boucle externe : l'opérateur "break" avec étiquette.
        Cependant, son utilisation est déconseillée. Faites une recherche sur Google si cela vous intéresse.

        Voici un exemple illustrant l'utilisation de "break" avec une étiquette :
        */
        outerLoop :

        for (int i9 = 0; i9 < 10; i9++) {
            for (int j9 = 0; j9 < 10; j9++) {
                System.out.print(j9 + " ");
                if (i9 == j9) {
                    break outerLoop; // Break out of both loops.
                }
            }
            System.out.println();
        }

        /*
        L'instruction "continue".
        Elle permet à une boucle de passer à l'itération suivante, sans s'arrêter.
        Cette instruction peut être utilisée dans n'importe quel type de boucle.
        Dans une boucle "for", l'instruction "continue" transfère immédiatement l'exécution à l'instruction
        d'incrémentation/décrémentation.

        Dans une boucle "while" ou "do-while", l'exécution est immédiatement transférée à la condition.

        Dans l'exemple suivant, une séquence de nombres est affichée. Les nombres impairs sont ignorés.
        */

        int n4 = 10;
        for(int i10 = 0; i10 < n4; i10++){
            if(i10 % 2 != 0){
                continue;
            }
            System.out.println(i10 + " ");
        }

        /*
        Les instructions "continue" et "break" n'affectent que la boucle dans laquelle elles se trouvent.
        L'instruction "continue" ne permet pas d'ignorer l'itération en cours de la boucle externe.

        Souvent, il est possible de réécrire une boucle sans utiliser l'instruction "continue".
        Voici un exemple :
        */
        int n5 = 10;
        for (int i11 = 0; i11 < n5; i++) {
            if (i11 % 2 == 0) {
                System.out.print(i11 + " ");
            }
        }

        /*
        Le résultat est identique à celui présenté précédemment, mais le code est plus court et plus lisible.
        Il est important de noter que l'utilisation excessive d'instructions conditionnelles conduit à un code mal
        structuré, car les conditions de vos boucles ne correspondent pas toujours à l'exécution souhaitée.
        Par conséquent, utilisez-les judicieusement :
        uniquement lorsqu'elles permettent de raccourcir le code et de le rendre plus compréhensible.



        Exercice : Printing numbers.
        How many numbers does the following code print?
        */
        for (int i12 = 0; i12 < 5; i12++) {
            System.out.println(i);
            for (int j10 = 0; j10 < 5; j10++) {
                System.out.println(j10);
                break;
            }
        } // => Affiche 10 chiffres (5 pour la boucle externe et 5 pour la boucle interne.

        /*
        Exercice : Boucle for : ignorer un certain nombre d'itérations et s'arrêter prématurément.
        Si l'on commence à compter de 1 et que l'on vise à atteindre 10 à l'aide d'une boucle « for »,
        comment programmer le système pour qu'il ignore le nombre 5 et s'arrête à 8 au lieu d'atteindre 10 ?
        Essayez de compléter le code.
        */
        for(int i13 = 0; i13 <= 10; i13++) {
            if(i13 == 5){
                continue; // skip 5!
            }
            if(i13 == 8){
                break; // Arrête la boucle quand "i13" est égal à 8. Il n'affiche pas 8!!!!
            }
            System.out.println("Nombre : " + i13);
        }

        /*
        Exercice : Affichage de nombres
        Combien de nombres le code suivant affiche-t-il ?
        */
        for(int i14 = 0; i14 < 5; i14++) {
            System.out.println(i14);
            if(i14 < 3){
                continue;
            }else{
                for(int j14 = 0; j14 < 5; j14++) {
                    System.out.println(j14);
                }
            }
        }
        /*
        Explications du code ci-dessus.

        Analyse du code pas à pas, car avec "continue" et des boucles imbriquées, c’est important de suivre la logique
        exacte :

        for (int i14 = 0; i14 < 5; i14++) {
            System.out.println(i14);
            if (i14 < 3) {
                continue;
            } else {
                for (int j14 = 0; j14 < 5; j14++) {
                    System.out.println(j14);
            }
        }

        🔍 Étape par étape
        Boucle externe : "for(int i14 = 0; i14 < 5; i14++)"
        - "i14" prend les valeurs : 0, 1, 2, 3, 4 → 5 itérations

        À l’intérieur :
        1️⃣ `System.out.println(i14);` → **affiche toujours i14** à chaque itération.
        2️⃣ `if(i14 < 3) continue;`
        - Pour `i14 = 0, 1, 2` → "continue" sautera le reste du corps de la boucle → la boucle interne n’est jamais
          exécutée.
        3️⃣ `else` → exécuté **uniquement pour i14 ≥ 3** → boucle interne :
            for(int j14 = 0; j14 < 5; j14++) {
                System.out.println(j14);
            }
        - Affiche `0, 1, 2, 3, 4` **5 nombres à chaque itération externe** pour `i14 = 3` et `i14 = 4`.

        🔢 Compter le total

        | i14 | Impressions  |
        | --- | ------------ |
        | 0   | 0            |
        | 1   | 1            |
        | 2   | 2            |
        | 3   | 3 + 0..4 → 5 |
        | 4   | 4 + 0..4 → 5 |

        * Détail :
        * i14 = 0 → affiche 0 → 1 nombre
        * i14 = 1 → affiche 1 → 1 nombre
        * i14 = 2 → affiche 2 → 1 nombre
        * i14 = 3 → affiche 3 + boucle interne 0..4 → 6 nombres
        * i14 = 4 → affiche 4 + boucle interne 0..4 → 6 nombres

        ✅ Total = 1 + 1 + 1 + 6 + 6 = 15 nombres


        Exercice : Interrompre et continuer. Branchement

        Itération sur les entiers avec conditions sélectives et arrêt
        Écrivez un programme Java qui prend un entier en entrée et parcourt tous les entiers de 1 à cet entier (inclus).
        Si l'entier est divisible par 5, le programme doit passer au nombre suivant sans rien afficher.
        Pour tous les autres entiers, affichez-les, mais s'ils sont divisibles par 7, arrêtez l'itération et affichez
        l'entier suivi de « : arrêté ». Implémentons-le.
        */
        int n6 = 10;
        for (int i15 = 0; i15 < n6; i15++) {
            if (i15 * i15 < 36) {
                continue;
            }
            System.out.print(i + " ");
        }

        int limit = sc.nextInt();
        int number2 = 0;

        while(true){
            number2++;
            if(number2 > limit){
                break;
            }
            if(number2 % 4 == 0){
                continue;
            }
            System.out.println(number2 + " ");
        }

        /*
        Le control flow (ou flux de contrôle en français) désigne l'ordre dans lequel les instructions d'un programme
        sont exécutées par l'ordinateur.

        INSTRUCTION SWITCH
        Quand une instruction conditionnelle n'est pas idéale
        Supposons que vous deviez écrire un programme qui effectue différentes actions selon la valeur d'une variable.
        Par exemple, choisir une action dans le menu d'un jeu. Pour ce faire, vous pouvez utiliser une instruction
        conditionnelle à plusieurs branches, comme illustré ci-dessous.
        */
        int action = sc.nextInt(); // a certain value from 1 to 4

        if (action == 1) {
            System.out.println("Starting a new game...");
        } else if (action == 2) {
            System.out.println("Loading a saved game");
        } else if (action == 3) {
            System.out.println("Displaying help...");
        } else if (action == 4) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Unsuitable action, please, try again");
        }

        /*
        Bien sûr, ce code remplit sa fonction. Mais si votre instruction conditionnelle comporte de nombreuses branches,
        elle peut être difficile à comprendre.

        Trois mots-clés : switch, case et default
        L’instruction "switch" permet de choisir entre plusieurs cas en fonction de la valeur d’une seule variable
        (et non d’une expression !). Cette variable peut être un entier, un caractère, une chaîne de caractères ou
        une énumération.
        Avec l’instruction switch, le code précédent se présente comme suit :
        */
        switch(action){
            case 1:
                System.out.println("Starting a new game...");
                break;
            case 2:
                System.out.println("Loading a saved game...");
                break;
            case 3:
                System.out.println("Displaying help...");
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Unsuitable action, please, try again");
        }
        /*
         Comme vous pouvez le constater, ce code est bien structuré et plus facile à lire que l'instruction
         conditionnelle d'égalité.

         Forme générale de l'instruction switch
         La forme la plus générale de l'instruction switch est la suivante :

         switch (variable) {
            case value1:
                // do something here
                break;
        case value2:
                // do something here
                break;

        //... other cases

        case valueN:
                // do something here
                break;
        default:
                // do something by default
                break; // it can be omitted
        }

        Les mots-clés "switch" et "case" sont obligatoires. Les mots-clés "break" et "default" sont facultatifs.
        Le mot-clé "break" interrompt l'exécution de l'instruction "switch" entière, et non d'un seul "case".
        Si un "case" ne contient pas le mot-clé "break", le "case" suivant sera également exécuté, y compris le "default".
        Le "default" est aussi exécuté s'il n'existe aucun autre "case" correspondant à la valeur de la variable.
        Le mot-clé "break" dans la branche "default" est facultatif et peut être omis.

        Une section "case" peut contenir n'importe quel bloc de code, même une instruction "switch" imbriquée.
        Cependant, il est recommandé d'éviter autant que possible les structures de code profondément imbriquées.

        Un exemple avec « zéro », « un » et « deux ».
        Prenons un autre exemple. Le code suivant affiche les noms des nombres entiers ou un texte par défaut.
        Cette instruction switch comporte trois cas de base et un seul cas par défaut.
        */

        int val = sc.nextInt();
        switch (val) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("The value is less than zero or greater than two");
        }

        /*
        Exercice :
        Afficher le jour de la semaine à partir d'un entier.
        Écrivez un programme qui lit un entier compris entre 1 et 7 saisi par l'utilisateur, représentant un jour de
        la semaine (1 pour lundi, 2 pour mardi, etc.). À l'aide d'une instruction "switch", affichez le jour de la
        semaine correspondant. Si la saisie n'est pas comprise entre 1 et 7, affichez «Saisie invalide».
        */

        int dayNumber = sc.nextInt();

        switch(dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The value is not valide. Enter a number between 1 and 7!");
        }


        /*
        Exercice :
        Direction
        Écrivez un programme qui lit le numéro de la direction (1 – haut, 2 – bas, 3 – gauche, 4 – droite, 0 – immobile)
        et affiche le texte «monter» (ou «descendre», «gauche», «droite» ou «immobile» selon le numéro saisi).
        Si le numéro ne correspond à aucune des directions listées, le programme doit afficher «erreur!».

        Remarque : le texte affiché doit correspondre exactement à l’exemple, y compris la casse et l’emplacement des espaces.
        */

        int directionNumber = sc.nextInt();

        switch(directionNumber){
            case 1 :
                System.out.println("move up");
                break;
            case 2 :
                System.out.println("move down");
                break;
            case 3 :
                System.out.println("move left");
                break;
            case 4 :
                System.out.println("move right");
                break;
            case 0 :
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");

        }

        /*
        Exercice :
        Décodage des couleurs des feux de circulation à partir de codes d'entrée.
        Écrivez un programme Java qui lit un code (1 à 3) pour un feu de circulation et renvoie la couleur correspondante.
        Utilisez une instruction "switch".
        Si l'entrée n'est pas comprise entre 1 et 3, votre programme doit afficher «Invalide».
        */
        // You can use nextLine method of scanner object to take the input from user
        int traficLight = sc.nextInt();
        // Use a switch statement here to determine the color of the traffic signal
        switch(traficLight){
            case 1 :
                System.out.println("Green");
                break;
            case 2 :
                System.out.println("Yellow");
                break;
            case 3 :
                System.out.println("Red");
                break;
            default:
                System.out.println("Invalid");
        }



        /*
        Surface au sol de la pièce
        Les citoyens du pays nommé Malevia aiment expérimenter avec les formes de leurs pièces.
        Celles-ci peuvent être triangulaires, rectangulaires ou rondes.
        Écrivez un programme qui calcule la surface au sol des pièces.
        Format des données d'entrée : Le type de forme de la pièce et les paramètres associés.
        Format des données de sortie : La surface de la pièce calculée.
        Notez que la valeur 3,14 est utilisée à la place du nombre π en Malevia.
        Format d'entrée utilisé par les Maléviens :

        triangle
        a
        b
        c

        Explication du code
        où a, b et c sont les longueurs des côtés du triangle.

        rectangle
        a
        b

        Explication du code
        où a et b sont les longueurs des côtés du rectangle.

        cercle
        r

        Explication du code
        où r est le rayon du cercle.

        Notez que les valeurs d'entrée (a, b, c, r) sont des nombres décimaux (doubles),
        et votre réponse doit l'être également.

        Exemple d'entrée 1 :
        rectangle
        4
        10
        Explication du code

        Exemple de sortie 1 :
        40,0

        Explication du code
        Exemple d'entrée 2 :

        cercle
        5

        Explication du code
        Exemple de sortie 2 :
        78,5

        Explication du code
        Exemple d'entrée 3 :

        triangle
        3
        3
        3

        Explication du code

        Exemple de sortie 3 :
        3,897114317029974
        */

        String shape = sc.nextLine();

        switch (shape) {
            case "rectangle":
                double a6 = sc.nextDouble();
                double b6 = sc.nextDouble();
                double rectangleArea = a6 * b6;
                System.out.println(rectangleArea);
                break;

            case "circle":
                double r = sc.nextDouble();
                double circleArea = 3.14 * r * r;
                System.out.println(circleArea);
                break;

            case "triangle":
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                double z = sc.nextDouble();
                double s = (x + y + z) / 2.0; // semi-perimeter
                double triangleArea = Math.sqrt(s * (s - x) * (s - y) * (s - z));
                System.out.println(triangleArea);
                break;

            default:
                System.out.println("Unknown shape");
        }


        sc.close();

    }
}
