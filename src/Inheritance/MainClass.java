package Inheritance;

public class MainClass {
    public static void main(String[] args) {
        JavaInnerClass.OuterClass myOuter = new JavaInnerClass.OuterClass();
        JavaInnerClass.OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
