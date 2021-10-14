import java.util.ArrayList;

public class Dog {
    private String dogName;
    private boolean isHungry;
    private static ArrayList <Dog> offSpring;
    private Owner owner;

    public Dog (String dogName, boolean isHungry) {
        this.dogName = dogName;
        this.isHungry = isHungry;
        offSpring = new ArrayList<Dog>();
    }

    public String getDogName() {
        return dogName;
    }

    public String getOwner() {
        String ownerName = owner.getName();
        return ownerName;
    }

    public void setOwner(Owner o) {
        owner = o;
    }

    public static ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(Dog a) {
        offSpring.add(a);
    }

    public String feedDog() {
            isHungry = false;
            String s = "This dog is hungry?: " + isHungry;
            return s;
    }


}
