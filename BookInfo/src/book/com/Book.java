package book.com;

import java.util.Scanner;
	
public class Book{
	public static void main(String[] args) {
//		int price;
//		String Author;
//		String Title;
//		 TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter author name--->");
		String Author = sc.nextLine();
		System.out.println("Enter book title name--->");
		String Title = sc.nextLine();
		System.out.println("Enter price of book--->");
		
		int price= sc.nextInt();
		
		System.out.println(Author+" "+ Title +" "+ price);
	}
}	

