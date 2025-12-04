import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IncrementAndDecrement {

    public static void main(String[] args) throws IOException {

        // INCREMENT
        // En Java, l'opérateur postfixe a une priorité plus élevée que l'opérateur d'affectation.
        int a = 4;
        int b = ++a;

        System.out.println(a); // 5
        System.out.println(b); // 5
        /*
        Cependant, elle renvoie la valeur initiale de a, et non sa valeur incrémentée. C'est pourquoi,
        lorsqu'on incrémente b avec a++, on lui assigne en réalité la valeur 4, puis la variable a est incrémentée.
        Ainsi, c vaut 11 et d vaut 10.
         */
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int a1 = 4;
        System.out.println(a1++ + a1); // this is 9

        int n = 10;
        n--;
        System.out.println(n++);

        Scanner inputScanner = new Scanner(System.in);

        // read the integer from the input
        int inputInteger = inputScanner.nextInt();

        // your code here - increase the integer by 1, then decrease it by 2, and finally increase it by 3
        inputInteger++;
        inputInteger-=2;
        inputInteger+=3;

        // print the final computed integer
        System.out.println(inputInteger);

        int x = 5;
        x++; // Increment using "++" operator
        System.out.println("After increment: " + x);
        x--; // Decrement using "--" operator
        System.out.println("After decrement: " + x);

        int a2 = 16;
        int b2 = 4;
        int remainder = --a2 % b2++;
        System.out.println(remainder);

        int a3 = 4;
        int b3 = a3++;
        int c1 = --a3 + b3++;
        int result = ++a3 - (c1++ - b3) + c1;
        System.out.println(result);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Read the integer input
        int n1 = Integer.parseInt(reader.readLine());

        // TODO: Increment n by 1
        n1++;
        // TODO: Decrement n by 2
        n1 -=2;
        // TODO: Double the resulting value of n
        n1 = n1 * 2;
        // Print the final value of n
        System.out.println(n1);

        int n2 = 0;
        System.out.println(++n2);
        System.out.println(n2++);
        System.out.println(n2++);
        System.out.println(n2);


    }
}
