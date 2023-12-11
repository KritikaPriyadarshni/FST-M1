package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    //Create Constructor
    Car(){
        tyres = 4;
        doors = 4;

    }

    //Methods
    public void displayCharacteristics() {
        System.out.println("Color of the Car: " +  color);
        System.out.println("Transmission of the Car: " +  transmission);
        System.out.println("Year of Making: " +  make);
        System.out.println("No. of tyres: " +  tyres);
        System.out.println("No. of the doors: " +  doors);
    }
    public void accelarate(){
        System.out.println("Car is moving forward");

    }
    public void brake(){
        System.out.println("Car has stopped");
    }

}
