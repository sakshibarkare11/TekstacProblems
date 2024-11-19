import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
    	GadgetValidatorUtil validator=new GadgetValidatorUtil();

        Scanner scanner = new Scanner(System.in);
        {
        // Fill the code here
		int num=scanner.nextInt();
        for(int i=0;i<num;i++) {
    		System.out.println("Enter gadget "+i+" details");
        }
		String gadgetDetails = scanner.nextLine();
		if(processGadgetEntry(gadgetDetails,validator))
		{
			System.out.println("Warranty accepted, stock updated");
		
		}

    }

}

	private static boolean processGadgetEntry(String gadgetDetails, GadgetValidatorUtil validator) {
		// TODO Auto-generated method stub
		return false;
}}

//private static boolean processGadgetEntry(String gadgetDetails, GadgetValidatorUtil validator) {
//	
//}