package chapter6;

import java.util.Scanner;

public class Nokia {
    private static final Scanner input = new Scanner(System.in);
    private static String name;

    public static void setName(String name) {
        Nokia.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void mainMenu() {
        System.out.printf("%nWelcome %s!%n", getName());
        System.out.println("1. Phone book");
        System.out.println("2. Message");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games ");
        System.out.println("9. Calculator");
        System.out.println("10. Reminder");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. Sim services");
        System.out.println("Enter 0 to end process");

        System.out.printf("%nPick an option");

    }

    public static void exit() {
        System.out.printf("Thanks for trying our app. %nWe hope to see you again");
        System.out.println();
    }

    public static void menu_phonebook() {
        System.out.println("Welcome to phonebook");
        System.out.println("1. Search\n2. Services Nos.\n3.Add name\n4. Erase\n5. Edit\n6. Assign tone \n7. Send card\n8. Options\n9. Speed dials\n10. Voice tags\n Enter 99 to return to main menu.");
        System.out.println("Pick an option: ");
        int option = input.nextInt();
        if ((option >= 1 && option <= 10) || (option == 99)) {
            switch (option) {
                case 99 -> mainMenu();
                case 1 -> {
                    System.out.println("Welcome to search screen!");
                    System.out.println("Nothing to search for. \nReturning to previous page");
                    System.out.println();
                    menu_phonebook();
                }
                case 2 -> {
                    System.out.println("Welcome Service Nos screen!  ");
                    System.out.println("Nothing here \n Returning to previous page.");
                    System.out.println();
                    menu_phonebook();
                }
                case 3 -> {
                    System.out.println("Welcome to the Add name screen!");
                    System.out.println("No directory for name storing. \n Returning to previous page");
                    System.out.println();
                    menu_phonebook();
                }
                case 4 -> {
                    System.out.println("Welcome to erase screen");
                    System.out.println("Nothing to erase. \n Returning to previous page");
                    System.out.println();
                    menu_phonebook();
                }
                case 5 -> {
                    System.out.println("Welcome to the edit screen!");
                    System.out.println("Nothing to edit .\nReturning to previous page");
                    System.out.println();
                    menu_phonebook();
                }
                case 6 -> {
                    System.out.println("Welcome to Assign tone screen!");
                    System.out.println("No downloaded tones .\n Returning to previous page");
                    System.out.println();
                    menu_phonebook();
                }
                case 7 -> {
                    System.out.println("Welcome to the send card screen!");
                    System.out.println("No cards to send .\n Returning to previous page");
                    System.out.println();
                    menu_phonebook();
                }
                case 8 -> subMenu1_8();

                case 9 -> {
                    System.out.println("Welcome to speed dials screen");
                    System.out.println("Your speed dials are: \n1. Bill +23408123940220\n2. Liz +23456789012");
                    System.out.println("Returning to previous page");
                    System.out.println();
                    menu_phonebook();
                }
                case 10 -> {
                    System.out.println("Welcome to Voice tags screen!");
                    System.out.println("No new voice tags. \n returning to previous page");
                    menu_phonebook();
                }
            }
        }
    }

    private static void subMenu1_8() {
        System.out.println("Welcome to options");
        System.out.println("Type of view. \n Memory status");
        System.out.println("Pick an option");
        int option = input.nextInt();
        if ((option >= 1 && option <= 2) || (option == 99)) {
            switch (option) {
                case 99:
                    mainMenu();
                case 1: {
                    System.out.println("Welcome to option menu");
                    System.out.println("Display\n" +
                            "5.99” edge-to-edge pOLED QHD display with 2K resolution with PureDisplay technology \n Returning to previous page");
                    menu_phonebook();
                }
            }
        }
    }

    public static void menu_messages() {
        System.out.println("Welcome to messages");
        System.out.println("1. Write message\n2. Inbox\n3. Outbox\n4. Picture message\n5. Templates\n6. Smiley\n7. Message settings\n8. Info service\n.9 Voice mailbox number\n10. Service command editor\n Enter 99 to return to main menu.");
        System.out.println("Pick an option");
        int option = input.nextInt();
        if ((option >= 1 && option <= 10) || (option == 99)) {
            switch (option) {
                case 99:
                    mainMenu();
                case 1: {
                    System.out.println("Welcome to Write message");
                    System.out.println("No new message \n Returning to previous page");
                    System.out.println();
                    menu_messages();
                }
                case 2: {
                    System.out.println("welcome to Inbox");
                    System.out.println("No new inbox\n Returning to previous page");
                    System.out.println();
                    menu_messages();
                }
                case 4: {
                    System.out.println("welcome to Picture message");
                    System.out.println("No new Picture message\n Returning to previous page");
                    System.out.println();
                    menu_messages();
                }
                case 3: {
                    System.out.println("Welcome to Outbox");
                    System.out.println("No new Outbox\n Returning to previous page");
                    System.out.println();
                    menu_messages();
                }
                case 5: {
                    System.out.println("Welcome to Templates ");
                    System.out.println("No new Templates\n Returning to previous page");
                    System.out.println();
                    menu_messages();
                }
                case 6: {
                    System.out.println("Welcome to smiley");
                    System.out.println("What type of smiley do you want to use\n pick an emoji");
                    System.out.println("returning to previous page");
                    System.out.println();
                    menu_messages();
                }
                case 7:
                    subMenu_messages7();
                case 8: {
                    System.out.println("Welcome to Info service");
                    System.out.println("There is no information available\n Returning to previous page");
                    System.out.println();
                    menu_messages();
                }
                case 9: {
                    System.out.println("Welcome to Voice mailbox number");
                    System.out.println("There is no voice note available at the moment\n Returning to previous page");
                    System.out.println();
                    menu_messages();
                }
                case 10: {
                    System.out.println("Welcome to service command editor");
                    System.out.println("This service is currently unavailable at the moment\n Returning to previous page");
                    System.out.println();
                    menu_messages();
                }
            }

        }
    }

    private static void subMenu_messages7() {
        System.out.println("Welcome to Message settings");
        System.out.println("Set1\n1. Message centre number\n2. Message sent as\n3. Message validity");
        System.out.println("Common\n1. Delivery reports\n2. Reply via same centre\n3. Character support");
        System.out.println();
        menu_messages();
    }

    public static void menu_chat() {
        System.out.println("Welcome to chat");
        System.out.println("Nothing is available in chats");
        System.out.println("returning to previous page");
        System.out.println();
        menu_chat();
    }

    public static void menu_callRegister() {
        System.out.println("Welcome to Call register");
        System.out.println("1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credits");
        System.out.println("Pict an option");
        int option = input.nextInt();
        if ((option >= 1 && option <= 8) || (option == 99)) {
            switch (option) {
                case 99:
                    mainMenu();
                case 1: {
                    System.out.println("Welcome to Missed calls");
                    System.out.println("you currently have no missed calls\n returning to previous page");
                    System.out.println();
                    menu_callRegister();
                }
                case 2: {
                    System.out.println("Welcome to Received calls");
                    System.out.println("You have four received calls\n 1. Emmanuel\n2. Daniel\n3. Grace\n4. Joy");
                    System.out.println("Returning to previous page");
                    System.out.println();
                    menu_callRegister();
                }
                case 3: {
                    System.out.println("Welcome to Dialled numbers");
                    System.out.println("You have Four Dialled numbers\n Returning to previous page");
                    System.out.println();
                    menu_callRegister();
                }
                case 4: {
                    System.out.println("Welcome to Erase recent call lists");
                    System.out.println("You have two recent calls\n1. Samuel\n2. Ade");
                    System.out.println("Returning to previous page");
                    System.out.println();
                    menu_callRegister();
                }
                case 5:
                    subMenu_showCallDuration();
                case 6:
                    subMenu_showCallCosts();
                case 7:
                    subMenu_callCostsSettings();
                case 8: {
                    System.out.println("Welcome to Prepaid credits");
                    System.out.println("There is no information currently\n Returning to previous page");
                    System.out.println();
                    menu_callRegister();
                }
            }
        }
    }

    public static void subMenu_callCostsSettings() {
        System.out.println("Welcome to Call cost settings");
        System.out.println("1. Call cost limit\n2. Show costs in");
        System.out.println();
        menu_callRegister();
    }

    public static void subMenu_showCallCosts() {
        System.out.println("welcome to show all costs");
        System.out.println("1. Last call cost\n2. All call cost\n3. Clear counters");
        System.out.println();
        menu_callRegister();
    }

    public static void subMenu_showCallDuration() {
        System.out.println("Welcome to call duration");
        System.out.println("1. Last call duration\n2. All calls' duration\n3. Received call duration\n4. Dialled calls' duration\n5. Clear timers");
        System.out.println();
        menu_callRegister();
    }

    public static void menu_tones() {
        System.out.println("Welcome to Tones");
        System.out.println("1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver");
        System.out.println("pick an option");
        int option = input.nextInt();
        if ((option >= 1 && option <= 9) || (option == 99)) {
            switch (option) {
                case 99:
                    mainMenu();
                case 1:
                    subMenu_ringingTone();
            }
        }
    }

    private static void subMenu_ringingTone() {
        System.out.println("Welcome to Ringing tone");
        System.out.println("Select a ringing tone you want to use");
        System.out.println("1. Disco Balls\n2. New Nokia call\n3. Old Phone Ringtone\n4. Mars Ringtone\n5. Up Ringtone\n6. High Horn Ringtone\n7. Pond Ringtone");
        System.out.println("Enter 99 to back to the previous page");
        System.out.println("Pick an option");
        int option = input.nextInt();
        if ((option >= 1 && option <= 7) || (option == 99)) {
            switch (option) {
                case 99:
                    mainMenu();
                case 1: {
                    System.out.println("You have selected disco balls\n Enter 99 to back to previous page");
                    System.out.println();
                    menu_tones();
                }
                case 2: {
                    System.out.println("You have selected new Nokia call\n Enter 99 to back to previous page");
                    System.out.println();
                    menu_tones();
                }
                case 3: {
                    System.out.println("You have selected old phone ringtone\n Enter 99 to back to previous page");
                    System.out.println();
                    menu_tones();
                }
                case 4: {
                    System.out.println("You have selected Mars ringtone\n Enter 99 to back to previous page");
                    System.out.println();
                    menu_tones();
                }
                case 5: {
                    System.out.println("You have selected Up ringtone\n Enter 99 to back to previous page");
                    System.out.println();
                    menu_tones();
                }
                case 6: {
                    System.out.println("You have selected High horn Ringtone\n Enter 99 to back to previous page");
                    System.out.println();
                    menu_tones();
                }
                case 7: {
                    System.out.println("You have selected Pond Ringtone\n Enter 99 to back to previous page");
                    System.out.println();
                    menu_tones();
                }
            }
        }
    }

    public static void menu_settings() {
        System.out.println("Welcome to settings menu");
        System.out.println("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
        System.out.println("Pick an option");
        System.out.println("Enter 99 to return to main menu");
        int option = input.nextInt();
        if ((option >= 1 && option <= 4) || (option == 99)) {
            switch (option) {
                case 99: mainMenu();
                case 1: subMenu_callSettings();

            }
        }
    }

    private static void subMenu_callSettings() {
        System.out.println("Welcome to Call settings");
        System.out.println("1. Automatic redial\n2. Speed dialling\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer");
        System.out.println("Pick an option");
        System.out.println("Enter 99 to go back to main menu");
        int option = input.nextInt();
        if ((option >=1 && option <= 6) || (option == 99)){
            switch (option){
                case 99: mainMenu();
                case 1: {
                    System.out.println("You choose automatic redial");
                    System.out.println("There is no information available currently\n Returning to previous page");
                    System.out.println();
                    menu_settings();
                }
                case 2: {
                    System.out.println("You choose Speed dialling");
                    System.out.println("There is no information available currently\n Returning to previous page");
                    System.out.println();
                    menu_settings();
                }
                case 3: {
                    System.out.println("You choose Call waiting options");
                    System.out.println("There is no information available currently\n Returning to previous page");
                    System.out.println();
                    menu_settings();
                }
                case 4: {
                    System.out.println("You choose Own number sending");
                    System.out.println("There is no information available currently\n Returning to previous page");
                    System.out.println();
                    menu_settings();
                }
                case 5: {
                    System.out.println("You choose Phone line in use");
                    System.out.println("There is no information available currently\n Returning to previous page");
                    System.out.println();
                    menu_settings();
                }
                case 6: {
                    System.out.println("You choose Automatic answer");
                    System.out.println("There is no information available currently\n Returning to previous page");
                    System.out.println();
                    menu_settings();
                }
            }
        }
    }
    public static void subMenu_phoneSettings(){
        System.out.println("Welcome to Phone Settings");
        System.out.println("1. Language\n2. cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service action");
        System.out.println("Pick an option");
        System.out.println("Enter 99 to go back to previous page");
        int option = input.nextInt();
        if ((option >= 1 && option <= 6) || (option == 99)){
            switch (option){
                case 99: mainMenu();
                case 1: {
                    System.out.println("Welcome to language settings");
                    System.out.println("1. hausa\n2. Yoruba");
                }
            }
        }
    }
}




