import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class EmbauchaCandidatureTechnique {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in).useLocale(Locale.US);

        System.out.print("Nom du candidat : ");
        String nameOfCandidate = scanner.next();

        System.out.print("Connaît Java ? (true/false) : ");
        boolean knowJava = scanner.nextBoolean();

        System.out.print("Années d'expérience en Java : ");
        int yearsOfExperienceInJava = scanner.nextInt();

        System.out.print("Connaît Python ? (true/false) : ");
        boolean knowPython = scanner.nextBoolean();

        System.out.print("Années d'expérience en Python : ");
        int yearsOfExperienceInPython = scanner.nextInt();

        // pondération
        double score = 0;

        if (knowJava) {
            score += 50; // priorité au Java
            score += yearsOfExperienceInJava * 10; // bonus d’expérience
        }

        if (knowPython) {
            score += 30; // Python vaut un peu moins
            score += yearsOfExperienceInPython * 8;
        }

        boolean offerAJob = score >= 60; // seuil arbitraire pour l’embauche

        System.out.printf(
                "Le score de %s est %.1f → Décision d’embauche : %b%n",
                nameOfCandidate, score, offerAJob
        );




        scanner.close();
    }

}
