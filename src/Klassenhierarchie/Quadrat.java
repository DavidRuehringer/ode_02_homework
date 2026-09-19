package Klassenhierarchie;

public class Quadrat extends Form{
    private int seite = 0;

    public Quadrat(int seite) {
        this.seite = seite;
    }

    public Quadrat(){
        this.seite = 3;
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
    public void info(){
        System.out.printf("Quadrat: %dcm, %.2fcm², 0x%s, %.2fcm \n",
                seite, flaeche(), Integer.toHexString((int)flaeche()), umfang());
    }
}
