package activities;

import java.util.*;


class Plane {
    public static List<String> passengers;
    public int maxPassengers;
    public Date lastTimeTookOf;
    public Date lastTimeLanded;
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        passengers = new ArrayList<>();

    }
    public static void onboard(String passenger) {
        passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;

    }
    public void land() {
        this.lastTimeLanded = new Date();
        passengers.clear();
    }
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
    public List<String> getPassengers() {
        return passengers;
    }
}


