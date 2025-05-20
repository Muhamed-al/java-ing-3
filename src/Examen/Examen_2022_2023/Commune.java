package Examen.Examen_2022_2023;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.List;

public class Commune {

    private String name;
    private List<Habitation> habitations;

    public Commune(String name){
        this.name = name;
        this.habitations = new ArrayList<>();
    }

    public void ajouterHabitant(Habitation h){
        this.habitations.add(h);
    }
    public double calculImpotLocal(){
        double total = 0;
        for (Habitation h : habitations){
            try {
                total+= h.impot();
            } catch (ImpotException e) {
                System.out.println(e.getMessage());
            }
        }

        return total;
    }

    public void afficher(){
        for (Habitation h : habitations){
            h.affiche();
            System.out.println("-----------------------");
        }
    }

}
