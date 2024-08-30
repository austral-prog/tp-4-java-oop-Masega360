package com.template;

public class Elevator {
    int floor;
    int passenger;
    int maxFloor;
    int minFloor;
    int maxPassenger ;

    public Elevator(int minFloor, int maxFloor, int maxPassenger) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxPassenger = maxPassenger;
    }
    public void moveToFloor(int floorNew) {
        if (floorNew <= maxFloor && floorNew >= minFloor) {
            this.floor = floorNew;
        }
    }

    public int getCurrentFloor() {
        return this.floor;
    }

    public void addPassenger() {
        int passengerNewAmount = this.passenger + 1;
        if (passengerNewAmount <= maxPassenger) {
            this.passenger = passengerNewAmount;
        }
    }

    public int getPassengerCount() {
        return this.passenger;
    }

    public void removePassenger() {
        int passengerNRemoveAmount = this.passenger - 1;
        if (passengerNRemoveAmount > 0) {
            this.passenger = passengerNRemoveAmount;
        }


    }



    // Implement this class by observing the tests in this repo. From those you will be able
    // to pick what the constructors params are, what the methods are and what they should do.


}
