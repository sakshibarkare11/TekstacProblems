public class Ticket
{
   
        private int ticketid;
        private int price;
        private static int availableTickets;
      
  
        public int getTicketId()
        {
            return ticketid;
        }
        public void setTicketId(int ticketid)
        {
            this.ticketid=ticketid;
        }
         public int getPrice()
        {
            return price;
        }
        public void setPrice(int price)
        {
            this.price=price;
        }
        public static int getAvailableTickets()
        {
            return availableTickets;
        }
        public static void setAvailableTickets(int availableTickets)
        {
            Ticket.availableTickets=availableTickets;
        }
        public int calculateTicketCost(int noOfTickets)
        {
            if(availableTickets>=noOfTickets)
            {
                int totalAmount = noOfTickets*price;
                 availableTickets -= noOfTickets;
                 return totalAmount;
            }
            else
            {
                return -1;
            }
        }

}   





        
    
    
