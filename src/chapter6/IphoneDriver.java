package chapter6;

public class IphoneDriver {
    public static void main(String[] args) {
        Iphone Iphone = new Iphone();
        Iphone.setPrice(455.44);

        System.out.printf("The price of our Iphone is: %f", Iphone.getPrice());
        System.out.println();
        Iphone.setColour("black");
        System.out.printf("colour of my iphone is grey: %s", Iphone.getColour());

    }


    }

