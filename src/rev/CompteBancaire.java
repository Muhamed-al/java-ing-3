package rev;

public class CompteBancaire {

    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte , double solde){
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void retrait(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Fond insuffisant");
        }
        else {
            solde -= montant;
            System.out.println(montant + " retiré avec succès.");
        }
    }
    public void depot(double montant) {
        solde += montant;
        System.out.println(montant + " déposé avec succès.");
    }

    public void test() {
        try{
            retrait(120);
        }catch (SoldeInsuffisantException e){
            System.out.println(e.getMessage());
        }
    }

}
