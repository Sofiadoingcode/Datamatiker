public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage("Sofia's Garage");

        Benzinbil bbil = new Benzinbil("RB34534", "BMW", "201R", 2017, 5, 3, 13.7);
        Dieselbil dbil = new Dieselbil("HN67129", "KIA", "S3", 2020, 5, false, 11.2);
        Elbil ebil = new Elbil("DD88734", "TESLA", "X", 2019, 5, 1000, 200.0, 300);

        garage.tilføjBil(bbil);
        garage.tilføjBil(dbil);
        garage.tilføjBil(ebil);

        System.out.println(garage.toString());

        System.out.println(garage.beregnGrønAfgiftForBilpark());
    }
}
