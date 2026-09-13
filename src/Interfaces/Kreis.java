package Interfaces;

public class Kreis implements Form {
    private int radius;

    @Override
    public double umfang() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double flaeche(){
        return radius * radius * Math.PI;
    }

    @Override
    public void info(){
        System.out.println("Kreis mit Radius: " + radius + ".");
    }

    public Kreis(int radius) {
        this.radius = radius;

    }
}
