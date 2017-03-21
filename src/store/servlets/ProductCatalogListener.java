package store.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import store.model.DBConnection;
import store.model.MyDB;
import store.model.ProductCatalog;

@WebListener
public class ProductCatalogListener implements ServletContextListener {

    public ProductCatalogListener() {

    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	DBConnection dbc = new DBConnection();
		ProductCatalog productCatalog = dbc.getProductCatalog();
		ServletContext sc = sce.getServletContext();
		sc.setAttribute("Database Connection", dbc);
		sc.setAttribute("Product Catalog", productCatalog);
	}

    public void contextDestroyed(ServletContextEvent sce)  { 
    	MyDB.close();
    }
	
}
