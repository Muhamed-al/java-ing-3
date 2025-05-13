package Examen.Examens_Soir;

import javax.print.Doc;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;

import java.util.*;

public class Bibliotheque {

    List<Document> documents = new ArrayList<>();
    List<Emprunt> emprunts = new ArrayList<>();

    public void ajouterDocument(Document d){
        documents.add(d);
    }

    public boolean rechercher(Document d){
        return this.documents.contains(d);
    }

    public boolean emprunter_livre(Emprunteur E, Document D){
        if (D.getCopiesDisponibles() > 0){
            emprunts.add(new Emprunt(D,E));
            D.decrementerCopies();
            return true;
        }
        return false;
    }
    public  void afficherDocuments(){
        // System.out.println(documents);
        // OU BIEN
        for (Document d : documents){
            System.out.println(d);
        }
    }

    public void afficherLesEmprunts(){
        System.out.println(emprunts);
        // OU BIEN
        for (Emprunt em : emprunts){
            System.out.println(em);
        }
    }

    public void afficherEmprunteur(){
        for (Emprunt em : emprunts){
            System.out.println(em.getEmprunteur());
        }
    }

    public  void emprunteursTries(){
        List<String> emprunteurs = new ArrayList<>();
        for (Emprunt em : emprunts){
            emprunteurs.add(em.getEmprunteur().toString());
        }
        Collections.sort(emprunteurs);
        System.out.println(emprunteurs);
    }




}
