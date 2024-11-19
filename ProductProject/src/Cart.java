import java.util.HashMap;
import java.util.Map;

public class Cart {

	private Map<String, Product> cart;
	
	public Cart() {
		this.cart=new HashMap<>();
	}
	
	public Cart addingProducts(Product prod) throws ProductCannotAddException {
		
		if(cart.containsKey(prod.getName())) {
			Product availaibleProdName = cart.get(prod.getName());
			
			int quantity= availaibleProdName.getQuantity()+ 1;

			if (quantity >5) {
				throw new ProductCannotAddException();
			}
			
			availaibleProdName.setQuantity(quantity);
			cart.put(prod.getName(), availaibleProdName);
			
		}
		else {
			prod.setQuantity(1);
			cart.put(prod.getName(), prod);
		}
		return null;
	}
	
	public void showCart() {
		if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (Product prod : cart.values()) {
                System.out.println("Name: " + prod.getName() + ", Quantity: " + prod.getQuantity());
            }
	}
	
	
}}
