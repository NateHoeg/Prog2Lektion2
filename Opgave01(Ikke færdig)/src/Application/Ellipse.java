package Application;

public class Ellipse extends Cirkel{
    private double radius2;

    public Ellipse(int x, int y, int radius, double radius2) {
        super(x, y, radius);
        this.radius2 = radius2;
    }

    public double getRadius2() {
        return radius2;
    }

    public double beregnRadius() {
        return Math.PI * getRadius() * radius2;
    }
}
