package Exercices;

import java.util.Scanner;

public class Main1 {
    public static String transformString(String s) {
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (Character.isLetter(c)) {
                if (c == 'z') {
                    result.append('a');
                } else {
                    result.append((char)(c + 1));
                }
            }

            else if (Character.isDigit(c)) {
                if (c == '0') {
                    result.append('9');
                } else {
                    result.append((char)(c - 1));
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(transformString(s));
        input.close();
    }
}
