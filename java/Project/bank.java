package test;
public class bank
{
    	public static double balance = 5000000;
	public static double withdraw(double amount)
    	{
        	balance=balance-amount;
        	System.out.println(" Transaction Succesful");
        	System.out.println(" withdrawn amount="+amount);
        	return balance;
    	}
	
}