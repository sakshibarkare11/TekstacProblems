package book.com;

import java.util.Iterator;
import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       //Fill the code here
        Apartment apartment = new Apartment();

        System.out.print("Enter number of details to be added: ");
        int num = Integer.parseInt(sc.nextLine()); 
        System.out.print("Enter the details (Apartment number: Rent)");
        for (int i = 0; i < num; i++) {
        	String [] details = sc.nextLine().split(":");
            String Anum = details[0];
            double rent = Double.parseDouble(details[1]);
           
//            apartment.addApartmentDetails(apartmentNumber, rent);
		}
        System.out.print("Enter the range to filter the details ");
        double maxrent= Double.parseDouble(sc.nextLine());
        double minrent= Double.parseDouble(sc.nextLine());
        
    }
}    