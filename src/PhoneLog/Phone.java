package PhoneLog;

import java.util.Scanner;

import static java.lang.Long.parseLong;

public class Phone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneLogCRUDMethods pLCM = new PhoneLogCRUDMethods();
        Record record = new Record();
        try {
            record.setIdNumber(8734);
            record.setContactNumber(Integer.parseInt("67456899999"));
            record.setName("Seun");

            pLCM.add(record);
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid input");
        }
        int option = 0;
            do {
                PhoneLogCRUDMethods.menu();
                option = scanner.nextInt();
                try {
                if (option == 1) {
                    System.out.println("What is persons Name: ");
                    String name = scanner.next();
                    System.out.println("What is the person Id Number: ");
                    int idNumber = scanner.nextInt();
                    System.out.println("What is the person contact Number: ");
                    String contactNumber = scanner.next();

                    record = new Record(name, idNumber, Integer.parseInt(contactNumber));
                    pLCM.add(record);
                    System.out.println(record.toString());
                } else if (option == 2) {
                    System.out.println("What is person id number? ");
                    int idDelete = scanner.nextInt();
                    pLCM.delete(idDelete);
                } else if (option == 3) {
                    System.out.println("What is the person id number");
                    int idNo = scanner.nextInt();
                    pLCM.update(idNo, scanner);
                } else if (option == 4) {
                    System.out.println("What is the person id ");
                    int bookId = scanner.nextInt();
                    if (!pLCM.find(bookId)) {
                        System.out.println("person is does not exist\n");
                    }
                } else if (option == 5) {
                    pLCM.display();
                } else {
                    System.out.println("\nInvalid input\n");
                }
            }catch (IllegalArgumentException exception){
                    System.out.println("Invalid input, Try again");
                }
        }
            while (option != 9);
    }
}
