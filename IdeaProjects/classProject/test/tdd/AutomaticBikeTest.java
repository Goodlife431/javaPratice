package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {

    @Test
    public void turnOnAutomaticBike() {
        AutomaticBike autoAutomaticBike = new AutomaticBike();
        autoAutomaticBike.turnOn();
        boolean turnOn = autoAutomaticBike.turnOnAuto();
        assertTrue(turnOn);
    }

    @Test
    public void turnOffAutomaticBike() {
        AutomaticBike autoAutomaticBike = new AutomaticBike();
        autoAutomaticBike.turnOff();
        boolean turnOff = autoAutomaticBike.turnOffAuto();
        assertFalse(turnOff);

    }

}

