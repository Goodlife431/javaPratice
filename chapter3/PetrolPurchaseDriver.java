package chapter3;

public class PetrolPurchaseDriver {
    public static void main(String[] args) {

            PetrolPurchase myPetrol = new PetrolPurchase("Lekki", "PMS35", 20, 45, 15);

            System.out.println("The station location: " + myPetrol.getStationLocation());

            System.out.println("The type of petrol: " + myPetrol.getPetrolType());
            System.out.println("The purchase quantity in litres: " + myPetrol.getQuantity());
            System.out.println("The percentage discount : " + myPetrol.getPercentageDiscount());
            System.out.println("The purchase amount: " + myPetrol.getPurchaseAmount());
        }

    }


