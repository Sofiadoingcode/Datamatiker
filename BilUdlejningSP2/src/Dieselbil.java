public class Dieselbil extends Bil{
    private boolean harPartikelfilter;
    private double kmPrL;

    public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrL=" + kmPrL +
                '}';
    }


    @Override
    public double beregnGrønEjerafgift() {
        double afgift = 0;

        if(kmPrL >= 20 && kmPrL <= 50) {
            afgift = 330 + 130;
        } else if (kmPrL < 20 && kmPrL >= 15) {
            afgift = 1050 + 1390;
        } else if (kmPrL < 15 && kmPrL >= 10) {
            afgift = 2340 + 1850;
        } else if (kmPrL < 10 && kmPrL >= 5) {
            afgift = 5500 + 2770;
        } else if (kmPrL < 5) {
            afgift = 10470 + 15260;
        }

        if  (harPartikelfilter != true) {
            afgift += 1000;
        }
        return afgift;
    }

}
