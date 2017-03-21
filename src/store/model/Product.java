package store.model;

import java.math.BigDecimal;

public class Product {
	private String productid;
	private String name;
	private String imagefile;
	private BigDecimal price;
	
	// constructor
	public Product(){
		
	}
	
	// setters
	public void setProductId(String productid){
		this.productid = productid;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setImageFile(String imagefile){
		this.imagefile = imagefile;
	}
	
	public void setPrice(BigDecimal price){
		this.price = price;
	}
	
	// getters
	public String getProductId(){
		return productid;
	}
	
	public String getName(){
		return name;
	}
	
	public String getImageFile(){
		return imagefile;
	}
	
	public BigDecimal getPrice(){
		return price;
	}
	

}
