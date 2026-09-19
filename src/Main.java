import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Klassenhierarchie.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** ODE Hausaufgabe 1 ***\n");
        System.out.println("Wähle Hausaufgabe aus!");
        System.out.println("   [K]lassenhierarchie");
        System.out.println("   [C]ollection");
        System.out.println("   [E]ntry Zugriff");
        System.out.println("   [L]aufzeit Problem");
        System.out.println("   [R]echteck\n");

        System.out.print("Eingabe: ");

        char auswahl = Character.toUpperCase(scanner.next().charAt(0));

        switch (auswahl) {
            case 'C':
                System.out.println("\nHausaufgabe Collection gewählt.\n");
                collection();
                break;

            case 'E':
                System.out.println("\nHausaufgabe Entry Zugriff gewählt.\n");
                entryZugriff();
                break;

            case 'K':
                System.out.println("\nHausaufgabe Klassenhierarchie gewählt.\n");
                klassenhierarchie();
                break;

            case 'L':
                System.out.println("\nHausaufgabe Laufzeit Problem gewählt.\n");
                laufzeitProblem();
                break;

            case 'R':
                System.out.println("\nHausaufgabe Rechteck gewählt.\n");
                Rechteck.rechteck();
                break;

            default:
                System.out.println("Ungültige Eingabe.");
        }

        scanner.close();
    }


    private static void klassenhierarchie() {
        Form[] formen = {
                new Kreis(),
                new Kreis(10),
                new Quadrat(),
                new Quadrat(6),
                new GlDreieck(),
                new GlDreieck(4),
        };

        for (Form form : formen) {
            form.info();
        }
    }

    private static void collection() {
        ArrayList<Form> formenSortiert = new ArrayList<>();

        formenSortiert.add(new Kreis());
        formenSortiert.add(new Kreis(10));
        formenSortiert.add(new Quadrat());
        formenSortiert.add(new Quadrat(6));
        formenSortiert.add(new GlDreieck());
        formenSortiert.add(new GlDreieck(9));

        formenSortiert.sort(Comparator.comparingDouble(Form::flaeche).thenComparingDouble(Form::umfang)); //thenComparing als Bonus

        for (Form form : formenSortiert) {
            form.info();
        }
    }

    private static void entryZugriff(){
        ArrayList<Form> formenUnsortiert = new ArrayList<>();

        formenUnsortiert.add(new Kreis());
        formenUnsortiert.add(new Kreis(10));
        formenUnsortiert.add(new Quadrat());
        formenUnsortiert.add(new Quadrat(6));
        formenUnsortiert.add(new GlDreieck());
        formenUnsortiert.add(new GlDreieck(9));

//        formenSortiert.sort(Comparator.comparingDouble(Form::flaeche).thenComparingDouble(Form::umfang)); //thenComparing als Bonus
//
//        formenSortiert.getLast().info(); // besser als size() - 1

        // Learning: maximum lässt sich direkt abrufen

        Collections.max(formenUnsortiert, Comparator.comparingDouble(Form::flaeche)).info();

    }

    private static void laufzeitProblem(){
        int i;      // ich lass die drei Variablen hier, aber grundsätzlich würde es reichen sie in der Schleife zu deklarieren,
        int j;      // weil wir sie nicht benötigen bzw. nachher nicht mehr damit weiter arbeiten
        int base = 0;
        String[] numbers = new String[3];
        numbers[0] = "10";
        numbers[1] = "20";
        numbers[2] = "30";
        for (base = 10; base >= 2; --base) {
            for (j = 0; j < numbers.length; ++j) {      //ursprüngliches Problem: <= 3, aber Array startet mit Position[0] und geht nur bis [2]
                try {                                   // Lösung 1: < 3 ; Aber langfristig/grundsätzlich besser ist numbers.length
                    i = Integer.parseInt(numbers[j], base);
                    System.out.println(numbers[j] + " base " + base + " = " + i);
                } catch (NumberFormatException e) {
                    System.out.println(numbers[j] + " nicht darstellbar mit Basis " + base + " (ungültige Ziffer(n))");
                }

            }
        }

    }




}