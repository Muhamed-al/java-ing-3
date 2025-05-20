package Examen.Examen_2022_2023;

public class Habitation {

    private String prop;
    private String adresse;
    private double surface;

    public Habitation(String prop, String adresse, double surface) {
        this.prop = prop;
        this.adresse = adresse;
        this.surface = surface;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double impot() throws ImpotException{
        if (surface < 0){
            throw new ImpotException("Surfce negative !");
        }
        return surface * 2;
    }

    public void affiche(){
        System.out.println("Prop : " + prop);
        System.out.println("Adresse : " + adresse);
        System.out.println("Surface : " + surface);
    }


}
