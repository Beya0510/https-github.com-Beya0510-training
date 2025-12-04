public class Play {
    public static void main(String[] args) {
        int number = 10;
        String text = "Hello, Grace!";
            System.out.println("Number: " + number + ",\nText: " + text + "\n");

        System.out.println("Hexadécimal : ");

        int hexValue1 = 0x29;   // 16^1 * 2 + 16^0 * 9 = 41
        int hexValue2 = 0x4B;   // 16^1 * 4 + 16^0 * 11 = 75
        System.out.println("Hex Value: " + hexValue1);
        System.out.println("Hex Value: " + hexValue2 + "\n");

        System.out.println("Octal: ");
        int octValue1 = 027;    // = 8^1 * 2 + 8^0 * 7 = 23
        int decValue2 = 27; // 27
        System.out.println("Octal Value: " + octValue1);
        System.out.println("Decimal Value: " + decValue2 + "\n");

        System.out.println("Binary: ");
        int binaryValue = 0b110110;      // = 2^5*1 + 2^4*1 + 2^3*0 + 2^2*1 + 2^1*1 + 2^0*1 = 54
        int decimalValue = 110110;        // = 110110
        System.out.println("Binary Value: " + binaryValue);
        System.out.println("Decimal Value: " + decimalValue + "\n");




        byte age = 52;
        short height = 183;
        int max = 2147483647;
        long bigNum = 2147483648L;
        long smallNum = 5L;  // That is along literal too
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Max: " + max);
        System.out.println("Small Number: " + smallNum);
        System.out.println("Big Number Value: " + bigNum);
        System.out.println();

        System.out.println("Floating-point literals");
        double num1 = 123.723; // a double literal
        float num2 = 34.0F;    // a float literal
        double num11 = 123.723; // a double literal
        float  num21 = 34.0F;   // a float literal
        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);
        System.out.println("Num11 : " + num11);
        System.out.println("Num21 : " + num21 + "\n");

        System.out.println("Scientific notation");
        float num011 = 0.05e3F; // = 0.05 * 10^3 = 50
        double num012 = 25.255e-4;  // = 25.255 * 10^(-4) = 0.0025255
        System.out.println("Num011 : " + num011);
        System.out.println("Num012 : " + num012);

        System.out.println("Character literals");
        int characterLiteral = 'a' ; // this is 97
        int characterLiteral2 = 'b'; // this is 98
        int characterLiteral3 = 'c'; // this is 99
        int characterLiteral4 = 'd'; // this is 100
        int characterLiteral5 = 'e'; // this is 101
        int characterLiteral6 = 'y';
        int characterLiteral7 = 'z';
        int sumOfCharacterLiteral = characterLiteral +  characterLiteral2 + characterLiteral3 + characterLiteral4 + characterLiteral5 + characterLiteral6;
        System.out.println("Character literals 1: " + characterLiteral);
        System.out.println("Character literals 2: " + characterLiteral2);
        System.out.println("Character literals 3: " + characterLiteral3);
        System.out.println("Character literals 4: " + characterLiteral4);
        System.out.println("Character literals 5: " + characterLiteral5);
        System.out.println("Character literals 6: " + characterLiteral6);
        System.out.println("Character literals 7: " + characterLiteral7);
        System.out.println("The sum of character literals: " + sumOfCharacterLiteral + "\n");

        System.out.println("The upper character literals: ");
        int upperCharacterLiteral = 'A';
        int upperCharacterLiteral2 = 'B';
        int upperCharacterLiteral3 = 'C';
        int upperCharacterLiteral4 = 'D';
        int upperCharacterLiteral5 = 'E';
        int upperCharacterLiteral6 = 'Y';
        int upperCharacterLiteral7 = 'Z';
        int sumOfUpperCharacterLiteral = upperCharacterLiteral + upperCharacterLiteral2 + upperCharacterLiteral3 + upperCharacterLiteral4 + upperCharacterLiteral5;
        System.out.println("Upper character literals 1: " + upperCharacterLiteral);
        System.out.println("Upper character literals 2: " + upperCharacterLiteral2);
        System.out.println("Upper character literals 3: " + upperCharacterLiteral3);
        System.out.println("Upper character literals 4: " + upperCharacterLiteral4);
        System.out.println("Upper character literals 5: " + upperCharacterLiteral5);
        System.out.println("Upper character literals 6: " + upperCharacterLiteral6);
        System.out.println("Upper character literals 7: " + upperCharacterLiteral7);
        System.out.println("The sum of upper characters literals: " +  sumOfUpperCharacterLiteral + "\n");

        System.out.println("Using underscore in numeric literals");
        int million = 1_000_000;
        long creditCardNumber = 1234_5678_1234_5678L;
        int hex = 0x1FF_A91;
        float floatNum = 123_000.500_2f;
        System.out.println("Million: " + million);
        System.out.println("Credit card number: : " +  creditCardNumber );
        System.out.println("Hex : " + hex);
        System.out.println("Floating number : " + floatNum + "\n");

        int num = 034;
        System.out.println(num);

        String str = " Inside Main";
        String subs = str.substring(0, 6);
        long n = subs.trim().length();
        System.out.println(n);




    }
}
