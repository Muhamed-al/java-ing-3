package Examen.Examens_Jours.Exercice3;

import java.util.Date;

public interface IVehicule {
    boolean estDisponible();
    void louer(String client, Date date);
    void retourner(Date date);
}
