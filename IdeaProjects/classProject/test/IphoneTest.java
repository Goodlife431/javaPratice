import chapter6.Iphone;

class IphoneTest {
    public static void main(String[] args) {
        Iphone.setPrice(500);
        System.out.printf("The price is : %.2f",Iphone.getPrice());

        System.out.println();
        Iphone iphoneColour = new Iphone();
        iphoneColour.setColour("white");
        System.out.printf("The colour is :%s",iphoneColour.getColour());

    }



}