import classes.Personnel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Personnel> personnels = new ArrayList<>();

        Personnel personnel1= new Personnel();
        Personnel personnel2 = new Personnel();

        System.out.println("Veuillez entrer votre nom : ");
        personnel1.nom = sc.nextLine();
        System.out.println("Veuillez entrer votre prénom : ");
        personnel1.prenom = sc.nextLine();
        System.out.println("Veuillez entrer votre âge : ");
        personnel1.dateNaissance = LocalDate.ofEpochDay(sc.nextInt());
        sc.nextLine();
        System.out.println("Veuillez entrer votre adresse : ");
        personnel1.adresse = sc.nextLine();
        sc.nextLine();
        System.out.println("Veuillez entrer votre ville ou localité : ");
        personnel1.ville = sc.nextLine();
        System.out.println("Veuillez entrer votre CP : ");
        personnel1.cp = sc.nextLine();
        System.out.println("Veuillez entrer votre email adresse : ");
        personnel1.email = sc.nextLine();
        System.out.println("Veuillez entrer votre numéro de téléphone : ");
        personnel1.telephone = sc.nextLine();
        System.out.println("Veuillez entrer votre genre : ");
        personnel1.genre = sc.nextLine();
        System.out.println("Veuillez entrer votre taille : ");
        personnel1.taille = Float.parseFloat(sc.nextLine());
        System.out.println("Veuillez entrer votre poids : ");
        personnel1.poids = Float.parseFloat(sc.nextLine());
        System.out.println("Date d'embauche : ");
        personnel2.dateEmbauche = LocalDate.ofEpochDay(sc.nextInt());
        System.out.println("Date de fin de contrat : ");
        personnel2.finContrat = LocalDate.ofEpochDay(sc.nextInt());
        System.out.println();

        // personnel2
        System.out.println("Nom : ");
        personnel2.nom = sc.nextLine();
        System.out.println("Prenom : ");
        personnel2.prenom = sc.nextLine();
        System.out.println("Date de naissance : ");
        personnel2.dateNaissance = LocalDate.ofEpochDay(sc.nextInt());
        System.out.println("Adresse : ");
        personnel2.adresse = sc.nextLine();
        System.out.println("Ville : ");
        personnel2.ville = sc.nextLine();
        System.out.println("CP : ");
        personnel2.cp = sc.nextLine();
        System.out.println("Email : ");
        personnel2.email = sc.nextLine();
        System.out.println("Téléphone : ");
        personnel2.telephone = sc.nextLine();
        System.out.println("Sexe : ");
        personnel2.genre = sc.nextLine();
        System.out.println("Taille : ");
        personnel2.taille = Float.parseFloat(sc.nextLine());
        System.out.println("Poids : ");
        personnel2.poids = Float.parseFloat(sc.nextLine());
        System.out.println("Date d'embauche : ");
        personnel2.dateEmbauche = LocalDate.ofEpochDay(sc.nextInt());
        System.out.println("Date de fin de contrat : ");
        personnel2.finContrat = LocalDate.ofEpochDay(sc.nextInt());
        System.out.println();

        Personnel Donny = new Personnel();
        System.out.println("Nom : ");
        Donny.nom = sc.nextLine();
        System.out.println("Prenom : ");
        Donny.prenom = sc.nextLine();
        System.out.println("Date de naissance : ");
        Donny.dateNaissance = LocalDate.ofEpochDay(sc.nextInt());
        System.out.println("Adresse : ");
        Donny.adresse = sc.nextLine();
        System.out.println("Ville : ");
        Donny.ville = sc.nextLine();
        System.out.println("CP : ");
        Donny.cp = sc.nextLine();
        System.out.println("Email : ");
        Donny.email = sc.nextLine();
        System.out.println("Téléphone : ");
        Donny.telephone = sc.nextLine();
        System.out.println("Sexe : ");
        Donny.genre = sc.nextLine();
        System.out.println("Taille : ");
        Donny.taille = Float.parseFloat(sc.nextLine());
        System.out.println("Poids : ");
        Donny.poids = Float.parseFloat(sc.nextLine());
        System.out.println("Date d' embauche : ");
        Donny.dateEmbauche = LocalDate.ofEpochDay(sc.nextInt());
        System.out.println("Date de fin de contrat : ");
        Donny.finContrat = LocalDate.ofEpochDay(sc.nextInt());
        System.out.println();


        sc.close();

        System.out.println();
        personnel1.displayInfo();

    }
}
