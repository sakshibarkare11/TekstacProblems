
public class Main {

		public static void main(String args[]) {
		
			Cart cart = new Cart();

	        Product p1 = new Product("Apple", 0);
	        Product p2 = new Product("Banana", 0);
	        Product p3 = new Product("Orange", 0);

	        cart.addingProducts(p1); 
	        cart.addingProducts(p2) 
	        cart.addingProducts(p1);
	        cart.addingProducts(p1);   
	        cart.addingProducts(p1); 
	        cart.addingProducts(p1);  
	        cart.addingProducts(p1); 

	        cart.showCart();  
		}
		
		}
	
}
