package rev;

import Exercice3.Voiture;

import java.lang.invoke.VarHandle;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionLocation {

    List<Vehicule> vehiculeList;

    public GestionLocation(){
        this.vehiculeList = new ArrayList<>();
    }

    public void ajouterVehivule(Vehicule v){
        vehiculeList.add(v);
    }

    public void rechercherVehiculesDisponibles(){
        for (Vehicule v : vehiculeList){
            if (v.estDisponible()){
                System.out.println("id" + v.getId());
            }
        }
    }

    public void louerVehicule (String id, String client, Date date){
        for (Vehicule v : vehiculeList){
            if (v.getId() == id){
                v.louer(client, date);
            }
        }
    }

    public void retournerVehicule (String id,  Date date){
        for (Vehicule v : vehiculeList){
            if (v.getId() == id){
                v.retourner(date);
            }
        }
    }


}
