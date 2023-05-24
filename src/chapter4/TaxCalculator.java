package chapter4;

import java.util.Scanner;
import java.util.SplittableRandom;

/* (Tax Calculator) Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen, then determine and display
the citizen’s total tax. Use class Scanner to input the data.*/

public class TaxCalculator {
    private String name;
    private double wage;
    private double commission;

    public void setName(String name){
        this.name = name;
    }
    public void setTax(double wage){
        if (wage > 0) {
            this.wage = wage;
            if (wage <= 30_000) {
                commission = (wage * 15) / 100;
            }
            if (wage > 30_000) {
                commission = (wage *20) / 100;
            }
        }
    }
    public String getName(){
        return name;
    }
    public double getWage(){
        return wage;
    }
    public double getTax(){
        return commission;
    }
}


