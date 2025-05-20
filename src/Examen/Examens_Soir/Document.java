package Examen.Examens_Soir;

public class Document {
    private String code;
    private String titre;
    private int nombre_de_copies_disponible;

    public Document(String code, String titre, int nombre_de_copies_disponible) {
        this.code = code;
        this.titre = titre;
        this.nombre_de_copies_disponible = nombre_de_copies_disponible;
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

    public int getNombre_de_copies_disponible() {
        return nombre_de_copies_disponible;
    }

    public void setNombre_de_copies_disponible(int nombre_de_copies_disponible) {
        this.nombre_de_copies_disponible = nombre_de_copies_disponible;
    }
    public void decrementer(){
        this.nombre_de_copies_disponible -- ;
    }

    @Override
    public String toString() {
        return "Document{" +
                "code='" + code + '\'' +
                ", titre='" + titre + '\'' +
                ", nombre_de_copies_disponible=" + nombre_de_copies_disponible +
                '}';
    }
}

