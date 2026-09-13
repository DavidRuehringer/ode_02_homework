package Interfaces;

public class Quadrat implements Form{
    private int seite;

    public Quadrat(int seite) {
        this.seite = seite;
    }

    @Override
    public double flaeche() {
        return seite * seite;
    }

    @Override
    public double umfang() {
        return 4 * seite;
    }

    @Override
    public void info() {
        System.out.println("Quadrat mit Seite: " + seite + ".");
    }
}
