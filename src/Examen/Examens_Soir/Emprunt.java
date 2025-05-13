package Examen.Examens_Soir;

public class Emprunt {

    private Document document;
    private Emprunteur emprunteur;

    public Emprunt(Document document, Emprunteur emprunteur) {
        this.document = document;
        this.emprunteur = emprunteur;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Emprunteur getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(Emprunteur emprunteur) {
        this.emprunteur = emprunteur;
    }

    @Override
    public String toString() {
        return emprunteur + "a emprunté " + document;
    }
}