package store.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	
	
	public DBConnection(){
		
	}
	
	public ProductCatalog getProductCatalog(){
		ProductCatalog productCatalog = new ProductCatalog();
		try{
			Connection con = (Connection) MyDB.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products");
			
			while(rs.next()){
				Product product = new Product();
				product.setProductId(rs.getString("productid"));
				product.setName(rs.getString("name"));
				product.setImageFile(rs.getString("imagefile"));
				product.setPrice(rs.getBigDecimal("price"));
				productCatalog.addProduct(product);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return productCatalog;
	}	
	
	public Product getProductById(String productid){
		Product product = new Product();
		try{
			Connection con = (Connection) MyDB.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products where productid='" + productid + "'");
			if (rs.next()){
				product.setProductId(rs.getString("productid"));
				product.setName(rs.getString("name"));
				product.setImageFile(rs.getString("imagefile"));
				product.setPrice(rs.getBigDecimal("price"));
			}
			
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return product;
	}

}
