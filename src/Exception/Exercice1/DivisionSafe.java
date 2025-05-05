package Exception.Exercice1;

import java.util.Scanner;

public class DivisionSafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Demande des deux entiers
        System.out.print("Entrez le numérateur : ");
        int a = scanner.nextInt();
        System.out.print("Entrez le dénominateur : ");
        int b = scanner.nextInt();

        try {

            // Division potentiellement risquée
            int result = a / b;
            System.out.println("Résultat : " + result);
        } catch (ArithmeticException e) {
            // Gère l'erreur si b == 0
            System.out.println("Erreur : division par zéro.");
        } finally {
            // Toujours exécuté
            System.out.println("Fin du programme.");
        }

        scanner.close();
    }
}