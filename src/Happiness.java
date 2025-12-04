import java.util.Scanner;

public class Happiness {
    public static void main(String[] args) {
        double life = 8.6;
        double laughter = 7.3;
        double love = 7.3;
        double hate = 2.3;

        System.out.println("Happiness = " + ((life + laughter) * love - hate/2) + "\n");


        String simpleString = "It is a simple string."; // a simple string
        System.out.println(simpleString);  // it prints "It is a simple string"

        String anotherString = "This is\na multiline\nstring."; // a string with escape sequences
        System.out.println(anotherString); // it prints the result in several lines
        String nullString = null; // it is null
        System.out.println(nullString);

        String str = new String("This is my object string.");
        System.out.println(str);

        /*
         Any string has two useful methods:
         - length() returns the number of characters in the string;
         - charAt(int index) returns a character by its index;
         */

        String s = "Hi, all";
        int len = s.length();
        System.out.println(len + "\n");

        char theFirstChar = s.charAt(0);
        System.out.println(theFirstChar + "\n");

        char theFifthChar = s.charAt(4);
        System.out.println(theFifthChar + "\n");

        char theLastChar = s.charAt(s.length() - 1);
        System.out.println(theLastChar + "\n");

        // Pay attention because strings are immutable in Java.

        String G = "Bonjour Grace!";
        System.out.println("Strings are immutable \n" + G );

        System.out.println(G.isEmpty());
        System.out.println(G.toUpperCase());

        String ng = "NGRAKATSCHA";
        System.out.println(ng.toLowerCase());
        System.out.println(ng.startsWith("NGRAKATSCHA"));
        System.out.println(ng.endsWith("NGRAKATSCHA"));
        System.out.println(ng.indexOf("A"));
        System.out.println(ng.contains("S"));
        System.out.println(ng.substring(ng.indexOf("S"), ng.length()));
        System.out.println(ng.replace("A", "U"));
        String phrase = " Comment ça va, espèce de ngrakatscha! ";
        System.out.println(phrase.trim());


        String text = "The simple text string";

        boolean empty = text.isEmpty(); // false
        System.out.println(empty);

        String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"
        System.out.println(textInUpperCase.trim());

        boolean startsWith = textInUpperCase.startsWith("THE"); // true
        System.out.println(startsWith);

        /* Replace all space characters with empty strings */
        String noSpaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"
        System.out.println(noSpaces);

        // Replace all space characters with "_"
        String phoneNumber = text.replaceAll(" ", "_"); // "The_simple_text_string"
        System.out.println(phoneNumber);

        String textWithWhitespaces = "\t text with whitespaces   !\n  \t";
        System.out.println(textWithWhitespaces.trim());

        String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"
        System.out.println(trimmedText);

        String firstName = "John";
        String lastName = "Smith";

        // concatenation using the "+" operator
        String fullName1 = firstName + " " + lastName; // "John Smith"
        System.out.println(fullName1 + "\n");

        // concatenation en utilisant la méthode "concat"
        String fullName2 = firstName.concat( " ").concat(lastName);
        System.out.println(fullName2);

        String str1 = "str" + 10 + false;
        System.out.println(str1 + "\n");

        String shortString = "str";
        int number = 100;
        String result1 = shortString + number + 50;
        String result2 = number + 50 + shortString;
        System.out.println(result1);
        System.out.println(result2 + "\n");

        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";
        System.out.println(first.equals(second));
        System.out.println(first.equals(anotherFirst));

        System.out.println(second.equals(secondInUpperCase));
        System.out.println(second.equalsIgnoreCase(secondInUpperCase) + "\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première ville : ");
        String city1 = scanner.nextLine();
        boolean endsWithBurg1 = city1.endsWith("burg");
        System.out.println(endsWithBurg1);

        System.out.print("Entrez la deuxième ville : ");
        String city2 = scanner.nextLine();
        boolean endsWithBurg2 = city2.endsWith("burg");
        System.out.println(endsWithBurg2);

        System.out.print("Entrez la troisième ville : ");
        String city3 = scanner.nextLine();
        boolean endsWithBurg3 = city3.endsWith("burg");
        System.out.println(endsWithBurg3);

        scanner.close();

        String name = "JustLearn";
        char firstLetter = name.charAt(0);
        String result = "First character of the string is: " + firstLetter;
        System.out.println(result + "\n");

        System.out.println(1 + 1 + "2" + 2);
        System.out.println(2 + 2 + "2");
        System.out.println("2" + 2 + 2);
        System.out.println("2" + 2 + 1 + 1);



    }
}
