import java.util.HashMap;
import java.util.Map;

public class ProductManager {

	private Map<String, Integer> productMap= new HashMap<>();
	private static final int MAX_QUANTITY =5;
	
	public void addProducts(String product) throws ProductNotAddingException {
		productMap.putIfAbsent(product, 0);
		int currQuantity = productMap.get(product);
		
		if(currQuantity < MAX_QUANTITY) {
			productMap.put(product, currQuantity+1);
			
			System.out.println("Product: "+ product+"  Quantity: "+ (currQuantity+1));
			
		}
		else {
			throw new ProductNotAddingException("Cannot add "+ product + " products!! Only "+ MAX_QUANTITY + " units can be added.");
		}
	}
	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		try {
		manager.addProducts("pen");
		manager.addProducts("book");
		manager.addProducts("bottle");
		manager.addProducts("pen");
		manager.addProducts("pen");
		manager.addProducts("pen");
		manager.addProducts("pen");
		manager.addProducts("pen"); 
		manager.addProducts("pen"); //this will throw exception
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
	}
}
}
