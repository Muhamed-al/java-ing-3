package Examen.Examens_Jours.Exercice3;

import java.util.Date;

public class TrotinetteElectrique extends Vehicule {
    private String couleur;
    private int poidsMax;

    public TrotinetteElectrique(String id, String marque, String modele, String couleur, int poidsMax) {
        super(id, marque, modele);
        this.couleur = couleur;
        this.poidsMax = poidsMax;
    }
    public boolean estDisponible() {
        return getEtat_vehicule() == Etat.Disponible;
    }

    public void louer(String client, Date date) {
        if (getEtat_vehicule() == Etat.Disponible) {
            setEtat_vehicule(Etat.Loué);
            setDate_location(date);
            System.out.println("Véhicule loué à " + client);
        } else {
            System.out.println("Véhicule non disponible.");
        }
    }

    public void retourner(Date date) {
        setEtat_vehicule(Etat.Disponible);
        setDate_retour(date);
        System.out.println("Véhicule retourné.");
    }
}

