package bank.com;

import java.util.Scanner;

public class UserInterface {
	AccountManager acc=new AccountManager();
	
	Scanner scanner = new Scanner(System.in);
    {
    // Fill the code here
    	try {
		System.out.println("Enter Username ");
		String uname=scanner.nextLine();
		System.out.println("Enter Password ");
		String pass=scanner.nextLine();
		
		acc.validateCredentials(uname, pass);
		System.out.println("Login Successful");
		
		boolean exit=false;
		while(!exit) {
			System.out.println("Choose an option \\n 1.Deposit \\n 2.Withdraw \\n 3.CHeckBalance\\n  4.Exit");
			int option= scanner.nextInt();
			switch (option) {
			case 1: {
				
				System.out.println("Enter amount to deposit");
				double depositAmount = scanner.nextDouble();
				acc.deposit(uname, depositAmount);
				break;
			}
			case 2:{
				System.out.println("Enter amount to withdraw");
				double withdrawAmount = scanner.nextDouble();
				acc.deposit(uname, withdrawAmount);
				break;
			}
			case 3:{
				acc.checkBalance(uname);
				break;
			}
			case 4:{
				System.out.println("Logout successful");
				exit =true;
				break;
			}
			
			default:
				System.out.println("Invalid option... please try again.");
			}
		//exit
		
		}
    	}
    	//try
    	catch (InvalidCredentialException e) {
			// TODO: handle exception
    		System.out.println(e.getMessage());
		}
    	catch ( InvalidFundsException e){
			// TODO: handle exception
    		System.out.println(e.getMessage());
		}
//    	finally {
//			scanner.close();
//		}
    
    
//		System.out.println("Choose an Option \n 1.Deposit \n 2.Withdraw \n 3.CHeckBalance\n  4.Exit");
//		System.out.println("Enter Option ");
//		System.out.println("Enter Amount to withdraw ");
//		System.out.println("Enter Amount to deposit ");

	

}
}
