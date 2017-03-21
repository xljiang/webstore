package store.model;

import java.util.HashMap;
import java.util.Set;

public class ProductCatalog {
	private HashMap<String,Product> productCatalog;
	
	public ProductCatalog(){
		productCatalog = new HashMap<String,Product>();
	}
	
	public Product getProductById(String productid){
		return productCatalog.get(productid);
	}
	
	public void addProduct(Product product){
		productCatalog.put(product.getProductId(), product);
	}
	
	public Set<String> idSet(){
		return productCatalog.keySet();
	}

}
