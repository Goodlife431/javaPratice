package chapter6;
/* (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
the charge for each customer.*/
public class ParkingChargers {
    private String customer;
    private int hour;
    private double totalCharges;

    public void setName(String customer) {
        this.customer = customer;
    }

    public void setFee(int hour) {
        if (hour > 0) {
            this.hour = hour;
            if (hour < 3) {
                totalCharges = 2.00;
                if (hour > 3) {
                    totalCharges = 2.00 + 0.50;
                    if (hour > 24) {
                        totalCharges = 10.00;
                    }
                }
            }
        }
    }
    public String getName() {
        return customer;
    }
    public int getFee() {
        return hour;

    }
    public double getTotalCharges() {
        return totalCharges;
    }

}
