package tdd;

public class AirConditioner {

    private boolean turnOn;
    private boolean turnOff;



    public void turnOn() {
        if (turnOn == false) {
            turnOn = true;
        }
    }

    public boolean turnOnAc() { return turnOn; }

    public void turnOff() {
        if (turnOff == true) {
            turnOff = false;
        }
    }

    public boolean turnOffAc() { return turnOff; }

   public int tempIncrease() {
        int temperatureIncrease = 16;
        if(temperatureIncrease >= 16);

       return temperatureIncrease;
   }

   public int tempDecrease() {
       int temperature = 30;
       if(temperature <= 30);

       return temperature;
    }

    public int minimumTemperature() {
        int minimumTemperature = 16;
        int var = 16;
        int temperature = var;
        if(var < 16);

        return minimumTemperature;
    }

    public int maximumTemperature() {
        int maximumTemperature = 30;
        int var = 30;
        int temperature = var;
        if(var > 30);

        return maximumTemperature;
    }

}





