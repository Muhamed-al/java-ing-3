package Examen.Examens_Soir;

import javax.print.Doc;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;

import java.util.*;

public class Bibliotheque {
    List<Document> documents ;
    List<Emprunt> emprunts ;


    public Bibliotheque() {
        this.documents = new ArrayList<>() ;
        this.emprunts = new ArrayList<>();
    }
    public void ajouterDocument(Document d){
      documents.add(d);
    }
    public boolean rechercher(Document d){
        return documents.contains(d);
    }
    public boolean emprunter_livre(Emprunteur e , Document d) {
        if (d.getNombre_de_copies_disponible() > 0) {
            Emprunt em = new Emprunt(d, e);
            emprunts.add(em);
            d.decrementer();
            return true;
        } else {
            return false;
        }
    }
    public void afficherDocuments(){
       // System.out.println(documents);
        for(Document d : documents){
            System.out.println(d);
        }
    }
    public void afficherLesEmprunts(){
        for(Emprunt em : emprunts){
            System.out.println(em);
        }
    }
    public void emprunteursTries (){
        List<String> noms = new ArrayList<>();
        for(Emprunt em : emprunts) {
            noms.add(em.getE().toString());
        }
        Collections.sort(noms);
        System.out.println(noms);
    }
}
