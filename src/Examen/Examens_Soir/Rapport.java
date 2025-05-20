package Examen.Examens_Soir;

import java.util.Objects;

public class Rapport extends Document {
    private String pres_juri;
    private String rapporteur ;

    public Rapport(String code, String titre, int nombre_de_copies_disponible, String pres_juri, String rapporteur) {
        super(code, titre, nombre_de_copies_disponible);
        this.pres_juri = pres_juri;
        this.rapporteur = rapporteur;
    }

    public String getPres_juri() {
        return pres_juri;
    }

    public void setPres_juri(String pres_juri) {
        this.pres_juri = pres_juri;
    }

    public String getRapporteur() {
        return rapporteur;
    }

    public void setRapporteur(String rapporteur) {
        this.rapporteur = rapporteur;
    }

    @Override
    public String toString() {
        return pres_juri + rapporteur;
    }

}


