package Examen.Examens_Soir;

public class Emprunt {
    private Document d ;
    private Emprunteur e ;

    public Emprunt(Document d, Emprunteur e) {
        this.d = d;
        this.e = e;
    }

    public Document getD() {
        return d;
    }

    public void setD(Document d) {
        this.d = d;
    }

    public Emprunteur getE() {
        return e;
    }

    public void setE(Emprunteur e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "d=" + d +
                ", e=" + e +
                '}';
    }
}