package Examen.Examens_Jours.Exercice2;

public class Main {
    public static void main(String[] args) {
        CompteBancaire CB1 = new CompteBancaire("126699", 100.0);
        try {
            CB1.retrait(80.0);
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        }
    }
}

