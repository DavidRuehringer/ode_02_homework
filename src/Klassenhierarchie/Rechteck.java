package Klassenhierarchie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rechteck {

    public static void rechteck() {
        Scanner scan = new java.util.Scanner(System.in);
        double laenge = 0;  // Änderung zu double, weil wir mit der Eingabe gleich rechnen wollen
        double breite = 0;  // Abfangen gleich bei der Eingabe => eingabeLaenge nicht notwendig

        try {
            System.out.print("Geben Sie die Länge an: ");
            laenge = scan.nextDouble(); // Learning: Es gibt nextDouble() dh ich brauch kein => Double.parseDouble(scan.next())

            if (laenge <= 0){
                throw new IllegalArgumentException();
            }

        } catch (InputMismatchException e) {
            System.out.println("Falsches Format! Nur positive Zahlen erlaubt.");
            return;     // returns notwendig, sonst läuft das Programm normal weiter
        } catch (IllegalArgumentException e){
            System.out.println("Eingabe muss größer als 0 sein!");
            return;
        } finally {     // Learning: wird immer ausgeführt => alles was geschlossen werden muss hinein
            scan.close();
        }

        try {
            System.out.print("Geben Sie die Breite an: ");
            breite = scan.nextDouble();

            if (breite <= 0){
                throw new IllegalArgumentException();
            }

        } catch (InputMismatchException e) {
            System.out.println("Falsches Format! Nur positive Zahlen erlaubt.");
            return;
        } catch (IllegalArgumentException e){
            System.out.println("Eingabe muss größer als 0 sein!");
            return;
        } finally {
            scan.close();
        }


        double umfang = (laenge + breite) * 2;
        double flaeche = laenge * breite;
        System.out.printf("Umfang: %.2f\n", umfang); //printf for formatted output
        System.out.printf("Fläche: %.2f\n", flaeche);
    }
}
