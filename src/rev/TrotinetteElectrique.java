package rev;

import java.util.Date;
import java.util.IllegalFormatCodePointException;

public class TrotinetteElectrique extends Vehicule {

    private String couleur;
    private int poidsMax;

    public TrotinetteElectrique(String id , String marque , String model , String couleur , int poidsMax){
        super(id , marque , model);
        this.couleur = couleur;
        this.poidsMax = poidsMax;
    }

    public int getPoidsMax() {
        return poidsMax;
    }

    public void setPoidsMax(int poidsMax) {
        this.poidsMax = poidsMax;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


    @Override
    public boolean estDisponible() {
        return getEtat_vehicule() == Etat.DISPONIBLE;
        /*if (getEtat_vehicule() == Etat.DISPONIBLE){
            return true;
        }else{
            return false;
        }*/
    }

    @Override
    public void louer(String client, Date date) {
        if (estDisponible()){
            setDate_location(date);
            setEtat_vehicule(Etat.LOUE);
            System.out.println("Vehicule loué avec succés a " + client);
        }else{
            System.out.println("Vehicule n'est pas disponible");
        }
    }

    @Override
    public void retourner(Date date) {
        setEtat_vehicule(Etat.DISPONIBLE);
        setDate_retour(date);
        System.out.println("Vehicule retourné avec succés");
    }
}
