package Examen.Examen_2022_2023;

public class HabitationIndividuelle extends Habitation{

    private int nbPieces;
    private boolean exist_piscine;

    public HabitationIndividuelle(String prop, String adresse, double surface , int nbPieces , boolean exist_piscine){
        super(prop , adresse , surface);
        this.nbPieces = nbPieces;
        this.exist_piscine = exist_piscine;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public boolean isExist_piscine() {
        return exist_piscine;
    }

    public void setExist_piscine(boolean exist_piscine) {
        this.exist_piscine = exist_piscine;
    }

    @Override
    public double impot() throws ImpotException{
        double base = super.impot();
        if (exist_piscine){
            base+=500;
        }
        base+= 100*nbPieces;

        return  base;
    }

    @Override
    public void affiche(){
        super.affiche();
        System.out.println("Nombre Pieces : " + nbPieces);
        System.out.println("Exist Piscine  : " + exist_piscine);
    }
}
