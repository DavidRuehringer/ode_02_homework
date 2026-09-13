import java.util.Scanner;

//import Klassenhierarchie.Gepard;
import Klassenhierarchie.*;
import Interfaces.*;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** ODE Hausaufgabe 1 ***\n");
        System.out.println("Wähle Hausaufgabe aus!");
        System.out.println("   [B]enchmark");
        System.out.println("   [K]lassenhierarchie");
        System.out.println("   [I]nterfaces\n");
        System.out.print("Eingabe: ");

        char auswahl = Character.toUpperCase(scanner.next().charAt(0));

        switch (auswahl) {
            case 'B':
                System.out.println("\nHausaufgabe Benchmark gewählt.\n");
                benchmark();
                break;

            case 'K':
                System.out.println("\nHausaufgabe Klassenhierarchie gewählt.\n");
                klassenhierarchie();
                break;

            case 'I':
                System.out.println("\nHausaufgabe Interfaces gewählt.\n");
                interfaces();
                break;

            default:
                System.out.println("Ungültige Eingabe.");
        }

        scanner.close();
    }

    /*  Schreiben Sie ein kleines Programm, das in einer while-Schleife 1 Million Punkte auf die
        Konsole schreibt. Stoppen Sie die Zeit, die Ihr Programm dafür benötigt. */

    private static void benchmark() {
        long startTime = System.currentTimeMillis();
        int counter = 1;
        while(counter <= 1000000){
            System.out.println(".");
            counter++;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        float seconds = (float)duration / (float)1000;
        System.out.println("1 Million Punkte in " + seconds + " Sekunden geschrieben.");
    }

    /*  Erstellen Sie ein Interface ‘Interfaces.Form’, welches folgende Methoden abbildet.
        Leiten Sie daraus 3 Klassen ab, welche die Methoden (Mathematisch korrekt)
        implementieren. Die Klassen sollen dabei im Konstruktor mit den dazugehörigen Werten
        (Seite, Radius, …) initialisiert werden.
        Erstellen Sie ein Array, welches von jedem Objekt 2 Stück enthält (Insgesamt 6). Iterieren
        Sie mit einer for-each Schleife darüber und geben Sie die Fläche und den Umfang von den
        Objekten aus. */
    private static void interfaces() {

        Form[] formen = {
                new Kreis(3),
                new Kreis(10),
                new Quadrat(1),
                new Quadrat(6),
                new GlDreieck(9),
                new GlDreieck(4),
        };

        for (Form form : formen){
            form.info();
            double flaeche = form.flaeche();
            double umfang = form.umfang();
            System.out.printf("Fläche: %.2fcm².\n", flaeche); // besser als mit Math.round die Ergebnisse der Rechnung zu ändern
            System.out.printf("Umfang: %.2fcm.\n\n", umfang);

        }


    }


    /*  Erstellen Sie eine Klassenhierarchie des Beispiels aus dem Studienbrief.
        Achten Sie dabei darauf, welche Klassen als abstrakte Klassen realisiert werden sollten.
        Befüllen Sie die Methoden mit beliebigen System.out.println() statements.
        Rufen Sie alle Methoden von Klassenhierarchie.Gepard auf. */

    private static void klassenhierarchie() {
        Gepard gepard = new Gepard ();

        gepard.atmen();
        gepard.schnurren();
        gepard.superspeed();
    }
}