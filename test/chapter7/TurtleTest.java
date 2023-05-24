package chapter7;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
        Pen biro = new Pen();
        ijapa.setBiro(biro);
    }

}