package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @Test

        void testStartObjectExist() {
            assertNotNull(calculator);

        }
        @Test
        void sum(){
            assertEquals(10, calculator.addTwoNumbers(5,5));

        }

    }
