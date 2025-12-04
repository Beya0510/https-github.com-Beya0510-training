public class Voiture {

    String marque;
    int vitesse;

    void accelerer() {
        vitesse += 20;
        System.out.println("La voiture accélère à " + vitesse + "km/h.");
    }

    void demarrer() { // méthode d’instance
        System.out.println(marque + " démarre !");
    }

    static void info() { // méthode statique
        System.out.println("Les voitures ont 4 roues.");
    }
}
