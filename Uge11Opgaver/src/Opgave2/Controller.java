package Opgave2;

public class Controller {
    Dialog diag = new Dialog();
    CalculateVat vat = new CalculateVat(25);
    View view = new View("moms", "kr");

    public void runController() {
        double userIn = diag.doDiag();
        double moms = vat.doVAT(userIn);
        view.doView(moms);
    }

}
