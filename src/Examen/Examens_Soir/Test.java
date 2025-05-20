package Examen.Examens_Soir;


public class Test {
    public static void main(String[] args) {

        Emprunteur e1 = new Emprunteur("E001", "Jhon", "Doe");
        Emprunteur e2 = new Emprunteur("E001", "Ahmed", "Yassin");

        Livre livre = new Livre("L001", "Java Programming", 2, 3, "2022");
        Rapport rapport = new Rapport("R001", "Mémoire IA", 1, "Mohamed", "Ali");

        Bibliotheque biblio = new Bibliotheque();
        biblio.ajouterDocument(livre);
        biblio.ajouterDocument(rapport);

        biblio.afficherDocuments();

        biblio.emprunter_livre(e1, livre);
        biblio.emprunter_livre(e2, rapport);

        biblio.afficherLesEmprunts();

        System.out.println("Emprunteurs triés");
        biblio.emprunteursTries();
    }

}
