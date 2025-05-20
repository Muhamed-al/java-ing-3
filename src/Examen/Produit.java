package Examen;

import Hangman.Category;

public class Produit {

    private int id;

    public Produit(int id) throws IdInvalidException {
        if (!validerId()){
            throw  new IdInvalidException("Id not valid");
        }else{
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws IdInvalidException{
        if (validerId()){
            this.id = id;
        }else{
            throw new IdInvalidException("id not valid");
        }
    }


    public boolean validerId() {
        String idString = String.valueOf(id);
        if (idString.length() < 3 || idString.length() > 12){
            return false;
        }
        if (idString.charAt(idString.length()-1) !=  0 ){
            return false;
        }
        return true;
    }


}
