public class Rektangel extends Kvadrat {
    private double sidelængde2;

    public Rektangel(int x, int y, double sidelængde, double sidelængde2) {
        super(x, y, sidelængde);
        this.sidelængde2 = sidelængde2;
    }

    public double getSidelængde2() {
        return sidelængde2;
    }

    public double beregnAreal() {
        return getSidelængde() * sidelængde2;
    }

}
