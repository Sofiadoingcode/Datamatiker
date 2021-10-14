package Opgave2;

public class View {
    private String MSG;
    private String CURRENCY;

    public View (String MSG, String CURRENCY) {
        this.MSG = MSG;
        this.CURRENCY = CURRENCY;
    }
    public void doView(double result){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
    }
}
