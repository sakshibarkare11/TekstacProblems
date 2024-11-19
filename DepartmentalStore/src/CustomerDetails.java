
public class CustomerDetails
{
    private String customerName;	
    private String phoneNumber;
    private String streetName;
    private double billAmount;
    private int distance;

public CustomerDetails(String customerName,String phoneNumber,String streetName,double billAmount,int distance)
{
    this.customerName=customerName;
    this.phoneNumber=phoneNumber;
    this.streetName=streetName;
    this.billAmount=billAmount;
    this.distance=distance;
}
    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
     public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
      public String getStreetName()
    {
        return streetName;
    }
    public void setStreetName(String streetName)
    {
       this.streetName=streetName;
    }
     public double getBillAmount()
    {
        return billAmount;
    }
    public void setBillAmount(double billAmount)
    {
       this.billAmount=billAmount;
    }
     public int getDistance()
    {
        return distance;
    }
    public void setDistance(int distance)
    {
        this.distance=distance;
    }
	public double calculateBonusPoints() 
	{
	    if(billAmount>=250)
	    {
	        return billAmount/10.0;
	    }
	    else
	    {
		return 0.0;
	    }
	}

	public double deliveryCharge() 
	{
	    if(distance>=25)
	    {
	        return distance*8.0;
	    }
	    else if(distance>=15 )
	    {
	        return distance*5.0;
	    }
	    else
	    {
	        return distance*2.0;
	    }
		
	}
	
}
