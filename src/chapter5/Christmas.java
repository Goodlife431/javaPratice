package chapter5;
/*(“The Twelve Days of Christmas” Song) Write an application that uses iteration and switch
statements to print the song “The Twelve Days of Christmas.” One switch statement should be
used to print the day (“first,” “second,” and so on). A separate switch statement should be used to
print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.*/

public class Christmas {
    public static void main(String [] args){

        for(int i=1; i<=12;i++){

            System.out.print("On the ");

            switch (i) {
                case 1 -> System.out.print("First");
                case 2 -> System.out.print("Second");
                case 3 -> System.out.print("Third");
                case 4 -> System.out.print("Fourth");
                case 5 -> System.out.print("Fifth");
                case 6 -> System.out.print("Sixth");
                case 7 -> System.out.print("Seventh");
                case 8 -> System.out.print("Eighth");
                case 9 -> System.out.print("Ninth");
                case 10 -> System.out.print("Tenth");
                case 11 -> System.out.print("Eleventh");
                case 12 -> System.out.print("twelfth");
            }


            System.out.print(" Day my true love gave to me ");

            for (int s=0; s<=12; s++){

                switch (s) {
                    case 1 -> System.out.println(" A partridge in a pear tree ");
                    case 2 -> System.out.println(" Turtle Doves ");
                    case 3 -> System.out.println(" French Hens ");
                    case 4 -> System.out.println(" Calling Birds ");
                    case 5 -> System.out.println(" Golden Rings ");
                    case 6 -> System.out.println(" Geese a laying ");
                    case 7 -> System.out.println(" Swans a swimming ");
                    case 8 -> System.out.println(" Maids a milking ");
                    case 9 -> System.out.println(" Ladies Dancing ");
                    case 10 -> System.out.println(" Lords a leaping ");
                    case 11 -> System.out.println(" Pipers piping ");
                    case 12 -> System.out.println(" Drummers Drumming ");
                }
            }
        }
    }
}


