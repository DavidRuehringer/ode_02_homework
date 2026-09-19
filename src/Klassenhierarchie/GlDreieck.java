package Klassenhierarchie;

public class GlDreieck extends Form{
    private int seite = 0;

    public GlDreieck(int seite) {
        this.seite = seite;
    }

    public GlDreieck(){
        this.seite = 3;
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
    public void info(){
        System.out.printf("GlDreieck: %dcm, %.2fcm², 0x%s, %.2fcm \n",
                seite, flaeche(), Integer.toHexString((int)flaeche()), umfang());
    }
}
