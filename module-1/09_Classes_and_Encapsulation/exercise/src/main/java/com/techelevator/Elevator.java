package com.techelevator;

public class Elevator {

    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
        currentFloor = 1;
    }

    public void openDoor() {
        this.doorOpen = true;
    }

    public void closeDoor() {
        this.doorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if (doorOpen != true) {
            if (desiredFloor <= numberOfFloors) {
                if (desiredFloor > currentFloor) {
                    currentFloor = desiredFloor;
                }
            }
        }
    }

    public void goDown(int desiredFloor) {
        if (doorOpen != true) {
            if (desiredFloor >= 1) {
                if (desiredFloor < currentFloor) {
                    currentFloor = desiredFloor;
                }
            }
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
