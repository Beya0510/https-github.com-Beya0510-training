package Exercices;

public class Main2 {
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