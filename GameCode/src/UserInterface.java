import java.util.Scanner;
public class UserInterface 
{
	  public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
			System.out.println("Enter your profile code");
			String code = sc.nextLine();
			
			if(code.charAt(0)!='#'){
			    System.out.println(code + " does not start with a valid special character");
			}
			else if(code.length()!=8){
			    System.out.println(code+" does not have the specified length");
			}
			
			else if(!code.substring(1, 5).matches("[A-Z]+")){
			    int count=0;
			    for(int i=0; i<8; i++){
			        char c=code.charAt(i);
			        String s=Character.toString(c);
			        if(s.matches("[A-Z]"))
			        {
			            count++;
			        }
			    }
			    System.out.println(count + " is an invalid number for uppercase character");
			}
			    else if(!code.substring(5,8).matches("[0-9]{3}"))
			    {
			        int count =0;
			        for(int i=0;i<8; i++)
			        {
			            char c = code.charAt(i);
			            String s = Character.toString(c);
			            if(s.matches("[0-9]"))
			            {
			                count++;
			                
			            }
			          }
			          System.out.println(count + " is an invalid number for digits");
		        }
		        else{
		            System.out.println(code+" is a valid profile code whose last 3 digits are "+code.substring(5, 8));
		            
		        }
			    
			}
}