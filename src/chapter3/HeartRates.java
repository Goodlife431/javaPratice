package chapter3;
import java.util.Scanner;
public class HeartRates {
    Scanner input = new Scanner(System.in);
    public String firstName;
    public String lastName;
    public int date;
    public int month;
    public int day;
    public int year;
    public int age;

    public HeartRates(String firstName, String lastName, int date, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setFirstName(String firstName){

    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName) {

    }
    public String getLastName(){
        return lastName;
    }

    public void setDate(int date){

    }
    public int getDate(){
        return date;
    }

        public void setMonth(int month) {

        }
        public int getMonth(){
            return month;
        }
        public void setDay(int day){

        }
        public int getDay(){
        return day;
        }
        public void setYear(int year) {

        }
        public int getYear() {
            return year;
        }

        public void age(int age) {
        int currentYear = 2022;
        int year = input.nextInt();
        this.year = year;
            age = (currentYear - year);

        }
        public int getAge() {
        return age;
        }

        public void maximumHeartRate(double maximumHeartRate){
        //maaximum heart in minutes is 220 - age
            maximumHeartRate = (220 - age);
        }
        public double maximumHeartRate(){
        return maximumHeartRate();
        }
        public void heartRate(double heartRate){
            double maximumHeart = 0.0;
            heartRate = (maximumHeart/50)*100;
        }




    }



