import java.util.Scanner;


public class Acces {

    // method that verifies the password and gives access to Smart home actions if the password is correct
    public static void accessSmartHome() {
        Scanner scanner = new Scanner(System.in);
        final int password = 76543210;
        System.out.println("Enter password: ");
        int passwordInput = scanner.nextInt();
        if (passwordInput == password) {
            chooseAction();
        } else {
            System.out.println("Incorrect password!");
        }
    }

    private static void chooseAction() {
    }

    public static void main(String[] args) {
        accessSmartHome();
    }
}
