package Examen.Examens_Soir;

public abstract class Document {
    protected String code;
    protected String titre;
    protected int copiesDisponibles;

    public Document(String code, String titre, int copiesDisponibles) {
        this.code = code;
        this.titre = titre;
        this.copiesDisponibles = copiesDisponibles;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getCopiesDisponibles() {
        return copiesDisponibles;
    }

    public void setCopiesDisponibles(int copiesDisponibles) {
        this.copiesDisponibles = copiesDisponibles;
    }

    public void decrementerCopies() {
        copiesDisponibles--;
    }

    @Override
    public String toString() {
        return "Document: " + titre + " (Code: " + code + ", Copies: " + copiesDisponibles + ")";
    }
}

