package Examen.Examens_Jours.Exercice3;

import java.util.Date;

public abstract class Vehicule implements IVehicule {
    private String id;
    private String marque;
    private String modele;
    private Date date_location;
    private Date date_retour;
    private Etat etat_vehicule;

    public Vehicule(String id, String marque, String modele) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.date_location = new Date();
        this.date_retour = new Date();
        this.etat_vehicule = Etat.Disponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Date getDate_location() {
        return date_location;
    }

    public void setDate_location(Date date_location) {
        this.date_location = date_location;
    }

    public Date getDate_retour() {
        return date_retour;
    }

    public void setDate_retour(Date date_retour) {
        this.date_retour = date_retour;
    }

    public Etat getEtat_vehicule() {
        return etat_vehicule;
    }

    public void setEtat_vehicule(Etat etat_vehicule) {
        this.etat_vehicule = etat_vehicule;
    }
}

