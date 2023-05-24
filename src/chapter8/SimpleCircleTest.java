package chapter8;

public class SimpleCircleTest {
    public static void main(String[] args) {
        SimpleCircle circle = new SimpleCircle();
        circle.setRadius(87.1);
        System.out.println("The area of circle is"+circle.getArea()+ "The radius of circle is"+circle.getRadius());

        SimpleCircle circle1 = new SimpleCircle(6.7);
        System.out.println("The radius of circle is"+circle1.getRadius()+ "Parameter is "+circle1.getPerimeter());

        SimpleCircle circle2 = new SimpleCircle();
        circle2.radius = 100;
        System.out.println("The radius of circle is:"+circle2.radius+"The area of circle is"+circle2.getArea());

    }
}
