package Klassenhierarchie;

public class Kreis extends Form {
    private int radius = 0;

    public Kreis(int radius) {
        this.radius = radius;

    }

    public Kreis(){
        this.radius = 3;
    }

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
        System.out.printf("Kreis: %dcm, %.2fcm², 0x%s, %.2fcm \n",
                radius, flaeche(), Integer.toHexString((int)flaeche()), umfang());
    }


}
