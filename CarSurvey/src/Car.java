import java.util.*;

public class Car {

	Map<String,Integer> carMap=new TreeMap<String,Integer>();

	// Include getter and setter
	public 	Map<String,Integer>getCarMap()
	{
	    return carMap;
	}
	public void setCarMap(Map<String,Integer>carMap)
	{
	    this.carMap=carMap;
	}
    
	public void addCar(String name,int num)
	{
		
//		carMap.put(name, num);
		boolean toTake=true;
		for(Map.Entry<String,Integer>m:carMap.entrySet())
		{
		    if(name.equalsIgnoreCase(m.getKey()))
		    {
		        toTake=false;
		    }
		}
		if(toTake) carMap.put(name,num);
	}
	
	public int carByName(String name)
	{
		for(Map.Entry<String, Integer> m: carMap.entrySet()) {
			if(name.equalsIgnoreCase(m.getKey())) {
				return m.getValue();
			}
		}
		//above is done by me
		
//		for(Map.Entry<String,Integer>map:carMap.entrySet())
//		{
//		    if(name.equalsIgnoreCase(map.getKey()))
//		    {
//		       return map.getValue();
//		    }
//		}
		
		return -1;
	}
	
	public List<String> carByCount(int count)
	{
		List<String> res = new ArrayList<>();
		for(Map.Entry<String, Integer> n : carMap.entrySet()) {
			if(n.getValue() >= count) {
				res.add(n.getKey());
			}
		}
		if(res.isEmpty()) {
			return null;
		}
		return res;
		
		//DONE BY ME (ABOVE)
		
		
//	    List<String>result=new ArrayList<>();
//	    
//	    for(Map.Entry<String,Integer>entry:carMap.entrySet())
//		{
//		    if(entry.getValue()>=count)
//		    {
//		        result.add(entry.getKey());
//		    }
//		}
//		if(result.isEmpty())
//		{
//		    return null;
//		}
//		return result;
		
		
		
		
	}
	
	
	public int totalCarsSold()
	{
		
		
		int total=0;
		 for(Map.Entry<String,Integer>m:carMap.entrySet())
		{
		    total += m.getValue();
		}
		return total;
	}
	
}
