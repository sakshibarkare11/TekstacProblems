import java.util.Scanner;
 
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Input student details
        System.out.println("Enter Student Id");
        int studentId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
 
        System.out.println("Enter Student name");
        String studentName = scanner.nextLine();
 
        System.out.println("Enter Department name");
        String department = scanner.nextLine();
 
        System.out.println("Enter gender");
        String gender = scanner.nextLine();
 
        System.out.println("Enter category");
        String category = scanner.nextLine();
 
        System.out.println("Enter College fee");
        double collegeFee = scanner.nextDouble();
 
        Student student = null;
 
        if (category.equals("Hosteller")) {
            System.out.println("Enter the room number");
            int roomNumber = scanner.nextInt();
 
            System.out.println("Enter the Block name");
            char blockName = scanner.next().charAt(0);
 
            System.out.println("Enter the room type");
            String roomType = scanner.next();
 
            student = new Hosteller(studentId, studentName, department, gender, category, collegeFee, roomNumber, blockName, roomType);
        } else if (category.equals("DayScholar")) {
            System.out.println("Enter Bus number");
            int busNumber = scanner.nextInt();
 
            System.out.println("Enter the distance");
            float distance = scanner.nextFloat();
 
            student = new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distance);
        }
 
        if (student != null) {
            double totalFee = student.calculateTotalFee();
            System.out.printf("Total College fee is %.1f\n", totalFee);
        }
 
        scanner.close();
    }
}
