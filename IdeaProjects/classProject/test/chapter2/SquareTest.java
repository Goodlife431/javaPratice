package chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;
    @BeforeEach
    void startAllTestWith(){
        square = new Square();
    }

    @Test
    void testThatObjectExist(){
        assertNotNull(square);
    }
    @Test
    void testForSquare(){
        assertEquals(25,square.squareOfNumber(5));
    }
    @Test
    void testForSquare2(){
        assertEquals(49,square.squareOfNumber2(7));
    }
    @Test
    void testForAddition(){
        assertEquals(8, square.additionOfSquare(4,4));
    }
    @Test
    void testForSubtraction() {
        assertEquals(10, square.subtractionOfSquare(20,10));
    }
}