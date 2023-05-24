package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

        @Test
        public void turnOnAirconditioner() {
            //given i have an airConditioner
            AirConditioner oluwaseunAirConditioner = new AirConditioner();
            //when i turn the airConditioner on
            oluwaseunAirConditioner.turnOn();
            //check if it is on
            boolean turnOn = oluwaseunAirConditioner.turnOnAc();
            assertTrue(turnOn);

        }

        @Test
    public void turnOffAirconditioner() {
            //given i have an AirConditioner,
            //And it is on
            AirConditioner oluwaseunAirCondition = new AirConditioner();
            //when i turn it off
            oluwaseunAirCondition.turnOff();
            //check if it is off
            boolean turnOff = oluwaseunAirCondition.turnOffAc();
            assertFalse(turnOff);

        }

        @Test
    public void tempIncreaseAirCondition() {
            AirConditioner oluwaseunAirCondition = new AirConditioner();
            oluwaseunAirCondition.tempIncrease();
            int tempIncrease = oluwaseunAirCondition.tempIncrease();
            assertEquals(16, tempIncrease);

        }

        @Test
    public void tempDecreaseAirCondition() {
            AirConditioner oluwaseunAirCondition = new AirConditioner();
            oluwaseunAirCondition.tempDecrease();
            int tempDecrease = oluwaseunAirCondition.tempDecrease();
            assertEquals( 30, tempDecrease);

        }

        @Test
    public void minimumTemperatureAirCondition() {
            AirConditioner oluwaseunAirCondition = new AirConditioner();
            oluwaseunAirCondition.minimumTemperature();
            int minimumTemperature = oluwaseunAirCondition.minimumTemperature();
            assertEquals(16, minimumTemperature);
        }

        @Test
    public void maximumTemperatureAirCondition() {
            AirConditioner oluwaseunAirCondition = new AirConditioner();
            oluwaseunAirCondition.maximumTemperature();
            int maximumTemperature = oluwaseunAirCondition.maximumTemperature();
            assertEquals(30, maximumTemperature);
        }




    }
