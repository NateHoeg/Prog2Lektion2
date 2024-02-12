package Application;

public class Kvadrat extends Figur{
    private double sidelængde;

    public Kvadrat(int x, int y, double sidelængde) {
        super(x, y);
        this.sidelængde = sidelængde;
    }

    public double getSidelængde() {
        return sidelængde;
    }

    public double beregnAreal() {
        return sidelængde * 2;
    }

}
