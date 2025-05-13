package Examen.Examens_Soir;

public class Emprunteur  {
    private String id;
    private String nom;
    private String prenom;

    public Emprunteur(String id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "Emprunteur: " + nom + " " + prenom + " (ID: " + id + ")";
    }

}

