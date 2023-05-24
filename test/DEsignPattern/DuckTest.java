package DEsignPattern;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuckTest {


    @Test
    public  void duckTest(){
        F1 f1 = new F1();
        F2 f2 = new F2();
        F3 f3 = new F3();
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();
        Q3 q3 = new Q3();

        Duck mountainDuck = new Duck(f1,q2);
        Duck rubberDuck = new Duck(f3,q1);
        Duck fuckDuck = new Duck(f2,q3);

        fuckDuck.setFly(f1);
    }
}