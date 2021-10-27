public class Benzinbil extends Bil{

    private int oktantal;
    private double kmPrL;

    public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.kmPrL = kmPrL;
        this.oktantal = oktantal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktantal +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    public double beregnGrønEjerafgift() {
        double afgift = 0;

        if(kmPrL >= 20 && kmPrL <= 50) {
            afgift = 330;
        } else if (kmPrL < 20 && kmPrL >= 15) {
            afgift = 1050;
        } else if (kmPrL < 15 && kmPrL >= 10) {
            afgift = 2340;
        } else if (kmPrL < 10 && kmPrL >= 5) {
            afgift = 5500;
        } else if (kmPrL < 5) {
            afgift = 10470;
        }
        return afgift;
    }
}
