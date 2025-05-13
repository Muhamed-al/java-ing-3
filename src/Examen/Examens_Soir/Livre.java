package Examen.Examens_Soir;

public class Livre extends Document {
    private int numeroEdition;
    private String datePublication;

    public Livre(String code, String titre, int copiesDisponibles, int numeroEdition, String datePublication) {
        super(code, titre, copiesDisponibles);
        this.numeroEdition = numeroEdition;
        this.datePublication = datePublication;
    }

    public int getNumeroEdition() {
        return numeroEdition;
    }

    public void setNumeroEdition(int numeroEdition) {
        this.numeroEdition = numeroEdition;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    @Override
    public String toString() {
        return super.toString() + ", Livre [Edition: " + numeroEdition + ", Date: " + datePublication + "]";
    }
}

