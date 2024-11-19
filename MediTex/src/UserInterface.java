import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Fill the code here
        TabletUtil tabletUtil = new TabletUtil();

        // Getting the number of tablets
        System.out.print("Enter the number of tablets: ");
        int numberOfTablets = Integer.parseInt(scanner.nextLine());
        List<Tablet> tabletList = new ArrayList<>();

        // Getting tablet details
        System.out.println("Enter the tablet details:");
        for (int i = 0; i < numberOfTablets; i++) {
            String[] details = scanner.nextLine().split(":");
            String name = details[0].trim();
            String brand = details[1].trim();
            LocalDate expiryDate = LocalDate.parse(details[2].trim());
            int mg = Integer.parseInt(details[3].trim());
            double pricePerTablet = Double.parseDouble(details[4].trim());
            tabletList.add(new Tablet(name, brand, expiryDate, mg, pricePerTablet));
        }

        // Getting brand name
        System.out.print("Enter the brand name: ");
        String brandName = scanner.nextLine();
        Stream<Tablet> tabletStream = tabletList.stream();

    }
}
