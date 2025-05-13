package Examen;

public class Person {

    public String name;
    public String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public  String toString(){
        return  "name : " + name + " Email : " + email;
    }
}
