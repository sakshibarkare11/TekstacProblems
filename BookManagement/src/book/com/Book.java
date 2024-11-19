package book.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Book {
	public static void main(String[] args) {
	String n= "ehg_jkjkgghghnghgfhfhjfktdrtfcs675";
	
	if(n.matches("[a-zA-Z]+[_]{1}[a-zA-Z0-9]{5,15}" )) {
		System.out.println("true");
	}else {
		System.out.println("no matches");
	}
	
	System.out.println("hello");
	
//	public class AthleteDetails {
//	    private Map<Double,String> athleteMap=new HashMap<Double, String>();
//		
//		public Map<Double,String> getAthleteMap() {
//			return athleteMap;
//		}
//
//		public void setAthleteMap(Map<Double,String> athleteMap) {
//			this.athleteMap = athleteMap;
//		}
//		
//		public void addAthleteDetails(double timeTaken, String athleteName) {				
//		    //Fill the code
//			athleteMap.put(timeTaken, athleteName);
//		}
//
//		public double findTimeTaken(String athleteName) {
//			//Fill the code	
//			for(Map.Entry<Double,String> n : athleteMap.entrySet() ) {
//				if(n.getValue().equals(athleteName)) {
//					return n.getKey();
//				}
//			}
//			return -1;
//			
//			
//			
//			
//			
//			
//			
//			for (Entry<Double, String> a: athleteMap.entrySet()) {
//				
//				if(a.getValue().equals(athleteName))
//				{
//					return a.getKey();
//				}
//				
//			}
//			return -1;//false
//		}
//		
//		public List<String> findThreeBestPerformers()
//		{
//			//Fill the code
//			List <String> n = new ArrayList<String>();
//			TreeMap <Double, String> t= new TreeMap<>(athleteMap);
//			for (Map.Entry<Double, String> p : t.entrySet()) {
//				for(int i =0;i<3;i++) {
//					p.getKey()
//				}
//				
//			}
//			
//		}
//	}
	
	}

	public Object getYear() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
