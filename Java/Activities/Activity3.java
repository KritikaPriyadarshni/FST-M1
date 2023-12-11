package activities;

public class Activity3 {
    public static void main (String[] args){        //86400 sec/day
        int seconds = 1000000000;
        int earthSeconds = 31557600;
        double mercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        System.out.println("Age on Earth:" + seconds/earthSeconds  );
        System.out.println("Age on Mercury:" + seconds/earthSeconds/mercurySeconds);
        System.out.println("Age on Mercury:" + seconds/earthSeconds/VenusSeconds);
        System.out.println("Age on Mercury:" + seconds/earthSeconds/MarsSeconds);
        System.out.println("Age on Mercury:" + seconds/earthSeconds/JupiterSeconds);
        System.out.println("Age on Mercury:" + seconds/earthSeconds/SaturnSeconds);
        System.out.println("Age on Mercury:" + seconds/earthSeconds/UranusSeconds);
        System.out.println("Age on Mercury:" + seconds/earthSeconds/NeptuneSeconds);


    }
}








