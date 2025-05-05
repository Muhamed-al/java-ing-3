package Exception.Exercice2;

import java.util.Scanner;

public class AgeVerifier {
    // Méthode qui lance une exception personnalisée
    public static void verifierAge(int age) throws AgeInvalideException {
        if (age < 18) {
            throw new AgeInvalideException("Âge insuffisant pour s’inscrire.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez votre âge : ");
            int age = scanner.nextInt();

            // Appel de la méthode
            verifierAge(age);
            System.out.println("Âge valide pour s’inscrire.");
        } catch (AgeInvalideException e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}