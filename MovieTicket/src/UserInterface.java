import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        Ticket ticket=new Ticket();
        
        System.out.println("Enter movie name ");
        String movieName=sc.nextLine();
        System.out.println("Enter no of bookings");
        int numberOfBooking=sc.nextInt();
        sc.nextLine();
        
         System.out.println("Enter the available tickets");
            int availableTickets=sc.nextInt();
           ticket.setAvailableTickets(availableTickets);
        while(true)
        {
            
            System.out.println("Enter the ticketid");
            ticket.setTicketId(sc.nextInt());
            System.out.println("Enter the price");
            ticket.setPrice(sc.nextInt());
            System.out.println("Enter the no of tickets");
            int noOfTickets=sc.nextInt();
            System.out.println("Available tickets: "+ticket.getAvailableTickets());
            
            int totalAmount=ticket.calculateTicketCost(noOfTickets);
            if(ticket.getAvailableTickets()==0)
            {
            
                System.out.println("Total amount:"+totalAmount);
                System.out.println("House full");
                break;
            }
            else if(totalAmount==-1)
            {
               System.out.println("Tickets are not available");
            }
            else{
                System.out.println("Total amount:"+totalAmount);
                System.out.println("Available ticket after booking:"+ticket.getAvailableTickets());
            }
        }
    }  
}

