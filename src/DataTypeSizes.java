// Classe qui affiche la taille des types de données primitifs en Java
public class DataTypeSizes {
    public static void main(String[] args) {

        // Affiche la taille d'un byte (8 bits)
        System.out.println("byte : " + Byte.SIZE + " bits");

        // Affiche la taille d'un short (16 bits)
        System.out.println("short : " + Short.SIZE + " bits");

        // Affiche la taille d'un int (32 bits)
        System.out.println("int : " + Integer.SIZE + " bits");

        // Affiche la taille d'un long (64 bits)
        System.out.println("long : " + Long.SIZE + " bits");

        // Affiche la taille d'un float (32 bits)
        System.out.println("float : " + Float.SIZE + " bits");

        // Affiche la taille d'un double (64 bits)
        System.out.println("double : " + Double.SIZE + " bits");
        System.out.println(" ");

        // Maximum storage capacity for each data type.
        System.out.println("Maximum storage capacity for each data type.");
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;

        System.out.println("Max value for byte : " + b);
        System.out.println("Max value for short : " + s);
        System.out.println("Max value for int : " + i);
        System.out.println("Max value for long : " + l);
        System.out.println(" ");

        // Smallest storage capacity for each data type.
        byte smallestByte = Byte.MIN_VALUE;
        short smallestShort = Short.MIN_VALUE;
        int smallestInt = Integer.MIN_VALUE;
        long smallestLong = Long.MIN_VALUE;
        float smallestFloat = Float.MIN_VALUE;
        double smallestDouble = Double.MIN_VALUE;

        System.out.println("Minimum byte value : " + smallestByte);
        System.out.println("Minimum short value : " + smallestShort);
        System.out.println("Minimum integer value : " + smallestInt);
        System.out.println("Minimum long value : " + smallestLong);
        System.out.println("Minimum float value : " + smallestFloat);
        System.out.println("Minimum double value : " + smallestDouble);
    }
}
