import java.util.Scanner;
public class UserInterface
{

	public String getDuplicateElement(){
	 Scanner sc=new Scanner(System.in);
   try 
   {
       
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        if(size<=0)
        {
            return "Array size should be positive";
        }
      
        int [] a=new int [size];
         System.out.println("Enter the array elements");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the position of the element to be replicated");
        int position=sc.nextInt();
        if(position<0 || position>=size)
        {
        return "Array index is out of range";    
        }
        int duplicateElement=a[position];
        StringBuilder result=new StringBuilder("The array elements are ");
         for(int num:a)
         {
             result.append(num).append(" ");
         }
         result.append(duplicateElement);
         return result.toString();
    }
    catch( Exception e)
    {
       return "Input was not in the correct format"; 
    }
      finally{
          sc.close();
      }
    }
	
	public static void main(String[] args)
    {
        UserInterface ui=new UserInterface();
        System.out.println(ui.getDuplicateElement());
    }
}