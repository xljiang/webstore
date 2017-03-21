package login;

import java.util.HashMap;

public class AccountManager {
	private HashMap<String, String> accounts;

	public AccountManager(){
		accounts = new HashMap<String, String>();
		createNewAccount("Patrick", "1234");
		createNewAccount("Molly", "FloPup");
		createNewAccount("admin", "admin");
	}
	
	// if an account exists
	public boolean hasAccount(String name){
		return accounts.containsKey(name);
	}
	
	// if usr name and psw correct
	public boolean isCorrectPassword(String name, String password){
		return hasAccount(name) && accounts.get(name).equals(password);
	}
	
	// create a new account
	public void createNewAccount(String name, String password){
		accounts.put(name, password);
	}

}
