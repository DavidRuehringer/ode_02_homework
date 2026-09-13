package Interfaces;

public class GlDreieck implements Form{
    private int seite;

    public GlDreieck(int seite) {
        this.seite = seite;
    }

    @Override
    public double flaeche() {
        return 1.0/4.0 * seite*seite * Math.sqrt(3);
    }

    @Override
    public double umfang() {
        return 3 * seite;
    }

    @Override
    public void info() {
        System.out.println("Gleichseitiges Dreieck mit Seite: " + seite + ".");
    }
}
