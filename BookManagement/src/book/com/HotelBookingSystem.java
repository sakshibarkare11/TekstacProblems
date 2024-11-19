package book.com;

public class HotelBookingSystem {
		public boolean validateBookingDetails(String username, String couponCode, String roomType) throws InvalidBookingDetailsException 
		{
	       	   //fill the code here
			
//			if(!username.matches("[a-zA-Z]+[_]{1}[a-zA-Z0-9]{5-15}")){
//				throw new InvalidBookingDetailsException("Invalid username");
//			}
//			if(!couponCode.matches("code[0-9]{3}")) {
//				throw new InvalidBookingDetailsException("Invalid coupon code");
//			}
//			if(!roomType.equals("single")&&!roomType.equals("double")&&!roomType.equals("suit")) {
//				throw new InvalidBookingDetailsException("Invalid room type");
//			}
			
			
			if(!username.matches("[a-zA-Z]+[_]{1}[a-zA-Z0-9]{5,15}")) 
			{
				throw new InvalidBookingDetailsException("Invalid username");
			}
			if(!couponCode.matches("code[0-9]{3}"))
			{
				throw new InvalidBookingDetailsException("Invalid coupon code");
			}
			
			if(!roomType.equals("single") && !roomType.equals("double") && !roomType.equals("suit"))
			{
				throw new InvalidBookingDetailsException("Invalid room type");
			}
			

			return true;
	    	}

		public String getBookingStatus() 
	   	{
	       	     String str="Enjoy Your Stay";
		        //fill the code here
		        return str;
	  	}
	}

