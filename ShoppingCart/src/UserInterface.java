import java.util.*;
 
public class UserInterface {
 
	private static int choice;
 
	public static void main(String[] args) {
	    
	    Products obj=new Products();
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("1.Add");
		
		System.out.println("2.Display");
	
		System.out.println("3.Exit");
		
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		sc.nextLine();	
		
		
		switch(choice){
		case 1:  
		    System.out.println("Enter the product");
		    	String prod=sc.nextLine();
		    obj.addProductToList(prod);
		    
		    break;
		    
		 case 2:
		     
		     
		     if(obj.getProductList().isEmpty()){
		         System.out.println("The list is empty");
		     }else{
		         obj.sortProductList();
		         
		         for(String items : obj.getProductList()) {
		        	 System.out.println(items);
		         }
		         break;
		         
		     }
		     
		 case 3:
		     System.out.println("Thank you for using the application");
		        break;
		 default :
		 System.out.println("Invalid Choose:");
		     
		 }
		
		}while(choice !=3);
			
		
		
		     //System.out.println();
		     //sc.close();
		     
		
		
		// code here
		 sc.close();
		
	
}
}