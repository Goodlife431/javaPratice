package chapter6;

public class MethodOverloading {

        public int addNumbers(int num1, int num2) {
            int num = num1 + num2;

            return num;
        }
        public double addNumbers(int num1, double num2) {
            double numb = num1 + num2;

            return numb;
        }
        public double addNumbers(double num1, double num2){
            double num = num1 + num2;


            return num;
        }
        public double addNumbers(double num1, int num2) {
            double numb = num1 + num2;

            return numb;
        }

        public static void main(String[] args) {
            chapter6.MethodOverloading methodOverloading = new chapter6.MethodOverloading();
            System.out.println("method overloading one: "+ methodOverloading.addNumbers(2,2));
            System.out.println("method overloading two: "+ methodOverloading.addNumbers(0.2,2));
            System.out.println("method overloading three: "+ methodOverloading.addNumbers(0.5,0.5));
            System.out.println("method overloading four: "+ methodOverloading. addNumbers(2,0.5));
        }



    }




