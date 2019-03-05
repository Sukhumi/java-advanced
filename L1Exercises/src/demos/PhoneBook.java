package demos;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John", "03562435324");
        phoneBook.put("Jane", "02345354353");
        phoneBook.put("Joe", "2345242344353");

        System.out.println(phoneBook);

        for( String key : phoneBook.keySet() ){
            System.out.printf("%s's phone is %s\n", key, phoneBook.get(key));
        }

        Scanner in = new Scanner(System.in);
        for(;;){
            System.out.print("Enter name: ");
            String name = in.nextLine();
            String phone = phoneBook.get(name);
            if( phone == null){
                System.out.println("Not available");
            }
            else{
                System.out.printf("%s's phone is %s\n", name, phone);
            }
        }
    }
}