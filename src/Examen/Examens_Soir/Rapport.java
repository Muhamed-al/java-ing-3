package Examen.Examens_Soir;

public class Rapport extends Document {
    private String presidentJury;
    private String rapporteur;

    public Rapport(String code, String titre, int copiesDisponibles, String presidentJury, String rapporteur) {
        super(code, titre, copiesDisponibles);
        this.presidentJury = presidentJury;
        this.rapporteur = rapporteur;
    }

    public String getPresidentJury() {
        return presidentJury;
    }

    public void setPresidentJury(String presidentJury) {
        this.presidentJury = presidentJury;
    }

    public String getRapporteur() {
        return rapporteur;
    }

    public void setRapporteur(String rapporteur) {
        this.rapporteur = rapporteur;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rapport [Président: " + presidentJury + ", Rapporteur: " + rapporteur + "]";
    }
}


