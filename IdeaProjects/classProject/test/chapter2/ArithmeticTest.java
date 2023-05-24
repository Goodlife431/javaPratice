package chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    Arithmetic arithmetic;
    @BeforeEach
    void startAllTestWith(){
         arithmetic = new Arithmetic();

    }
    @Test
    void checkIfObjectExists(){
         assertNotNull(arithmetic);
    }
    @Test
    void totalSum(){
        assertEquals(15, arithmetic.testForSumOfThreeNumbers(5,5,5));
    }
    @Test
    void productOfThreeNumbers(){
        assertEquals(8, arithmetic.productOfThreeNumbers(2,2,2));
    }
    @Test
    void averageThreeNumbers(){
        assertEquals(2, arithmetic.averageOfThreeNumbers(2,2,2));
    }
    @Test
    void largestOfThreeNumbers(){
        assertEquals(10, arithmetic.testForLargestOfThreeNumbers(5,8,10));
    }
    @Test
    void smallestOfThreeNumbers(){
        assertEquals(5, arithmetic.testForSmallestOfThreeNumbers(5,8,10));
    }

}