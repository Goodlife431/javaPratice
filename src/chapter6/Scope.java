package chapter6;

public class Scope {
    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;

        System.out.printf("local x in main is %d",x);

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.printf("%nlocal x in main is %d%n",x);
    }
    public  static  void useLocalVariable(){
        int x = 25;
        System.out.printf("%n local on entering method uselocalvariable is %d%n",x);
        System.out.printf("(\"%n local on entering method uselocalvariable is %d%n",x);
        ++x;
    }
    public  static void useField(){
        int x = 50;
        System.out.printf("%n fields on entering method useField is %d%n",x);
        System.out.printf("%n fields on entering method useField is %d%n",x);
        x *= 10;
    }
}
