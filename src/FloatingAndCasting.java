import java.util.*;

public class FloatingAndCasting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double zero = 0.0;
        double one = 1.0;
        double negNumber = -1.75;
        double pi = 3.1415;

        System.out.println(zero);
        System.out.println(one);
        System.out.println(negNumber);
        System.out.println(pi); // 3.1415
        System.out.println();

        float pi1 = 3.1415f;
        float negValue = -0.15f;
        System.out.println(pi1);
        System.out.println(negValue);
        System.out.println();

        float f = 0.888888888888888888f; // a value with a lot of decimal digits
        System.out.println(f);           // it only prints 0.8888889
        double eps = 5e-3; // means 5 * 10^(-3) = 0.005
        double n = 0.01e2; // means 0.01 * 10^2 = 1.0
        System.out.println(eps);
        System.out.println(n);
        System.out.println();

        double one1 = 1.0;
        double number = one1 + 1.5; // 2.5
        System.out.println(number);

        double a = 1.75;
        double b = 5.0;
        double c = b - a; // 3.25
        System.out.println(c);

        double pi3 = 3.1415;
        double squaredPi3 = pi3 * pi3; // 9.86902225
        System.out.println(squaredPi3);
        System.out.println();

        System.out.println(squaredPi3 / 2); // 4.934511125
        System.out.println();

        double d1 = 5/4; // 1.0
        double d2 = 5.0 / 4; // 1.25
        System.out.println(d1);
        System.out.println(d2);

        double d3 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(d3); // it prints 0.9999999999999999

        // Reading floating-point numbers
        float f1 = scanner.nextFloat();
        double d4 = scanner.nextDouble();
        System.out.println(f1);
        System.out.println(d4);
        System.out.println();

        // Calcul de l'aire d'un figure.
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        double area = (base * height) / 2;
        System.out.println(area);

        // Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int aa = 12;
        int bb = 5;
        int cc = 2;

        double dd = cc * (aa / bb);
        System.out.println(dd);

        double A = 8;
        double B = 5;
        double C = A / B + 1.1;
        System.out.println(C);

        double a5 = scanner.nextDouble();
        double b5 = scanner.nextDouble();
        double c5 = scanner.nextDouble();
        double x = (c5 - b5) / a5;

        System.out.println(x);
        System.out.println();

        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();
        double averageSpeed = distance / time;

        System.out.println(averageSpeed);
        System.out.println();


        double radius = 5.0;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("Volume of sphere with radius %.2f is %.2f\n", radius, volume);
        System.out.println();

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double difference = num2 - num1;
        System.out.println(difference);
        System.out.println();


        double Celsius = scanner.nextDouble();
        double Fahrenheit = Celsius * 1.8 + 32 ;
        System.out.println(Fahrenheit);

        // Pression d'un liquide
        double ρ = scanner.nextDouble();
        double g = 9.8;
        double h = scanner.nextDouble();

        double p = ρ * g * h;
        System.out.println(p);

        // TYPE CASTING.
        // Il est impossible de convertir le type booléen en un autre et vice versa.
        //Implicit casting
        int num = 100;
        long bigNum = num; // 100L
        System.out.println(num);
        System.out.println(bigNum);
        System.out.println();

        long bigNum1 = 100_000_000L;
        double bigFraction = bigNum1; // 100000000.0
        System.out.println(bigFraction);
        System.out.println();

        short shortNum = 100;
        int nums1 = shortNum; // 100
        System.out.println(nums1);
        System.out.println();

        char ch = '?';
        int code = ch; // 63
        System.out.println(code);
        System.out.println();

        long bigLong =  1_200_000_002L;
        float bigFloat = bigLong; // 1.2E9 (= 1_200_000_000)
        System.out.println(bigFloat);
        System.out.println();

        char character = 'a';
        char upperCase = 'A';

        int ascii1 = character; // this is 97
        int ascii2 = upperCase; // this is 65
        System.out.println(ascii1);
        System.out.println(ascii2);
        System.out.println();


        // Explicit casting

        double d6 = 2.00003;
        System.out.println(d6);
        // it loses the fractional part
        long l =  (long) d6; // 2
        System.out.println(l);
        // requires explicit casting because long is wider than int
        int i = (int) l; // 2
        System.out.println(i);
        // requires explicit casting because the result is long (indicated by L)
        int val = (int) (3 + 2L); // 5
        System.out.println(val);
        // casting from a long literal to char
        char ch1 = (char) 55L; // '7'
        System.out.println(ch1);

        // Read float value from user
        float floatVariable = scanner.nextFloat();

        // Divide by 2 and round down
        int result = (int) Math.floor(floatVariable / 2);

        // Print the integer result
        System.out.println(result);


        // BOOLEAN TYPE.
        // Boolean type in Java is used to represent logical values, which can have only two possible states : true & false.
        System.out.println("Souhaitez-vous ouvrir la porte ? (oui/non) : ");
        String choix = scanner.nextLine().trim().toLowerCase();

        boolean open;

        if(choix.equals("oui")){
            open = true;
        }else if(choix.equals("non")){
            open = false;
        }else{
            System.out.println("Réponse invalide. La réponse reste fermée par défaut.");
            open = false;
        }

        if (open) {
            System.out.println("Ok la porte s'ouvre !");
        }else{
            System.out.println("Alors la porte reste fermée !");
        }

        // Important, you cannot assign an integer value to a boolean variable. In Java, 0 is not the same as false.
        /*
        Opérateurs logiques
        Les variables de type booléen sont souvent utilisées pour construire des expressions logiques à l'aide d'opérateurs
        logiques. Java possède quatre opérateurs logiques : NOT (NON), AND (ET), OR (OU) et XOR (le "OU exclusif").
        • NOT : L'opérateur unaire « ! » inverse la valeur booléenne.
        */
        boolean F = false; // f is false
        boolean T = !F;    // t is true
        System.out.println("F = " + F + ", T = " +  T);

        /*
        • AND : L'opérateur binaire "&&" renvoie vrai si les deux opérandes sont vrais, et faux sinon.
        */
        boolean B1 = false && false; // false
        boolean B2 = false && true;  // false
        boolean B3 = true && false;  // false
        boolean B4 = true && true;   // true
        System.out.println("B1 = " + B1 + ", B2 = " + B2 + ", B3 = " + B3 + ", B4 = " + B4);

        /*
        • OR : L'opérateur binaire "||" renvoie vrai si au moins un de ses opérandes est vrai, sinon il renvoie faux.
         */
        boolean C1 = false || false; // false
        boolean C2 = false || true;  // true
        boolean C3 = true || false;  // true
        boolean C4 = true || true;   // true
        System.out.println("C1 = " + C1 + ", C2 = " + C2 + ", C3 = " + C3 + ", C4 = " + C4);

        /*
        • XOR : L'opérateur XOR (ou exclusif) est un opérateur binaire qui renvoie vrai si les opérandes booléens ont
          des valeurs différentes, et faux sinon. Il est noté ^.
          | A     | B     | A ^ B (résultat) |
          | ----- | ----- | ---------------- |
          | false | false | false            |
          | false | true  | true             |
          | true  | false | true             |
          | true  | true  | false            |

         👉 En résumé :
            • Le résultat est true si les deux valeurs sont différentes.
            • Le résultat est false si les deux valeurs sont identiques.
        */

        boolean D = true;
        boolean E = false;

        boolean resultat = D ^ E; // XOR : vrai, car les valeurs sont différentes.

        System.out.println("D = " + D);
        System.out.println("E = " + E);
        System.out.println("D ^ E = " + resultat);

        boolean D1 = false ^ false; // false
        boolean D2 = false ^ true;  // true
        boolean D3 = true ^ false;  // true
        boolean D4 = true ^ true;   // false
        System.out.println("D1 = " + D1 + ", D2 = " + D2 + ", D3 = " + D3 + ", D4 = " + D4);


        boolean carteEtudiant = true;
        boolean reductionSenior = false;


        // On veut une réduction si exactement une de ces conditions est vraie
        if (carteEtudiant ^ reductionSenior) {
            System.out.println("Réduction appliquée !");
        } else {
            System.out.println("Pas de réduction.");
        }

        // ➡️ Ici, la réduction s’applique uniquement si une seule des deux conditions est vraie, pas les deux.

        // DIFFERENCE ENTRE OR ET XOR.
        /*
        Excellente question 👏 — comprendre la différence entre OR (||) et XOR (^) est essentiel en logique booléenne
        et en programmation Java.

        🔹 1. Le "OR" logique (||) — "OU inclusif"

        🧠 Principe :
        A || B est vrai si au moins une des deux conditions est vraie.
        | A | B | A || B |
        |---|---|--------|
        | false | false | false |
        | false | true | true |
        | true | false | true |
        | true | true | true |

        ➡️ Si l’une ou l’autre (ou les deux) est vraie → le résultat est true.
        */

        boolean G = true;
        boolean H = true;

        boolean resultat1 = G ^ H;
        System.out.println("G || H = " + resultat1);

        /*
        🗣️ Explication :
        Ici a et b sont tous deux true.
        Comme au moins un est vrai → le résultat est true.

        🔹 2. Le XOR logique (^) — "OU exclusif"

        🧠 Principe :
        A ^ B est vrai uniquement si l’un des deux est vrai, mais pas les deux.

        | A     | B     | A ^ B |
        | ----- | ----- | ----- |
        | false | false | false |
        | false | true  | true  |
        | true  | false | true  |
        | true  | true  | false |

        ➡️ Si exactement une seule des deux valeurs est vraie → le résultat est true.
        */
        boolean I = true;
        boolean J = true;

        boolean resultat2 = I ^ J;
        System.out.println("I ^ J = " + resultat2); // Affiche false

        /*
        🗣️ Explication :
        Les deux sont true, donc XOR renvoie false, car les valeurs sont identiques.

        🔹 3. Différence en résumé

        | Opérateur | Nom               | Résultat `true` quand...      | Exemple `true`     | Exemple `false`                  |       |   |            |        |   |        |
        | --------- | ----------------- | ----------------------------- | ------------------ | -------------------------------- | ----- | - | ---------- | ------ | - | ------ |
        | `         |                   | `                             | OR (OU inclusif)   | au moins une condition est vraie | `true |   | false` → ✅ | `false |   | false` |
        | `^`       | XOR (OU exclusif) | une seule condition est vraie | `true ^ false` → ✅| `true ^ true`                   |      |   |            |        |   |        |


        💡 Exemple concret
        Supposons un système de réduction :
        Une personne a une carte étudiant (true)
        Et une autre a une carte senior (false)
        🔸 Avec ||
        */
        boolean carteEtudiant1 = true;
        boolean carteSenior1 = false;

        if (carteEtudiant1 || carteSenior1) {
            System.out.println("Réduction accordée !");
        }

        // ➡️ Une ou les deux cartes suffisent → réduction accordée.

        // • Avec ^
        if (carteEtudiant ^ carteSenior1) {
            System.out.println("Réduction accordée !");
        }
        // ➡️ Réduction seulement si une seule carte est présentée (pas les deux).

        // Exercice OR ou XOR
        System.out.println("Entrez la valeur de Z (true/false) : ");
        boolean Z = scanner.nextBoolean();

        System.out.println("Entrez la valeur de X (true/false) : ");
        boolean X = scanner.nextBoolean();

        boolean resultatOR = Z || X;  // OU inclusif
        boolean resultatXOR = Z ^ X;  // OU exclusif

        System.out.println("\nRésultats :");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("A || B (OR inclusif) = " + resultatOR);
        System.out.println("A ^ B (XOR exclusif) = " + resultatXOR);

        // Explication automatique selon les valeurs
        System.out.println("\nExplication :");
        if (resultatOR && !resultatXOR) {
            System.out.println("Les deux sont vrais → OR est vrai, mais XOR est faux (les deux sont identiques).");
        } else if (resultatXOR) {
            System.out.println("Une seule valeur est vraie → OR et XOR sont vrais.");
        } else {
            System.out.println("Aucune valeur n'est vraie → OR et XOR sont faux.");
        }

        /*
        Priorité des opérateurs logiques
        Voici les opérations logiques, classées par ordre de priorité décroissante dans les expressions :
        ! (NON), ^ (OU exclusif), && (ET), || (OU).
        La variable suivante est vraie :
        boolean b = true && !false; // true, parce que "!false" est évalué avant "&&".
        Pour modifier l'ordre d'exécution, vous pouvez utiliser des parenthèses (...).
         */
        // Trekking : bonnes conditions = temps sec et chaud peu importe la saison ou temps sec en été.

        boolean cold = false;
        boolean dry = true;
        boolean summer = false; // On suppose que nous sommes en automne.
        boolean winter = false;

        boolean trekking = dry && (!cold || summer); // true, donc on peput faire du trekking!
        System.out.println("Trekking = " + trekking);


        // Évaluation du court-circuit.
        /*
        Il est intéressant de noter que les opérateurs && et || n'évaluent pas le second argument s'il n'est pas
        nécessaire. Lorsque le premier argument de l'opérateur "&&" est faux, la valeur globale est nécessairement
        "fausse" et lorsque le premier argument de l'opérateur "||" est vrai, la valeur globale est nécessairement vraie.

        • faux && ... -> faux, car il n'est pas nécessaire de connaître le membre de droite.

        • vrai || ... -> vrai, car il n'est pas nécessaire de connaître le membre de droite.

        Ce comportement est appelé évaluation en court-circuit (à ne pas confondre avec un court-circuit électrique).
        Il réduit le temps de calcul, mais peut également servir à éviter certaines erreurs dans les programmes.

         */

        // Take integer input from the user
        int number1 = scanner.nextInt();

        // Use a simple way to determine if the number is even or odd.
        // If it's even, print true, otherwise, print false
        boolean even = true;
        boolean odd = false;
        // Write your code here
        if(number1 % 2 == 0){
            System.out.println(even);
        }else{
            System.out.println(odd);
        }


        // Implémentation authentification
        // --- Étape 1 : Saisie du login et du mot de passe ---
        System.out.print("Enter your login: ");
        String login = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // --- Étape 2 : Saisie des réponses de sécurité ---
        System.out.println("\nAnswer the following security questions:");
        System.out.print("1. What is your favorite color? ");
        String answer1 = scanner.nextLine();

        System.out.print("2. In which city were you born? ");
        String answer2 = scanner.nextLine();

        System.out.print("3. What is your pet’s name? ");
        String answer3 = scanner.nextLine();

        // --- Étape 3 : Vérification des conditions d'autorisation ---
        if (login.equals("GalacticExplorer")
                && password.equals("v3rYs3cR3t")
                && (answer1.equals("Blue")
                || answer2.equals("New York")
                || answer3.equals("Fluffy"))) {

            System.out.println("\n✅ Login successful! Welcome!");
        } else {
            System.out.println("\n❌ Incorrect login, password, or no security questions were answered correctly.");
        }

        /*
         Exercice :
         Est-ce une journée idéale pour aller à la plage ? Regardez le ciel !
         Développez un programme Java qui vérifie si une sortie à la plage est envisageable en fonction des conditions
         météorologiques actuelles. Le programme recevra successivement trois valeurs booléennes : « est ensoleillé »,
         « est pluvieux » et « est froid ». Il devra renvoyer « vrai » si le temps est ensoleillé et sec, et « faux »
         sinon.
         */

        // Lire les conditions météo
        boolean isSunny = scanner.nextBoolean();
        boolean isRainy = scanner.nextBoolean();
        boolean isCold = scanner.nextBoolean();

        // Décision : true si ensoleillé et pas pluvieux ni froid
        boolean goToBeach = isSunny && !isRainy && !isCold;

        // Afficher le résultat
        System.out.println(goToBeach);

    }
}
