package chapter4;

public class DogTest {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        Dog d = new Dog();
        d.bark(3);

        one.bark();
        two.bark();
        three.bark();

        d.go();


    }
}
