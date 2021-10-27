import java.util.ArrayList;

public class Garage {

    ArrayList<Bil> biler = new ArrayList<>();
    public String name;

    public Garage (String name) {
        this.name = name;
    }

    public void tilføjBil (Bil bil) {
        biler.add(bil);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "biler=" + biler +
                '}';
    }

    public double beregnGrønAfgiftForBilpark() {
        double totalAfgift = 0;
        for(Bil a: biler) {
            double afgift = a.beregnGrønEjerafgift();
            totalAfgift += afgift;
        }
        return totalAfgift;
    }
}
