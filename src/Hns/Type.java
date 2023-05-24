package Hns;

public enum Type {
    EXECUTIVE(15_000),
    STANDARD(10_000),
    AWOYAYA(5000);
    private final int price;
    Type(int price){
        this.price = price;
    }
}
