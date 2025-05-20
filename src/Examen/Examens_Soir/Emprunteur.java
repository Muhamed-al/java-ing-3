package Examen.Examens_Soir;

public class Emprunteur  {
    private String identifiant;
    private String nom ;
    private String prenom;

    public Emprunteur(String identifiant , String nom, String prenom){
        this.identifiant=identifiant;
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Emprunteur{" +
                "identifiant='" + identifiant + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

