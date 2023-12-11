package activities;

public class Activity6 {
    public static void main (String[] args){
        Plane plane = new Plane(10);
        Plane.onboard("John");
        Plane.onboard("Ketty");
        Plane.onboard("Nick");
        System.out.println("Take off time is:" + plane.takeOff());
        System.out.println("Name of passengers" + plane.getPassengers());
        //Thread.sleep(5000);
        plane.land();
        System.out.println("Plane landing time:" + plane.getLastTimeLanded());
        System.out.println("people on plane after landing" + plane.getPassengers());




    }

}
