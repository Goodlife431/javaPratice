package tdd;

public class AutomaticBike {
    private boolean turnOn;
    private boolean turnOff;

    public void turnOn() {
        if(turnOn == false) {
            turnOn = true;

        }

    }
    public boolean turnOnAuto() { return turnOn; }

    public void turnOff() {
        if(turnOff == true) {
            turnOff = false;
        }
    }

    public boolean turnOffAuto() { return turnOff; }

    public void accelerate() {

    }
    }


