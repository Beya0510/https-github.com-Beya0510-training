package classes;
import java.time.LocalDate;
import java.time.LocalTime;

public class Personnel {

    public String nom;
    public String prenom;
    public LocalDate dateNaissance;
    public String adresse;
    public String ville;
    public String cp;
    public String email;
    public String telephone;
    public String genre;
    public float taille;
    public float poids;
    public LocalDate dateEmbauche;
    public LocalDate finContrat;


    public Personnel(String nom, String prenom, LocalDate dateNaissance, String adresse, String ville,
                   String cp, String email, String telephone, String genre,
                   float taille, float poids, LocalDate dateEmbauche, LocalDate finContrat) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.ville = ville;
        this.cp = cp;
        this.email = email;
        this.telephone = telephone;
        this.genre = genre;
        this.taille = taille;
        this.poids = poids;
        this.dateEmbauche = dateEmbauche;
        this.finContrat = finContrat;
    }

    public Personnel() {}

    @Override
    public String toString() {
        return "Nom : " + nom + "\n" +
                "Prénom : " + prenom + "\n" +
                "Date de naissance : " + dateNaissance + "\n" +
                "Adresse : " + adresse + "\n" +
                "Ville : " + ville + "\n" +
                "CP : " + cp + "\n" +
                "Email : " + email + "\n" +
                "Téléphone : " + telephone + "\n" +
                "Genre : " + genre + "\n" +
                "Taille : " + taille + " m\n" +
                "Poids : " + poids + " kg\n" +
                "Date d'embauche : " + dateEmbauche + "\n" +
                "Fin Contrat : " + finContrat + "\n";
    }



    public void displayInfo(){
        System.out.println("Information sur le patient {patient1}:");
        System.out.println("Nom\t\t\t\t: " + nom);
        System.out.println("Prénom\t\t\t: " + prenom);
        System.out.println("Date de naissance : " + dateNaissance);
        System.out.println("Adresse\t\t: " + adresse);
        System.out.println("Ville/localité\t : " + ville);
        System.out.println("CP\t\t\t\t\t: " + cp);
        System.out.println("Email adresse\t : " + email);
        System.out.println("Téléphone\t\t: " + telephone);
        System.out.println("Genre\t\t\t: " + genre);
        System.out.println("Taille\t\t\t: " + taille + " m");
        System.out.println("Poids\t\t\t: " + poids + " kg");
        System.out.println("Date de embauche : " + dateEmbauche);
        System.out.println("Fin Contrat\t\t: " + finContrat);
    }
}


