package Exception.Exercice3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatriceSecurisee {

    public static int calculer(int a, int b, char operation) throws OperationInvalideException {
        switch (operation) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                return a / b; // Peut lancer une ArithmeticException
            default:
                throw new OperationInvalideException("Opération non reconnue.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuer = true;

        while (continuer) {
            System.out.print("Entrez le 1er nombre : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le 2e nombre : ");
            int b = scanner.nextInt();

            System.out.print("Opération (+, -, *, /) : ");
            char op = scanner.next().charAt(0);
            try {
                int resultat = calculer(a, b, op);
                System.out.println("Résultat = " + resultat);
            } catch (ArithmeticException e) {
                System.out.println("Erreur : division par zéro.");
            } catch (OperationInvalideException e) {
                System.out.println("Erreur : " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Erreur : entrée invalide. Veuillez entrer des nombres.");
                scanner.next(); // vider l'entrée incorrecte
            } finally {
                System.out.print("Voulez-vous continuer ? (o/n) : ");
                String reponse = scanner.next();
                if (!reponse.equalsIgnoreCase("o")) {
                    continuer = false;
                    System.out.println("Merci d’avoir utilisé notre calculatrice !");
                }
            }
        }
    }
}