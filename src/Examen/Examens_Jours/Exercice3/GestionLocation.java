package Examen.Examens_Jours.Exercice3;

import java.util.*;

public class GestionLocation {
    private List<Vehicule> listeVehicules = new ArrayList<>();

    public void ajouterVehicule(Vehicule v) {
        listeVehicules.add(v);
    }

    public void rechercherVehiculesDisponibles() {
        for (Vehicule v : listeVehicules) {
            if (v.estDisponible()) {
                System.out.println("Véhicule disponible: " + v);
            }
        }
    }

    public void louerVehicule(String id, String client, Date date) {
        for (Vehicule v : listeVehicules) {
            //v instanceof Vehicule
            if ( v.estDisponible() && v.getId().equals(id)) {
                v.louer(client, date);
                return;
            }
        }
        System.out.println("Aucun véhicule disponible avec cet ID.");
    }

    public void retournerVehicule(String id, Date date) {
        for (Vehicule v : listeVehicules) {
            if (v.getId().equals(id)) {
                v.retourner(date);
                return;
            }
        }
        System.out.println("Véhicule introuvable.");
    }
}

