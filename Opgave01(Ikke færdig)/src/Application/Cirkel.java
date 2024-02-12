package Application;

public class Cirkel extends Figur{
    private double radius;
    public Cirkel(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public double beregnRadius() {
        return Math.PI * radius * 2;
    }

    public double getRadius() {
        return radius;
    }
}
