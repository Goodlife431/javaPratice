package PhoneLog;

import java.util.LinkedList;
import java.util.Scanner;

public class PhoneLogCRUDMethods {
    LinkedList<Record> list;
    public PhoneLogCRUDMethods(){
        list = new LinkedList<>();
    }
    public void add(Record record) {
        try {
            if (!find(record.getIdNumber())) {
                list.add(record);
            } else {
                System.out.println("Record already exists in the Record list");
            }
        }catch (IllegalArgumentException exception){
            System.out.println("catch exception");
        }
    }
    public boolean find(int idNumbers) {
        try {
            for (Record l : list) {
                if (l.getIdNumber() == idNumbers) {
                    System.out.println(l);
                    return true;
                }

            }
        }catch (IllegalArgumentException exception){
            System.out.println("catch exception");
        }
            return false;
    }
    public void delete(int recordIdNumber){
        Record recordDelete = null;
        try {
            for (Record ll : list) {
                if (ll.getIdNumber() == recordIdNumber) {
                    recordDelete = ll;
                }
            }
            if (recordDelete == null) {
                System.out.println("Invalid record");
            } else {
                list.remove(recordDelete);
                System.out.println("Successfully removed record from the list");
            }
        }catch (IllegalArgumentException exception){
            System.out.println("catch exception");
        }
    }
    public Record findRecord(int idNumber){
        try {

            for (Record l : list) {
                if (l.getIdNumber() == idNumber) {
                    return l;
                }
            }
        }catch (IllegalArgumentException exception){
            System.out.println("catch exception");
        }
        return null;
    }
    public void update(int id, Scanner input){
        try {

            if (find(id)) {
                Record rec = findRecord(id);
                System.out.print("What is the id Number of the phone");
                int idNumber = input.nextInt();
                System.out.print("What is the new contact number");
                String contactNumber = input.nextLine();
                input.nextLine();
                System.out.print("What is the contact name");
                String name = input.nextLine();

                rec.setIdNumber(idNumber);
                rec.setName(name);
                rec.setContactNumber(Integer.parseInt(contactNumber));
                System.out.println("Record Updated Successfully");
            } else {
                System.out.println("record not found in contact list");
            }
        }catch (IllegalArgumentException exception){
            System.out.println("catch exception");
        }
    }
    public void display(){
        try {
            if (list.isEmpty()) {
                System.out.println("The list has no records\n");
            }
        }catch (IllegalArgumentException exception){
            System.out.println("catch exception");
        }
        try {

            for (Record record : list) {
                System.out.println(record.toString());
            }
        }catch (IllegalArgumentException exception){
            System.out.println("catch exception");
        }
    }
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1: Add contact");
        System.out.println("2: Delete contact");
        System.out.println("3: Update contact");
        System.out.println("4: Search Friend");
        System.out.println("5: Display Friends");
        System.out.println("9: Exit program");
    }
}
