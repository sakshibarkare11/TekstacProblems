package bank.com;

public class AccountManager {
//	private String username;
//	private String password;
//	private double balance;
	private static final double MAX_DEPOSIT_LIMIT = 10000.00;
	
	
	
    public boolean validateCredentials(String username,String password) throws InvalidCredentialException {/
//    	if(!isValidusername(username) || isValidpassword) {
    		
    	}
		if(username.length() < 5 && !username.contains("^[_]*$") && !username.contains("^[A-Za-z0-9]*$")) {
			throw new InvalidCredentialException("Username not valid");
		}
		if(!password.contains("[a-z]{1}") && !password.contains("[A-Z]{1}") && !password.contains("[0-9]{1}") && !password.contains("[!@#$%^&*]*") && password.length()<7){
			throw new InvalidCredentialException("Password not valid");
		}
    	return true;

}
    public boolean deposit(String username, double amount) throws InvalidFundsException {
    	if (amount <=0) {
			System.out.println("Invalid amount. Please enter a positive number");
			return;
		}
		if(amount >0 && amount <= 10000) {
			return true;
		}
		else {
			throw new InvalidFundsException("Invalid deposit transaction");
		}
}
    public boolean withdraw(String username, double amount) throws InvalidFundsException {
//    	double currentBalance = balances.get(username);
    	if(!(amount >0 && amount <= currentBalance)) {
			throw new InvalidFundsException("not valid");
		}
		if(currentBalance < 0)  {
			throw new InvalidFundsException("Insufficient balance");
		}
    	return true;
    	
    }
    public double checkBalance(String username) throws InvalidCredentialException {
		return 0;
    	
    }


    
}