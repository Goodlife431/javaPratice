package chapter6;

public class Iphone {

       private  String colour;
        private static double price;

        public void setColour (String colour) {
            this.colour = colour;
        }

            public String getColour () {
                return colour;
            }

            public static void setPrice (double price) {
                Iphone.price = price;
            }

            public static double getPrice () {
                return price;
                }



        }


