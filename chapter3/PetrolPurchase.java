package chapter3;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType,
                          int quantity, double pricePerLitre, double percentageDiscount) {

        this.setStationLocation(stationLocation);
        this.setPetrolType(petrolType);
        this.setQuantity(quantity);
        this.setPricePerLitre(pricePerLitre);
        this.setPercentageDiscount(percentageDiscount);
    }
    public double getPurchaseAmount(){
        return getQuantity() * getPricePerLitre() *(1 - getPercentageDiscount() / 100);
    }
    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;


            }

    public String getStationLocation() {
        return stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
}
































