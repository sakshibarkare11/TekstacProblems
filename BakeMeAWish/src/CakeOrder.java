import java.util.Map;
import java.util.HashMap;

public class CakeOrder {

	private Map<String,Double> orderMap=new HashMap<String,Double>();

	public Map<String, Double> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<String, Double> orderMap) {
		this.orderMap = orderMap;
	}
    
    public void addOrderDetails(String orderId, double cakeCost) {
		//Fill the code here
		orderMap.put(orderId,cakeCost);
	}
	
	public Map<String, Double> findOrdersAboveSpecifiedCost(double cakeCost) {
		//Fill the code here
	 Map<String, Double>cost=new HashMap<>();
		
		for(Map.Entry<String, Double> a : orderMap.entrySet())
		{
		   if (a.getValue() > cakeCost) {
               cost.put(a.getKey(),a.getValue());
            }
        }
		
//        Map <String, Double> newmap = new HashMap<>();
//        for(Map.Entry<String, Double> abc : orderMap.entrySet()) {
//        	if(abc.getValue() > cakeCost)
//        }
        
        

        return cost;
        
        
        
        
        
	}
}
