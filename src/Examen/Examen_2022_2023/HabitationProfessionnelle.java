package Examen.Examen_2022_2023;

public class HabitationProfessionnelle extends Habitation{

    private int nbEmployee;

    public HabitationProfessionnelle(String prop, String adresse, double surface , int nbEmployee){
        super(prop , adresse , surface);
        this.nbEmployee = nbEmployee;
    }

    public int getNbEmployee() {
        return nbEmployee;
    }

    public void setNbEmployee(int nbEmployee) {
        this.nbEmployee = nbEmployee;
    }

    @Override
    public double impot() throws ImpotException{
        double base = super.impot();
        //base+=nbEmployee * 100;
        base += 1000 * (nbEmployee/10);
        return base;
    }

    @Override
    public void affiche(){
        super.affiche();
        System.out.println("NB Employee : " + nbEmployee);
    }
}
