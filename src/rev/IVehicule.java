package rev;

import java.util.Date;

public interface IVehicule {

    public boolean estDisponible();
    public void louer(String client , Date date);
    public void retourner(Date date);
}
