//Write a Program to print the Given Password is Valid Password or Not?
//----------------------------------------------------------------------------------
import java.util.Scanner;
class A
{
	public static void main(String[]args)
    	{
    		Scanner sc  = new Scanner(System.in);
       		String name  = sc.nextLine();
        	String password  = sc.nextLine(); 
        	System.out.println((isValid(name , password)) + "Valid Password");
    	}
	public static String isValid(String name , String pass)
	{
        	String nope = "Not a ";
        	int n = pass.length();
        	if(n != 8)
		{
			return nope;
		}
               	if(!('A'<= pass.charAt(0) && pass.charAt(0) <= 'Z'))
		{	
	        	return nope;
		}
               	boolean small = false, special = false , num = false;
        	for(int i = 1 ; i < n ; i++)
		{
            		char ch = pass.charAt(i);
            		if(Character.isLowerCase(ch))
			{
                		small = true;
            		}
			else if(Character.isDigit(ch))
			{
                		num = true;
            		}
			else if(!Character.isUpperCase(ch))		
			{
                		special = true;
            		}
        	}
        
        	if(!(small && special && num))
		{
			return nope;
		}
        
        	if(pass.toLowerCase().contains(name.toLowerCase()))
		{
			return nope;
		}
        	return "";
    	}
}