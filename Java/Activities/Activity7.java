package activities;


        interface BicycleParts {
            public int gears = 0;
            public int speed = 0;
        }
        interface BicycleOperations {
            public void applyBrake(int decrement);
            public void speedUp(int increment);
        }

        class Bicycle implements BicycleOperations, BicycleParts {
            public int gears;
            public int speed;
            public Bicycle(int gears, int speed) {
                this.gears = gears;
                this.speed = speed;
            }

            public void speedUp(int increment){
                speed = speed + increment;
                System.out.println("Current speed after increment:" + speed);

            }
            public void applyBrake(int decrement){
                speed = speed - decrement;
                System.out.println("Current speed after decrement:" + speed);

            }

            public String bicycleDesc() {
                return("No. of gears:"+ gears + "\nSpeed of bicycle:" + speed);


            }

        }

        //derived class
        class MountainBike extends Bicycle{

            public int seatHeight;
            public MountainBike(int gears, int speed, int startHeight){
                super(gears,speed);
                seatHeight = startHeight;
            }

            public void setHeight(int newValue) {
                seatHeight = newValue;
            }
            public String bicycleDesc() {
                return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
            }



        }

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(2,30,4);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(5);
        mb.applyBrake(10);

    }
}