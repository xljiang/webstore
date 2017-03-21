package login;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AccountListener implements ServletContextListener {

    public AccountListener() {
    	
    }

    // Notification that the web application initialization process is starting
	public void contextInitialized(ServletContextEvent sce)  { 
		AccountManager accountManager = new AccountManager();
		ServletContext sc = sce.getServletContext();
		sc.setAttribute("Account Manager", accountManager);
		
    }

	// Notification that the servlet context is about to be shut down
    public void contextDestroyed(ServletContextEvent sce)  { 
    	sce.getServletContext().removeAttribute("Account Manager");
    }
	
}
