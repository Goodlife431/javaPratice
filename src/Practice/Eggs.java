package Practice;

import java.util.Scanner;

/* Eggs per Box) Typically 6 eggs fit in one box. Write a script to calculate the number of boxes a farmer
needs to store 28 eggs. The script will also determine how many eggsare placed in the last uncompleted box,
and how many additional eggs are needed to fill this last box.*/
public class Eggs {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("enter numbers of egg: ");
                int eggs = input.nextInt();

               int box = eggs / 6;
               int reminderOfEggs = eggs % 6;
               int newBox = 6 - reminderOfEggs;

                System.out.println("boxes needed: "+ box);
                System.out.println("reminder of the eggs: "+reminderOfEggs);
                System.out.println("reminder of the eggs needed to fill the box: "+newBox);
        }
}
