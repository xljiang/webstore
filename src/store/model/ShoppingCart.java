package store.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

public class ShoppingCart {
	private HashMap<String,Integer> shoppingCart;
	
	public ShoppingCart(){
		shoppingCart = new HashMap<String,Integer>();
	}
	
	public void addProduct(String productid){
		
		if (shoppingCart.containsKey(productid)){
			shoppingCart.put(productid, shoppingCart.get(productid) + 1);
		} else{
			shoppingCart.put(productid, 1);
		}	
	}
	
	public void addProduct(String productid, Integer quantity){
		shoppingCart.put(productid, quantity);
	}
	
	public int getQuantity(String productid){
		return shoppingCart.get(productid);
	}
	
	public BigDecimal getTotalPrice(){
		BigDecimal total = new BigDecimal(0);
		for(String productid : shoppingCart.keySet()){
			BigDecimal quantity = new BigDecimal(shoppingCart.get(productid));
			DBConnection dbc = new DBConnection();
			Product product = dbc.getProductById(productid);
			total = total.add(product.getPrice().multiply(quantity));		
		}
		return total;
	}
	
	public Set<String> keySet(){
		return shoppingCart.keySet();
	}
}
