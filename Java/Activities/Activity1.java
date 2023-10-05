package activities;

public class Activity1 {
    public static void main(String[] args){
    Car Merc = new Car();
    Merc.make = 2014;
    Merc.color = "Black";
    Merc.transmission = "Manual";

    Merc.displayCharacteristics();
    Merc.accelarate();
    Merc.brake();

    }
}
