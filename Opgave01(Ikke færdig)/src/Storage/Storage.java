package Storage;

import Application.Cirkel;
import Application.Ellipse;
import Application.Kvadrat;
import Application.Rektangel;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Kvadrat> kvadrater = new ArrayList<>();
    private static ArrayList<Rektangel> rektangler = new ArrayList<>();
    private static ArrayList<Cirkel> cirkler = new ArrayList<>();
    private static ArrayList<Ellipse> ellipser = new ArrayList<>();

    //------------------------------------------------------------

    public static ArrayList<Kvadrat> getKvadrater() {
        return new ArrayList<>(kvadrater);
    }

    public static void addKvadrat(Kvadrat kvadrat) {
        if(!kvadrater.contains(kvadrat)) {
            kvadrater.add(kvadrat);
        }
    }

    //------------------------------------------------------------

    public static ArrayList<Rektangel> getRektangler() {
        return new ArrayList<>(rektangler);
    }

    public static void addRektangel(Rektangel rektangel) {
        if(!rektangler.contains(rektangel)) {
            rektangler.add(rektangel);
        }
    }

    //------------------------------------------------------------

    public static ArrayList<Cirkel> getCirkler() {
        return new ArrayList<>(cirkler);
    }

    public static void addCirkel(Cirkel cirkel) {
        if(!cirkler.contains(cirkel)) {
            cirkler.add(cirkel);
        }
    }

    //------------------------------------------------------------

    public static ArrayList<Ellipse> getEllipser() {
        return new ArrayList<>(ellipser);
    }

    public static void addEllipse(Ellipse ellipse) {
        if(!ellipser.contains(ellipse)) {
            ellipser.add(ellipse);
        }
    }

    //------------------------------------------------------------



}
