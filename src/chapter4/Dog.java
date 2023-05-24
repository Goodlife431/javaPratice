package chapter4;

public class Dog {
    int size;
    String name;

    void bark(){
        if (size > 60){
            System.out.println("Woof Woof");
        } else if (size > 14) {
            System.out.println("Ruff Ruff");
        }
        else {
            System.out.println("Yip yip");
        }
    }
    void bark(int numOfBarks){
        while (numOfBarks > 0){
            System.out.println("ruff");
            numOfBarks = numOfBarks - 1;
        }
    }
    void go (){
        Dog t = new Dog();
        t.takeTwo(12,34);
        int foo = 7;
        int bar = 3;
        t.takeTwo(foo,bar);
        System.out.println("foo is"+foo +"and bar is"+bar);
    }

    private void takeTwo(int x, int y) {
        int z = x+y;
        System.out.println("total is "+z);
    }
    public void array(Dog[] pets){
        pets[0] = new Dog();
        pets[1] = new Dog();

    }
}
