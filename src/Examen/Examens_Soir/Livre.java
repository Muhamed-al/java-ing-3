package Examen.Examens_Soir;

public class Livre extends Document {
    private int numero_edition ;
    private String date_pub ;

    public Livre(String code, String titre, int nombre_de_copies_disponible, int numero_edition, String date_pub) {
        super(code, titre, nombre_de_copies_disponible);
        this.numero_edition = numero_edition;
        this.date_pub = date_pub;
    }

    public int getNumero_edition() {
        return numero_edition;
    }

    public void setNumero_edition(int numero_edition) {
        this.numero_edition = numero_edition;
    }

    public String getDate_pub() {
        return date_pub;
    }

    public void setDate_pub(String date_pub) {
        this.date_pub = date_pub;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "numero_edition=" + numero_edition +
                ", date_pub='" + date_pub + '\'' +
                '}';
    }
}

