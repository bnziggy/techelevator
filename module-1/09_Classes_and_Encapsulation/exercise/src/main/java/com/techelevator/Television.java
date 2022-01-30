package com.techelevator;

public class Television {
    private boolean isOn;
    private int currentChannel;
    private int currentVolume;

    public Television() { // Set default values
        this.isOn = false;
        this.currentChannel = 3;
        this.currentVolume = 2;
    }

    // Methods to change
    public void turnOff() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        this.currentChannel = 3;
        this.currentVolume = 2;
    }

    public void changeChannel(int newChannel) {
        if (isOn == true && (newChannel >= 3 && newChannel <= 18)) {
            this.currentChannel = newChannel;
        }
    }

    public void channelUp() {
        if (isOn == true) {
            if (currentChannel == 18) {
                currentChannel = 3;
            }
            else {
                this.currentChannel++;
            }
        }
    }

    public void channelDown() {
        if (isOn == true) {
            if (currentChannel == 3) {
                currentChannel = 18;
            }
            else {
                this.currentChannel--;
            }
        }
    }

    public void raiseVolume() {
        if (isOn == true) {
            if (currentVolume < 10) {
                this.currentVolume++;
            }
        }
    }

    public void lowerVolume() {
        if (isOn == true) {
            if (currentVolume > 0) {
                this.currentVolume--;
            }
        }
    }

    // Getters

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
