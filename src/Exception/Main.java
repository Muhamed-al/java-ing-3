package Exception;

public class Main {

    public static void main(String[] args){
        try {

            // instruction 1
            System.out.println("instruction 3");
            // instruction 3
            System.out.println(5/0);

        } catch(ArithmeticException e){
            System.out.println("Erreur");
        }finally {
            System.out.println("INSIDE FINALLY");
            System.out.println("instruction 4");
            // instruction 4
            System.out.println("instruction 4");
        }
        System.out.println("Continue . . . ");

    }
}
