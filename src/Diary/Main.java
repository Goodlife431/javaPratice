package Diary;
import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static  Diary diary;
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String mainMenu = """
                Welcome to my Diary!!!
                Let's setup it up
                """;
        print(mainMenu);
        String userName = input("Enter your userName");
        String password = input("Enter your password");
        diary = new Diary(userName,password);
        print("Diary created for " + userName);
        displayLockScreenMenu();

    }

    private static void displayLockScreenMenu() {
        String mainMenu = """
                Press
                 1--> Unlock Diary
                 2--> Lock Diary
                 3-->Exit
                """;
        int userInput = Integer.parseInt(input(mainMenu));
        switch (userInput) {
            case 1 -> unlockDiary();
            case 2 -> lockDiary();
            case 3 -> exitApplication();
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDiary() {
        diary.lock();
        print("Diary is locked");
        displayDiaryMenu();
    }

    private static void unlockDiary() {
        String password = input("Enter your password");
        diary.unlockWith(password);
        if (diary.isLocked()){
            print("Wrong password");
            displayLockScreenMenu();
        }
        displayDiaryMenu();

    }

    private static void displayDiaryMenu() {
        String diaryMenu= """
                press 1 --> create Entry
                press 2 --> Find Entry by Id
                press 3 --> Get total number of Id
                press 4 --> Lock diary
               
                """;
        int userInput = Integer.parseInt(input(diaryMenu));
        switch (userInput) {
            case 1 -> createEntry();
            case 2 -> FindById();
            case 3 -> getTotalNumberOfId();
            case 4 -> LockDiary();
        }
    }

    private static void LockDiary() {

    }

    private static void getTotalNumberOfId() {
        int totalNumberOfEntries = diary.getNumberOfHappenings();
        print("You have " + totalNumberOfEntries + "+ Entries");
        displayDiaryMenu();
    }

    private static void FindById() {
        String id = input("Enter The Id for the entry you want to find");
        Workings foundHappenings = diary.findEntryWithId(Integer.parseInt(id));
        print(foundHappenings.toString());
        displayDiaryMenu();
    }

    private static void createEntry() {
        String title = input("Enter title for the entry");
        String body = input("Enter body for the entry");
        diary.write(title,body);
        print("Written Successfully");
        displayDiaryMenu();

    }


    private static void print(String prompt){
        //System.out.println(prompt);
        JOptionPane.showMessageDialog(null,prompt);

    }
    private static String input(String prompt){
//        print(prompt);
//        return in.nextLine();
        return JOptionPane.showInputDialog(null,prompt);

    }


}
