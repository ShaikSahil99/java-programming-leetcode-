package test;
import java.util.Random;
import java.util.*;
import test.*;
class colour
{
	
	static String def = "\u001B[0m";
	static String blink = "\u001B[5m";
	static String red = "\u001B[31m";
	static String green = "\u001B[32m";
	static String yellow = "\u001B[33m";
	
	static String blue = "\u001B[34m";
	static String purple = "\u001B[35m";
	static String skyblue = "\u001B[36m";
}
public class Projectid extends colour
{
	//public static Cosmetics q1=new Cosmetics();
	static String termi="Success";
	static Scanner sc=new Scanner(System.in);
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String contact;
	static int min=1000;
	static int max=9999;
	static int otp=(int)(Math.random()*(max-min+1)+min);
	public void register(String email, String firstName, String lastName, String password, String contact)
	{
		this.email=email;
		this.firstName=firstName;
		this.lastName=lastName;
		this.password=password;
		this.contact=contact;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPassword()
	{
		return password;
	}
	public String getContact()
	{
		return contact;
	}
	
		static void otp()
			{
				System.out.println("Enter OTP :");
				int a=sc.nextInt();
				if(otp==a)
				{
					System.out.print(skyblue);
					System.out.println("Mobile number verified successfully");
					System.out.print(def);
				}
				else
				{
					System.out.print("Invalid Otp");
					otp();
				}
				
			}
	public void login(String email, String password, String contact)
	{
		String loginEmailOrPhone, loginPassword;
		System.out.print(yellow);	
		System.out.print("Enter your registered email or phone number : ");
		System.out.print(def);
		loginEmailOrPhone=sc.next();
		System.out.print(yellow);
		System.out.print("Enter password : ");
		System.out.print(def);
		loginPassword=sc.next();
		if((loginEmailOrPhone.equalsIgnoreCase(email) && loginPassword.equals(password)) || (loginEmailOrPhone.equalsIgnoreCase(contact) && loginPassword.equals(password)) )
		{
			System.out.print(skyblue);
			System.out.println("login Successfully");
			System.out.print(def);
			termi="Success";
		}
		else
		{
			System.out.println("Account Not Found ");
			System.out.println(" please Register with Your Details First." );
			termi="Failure";
		}
		
	}
	public static boolean login()
	{
		
		Projectid pro=new Projectid();
		int choice=1;
		System.out.print(def);
		while(choice!=-1)
		{
			System.out.print(purple);
			System.out.println("Enter 1 To register : ");
			System.out.println("Enter 2 To login : ");
			System.out.println("-1 to exit : " );
			System.out.print(def);
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print(yellow);
					System.out.print("Enter email : ");
					System.out.print(def);
					String email=sc.next();
					System.out.print(yellow);
					System.out.print("Enter First name : ");
					System.out.print(def);
					String firstName=sc.next();
					System.out.print(yellow);
					System.out.print("Enter Last name : ");
					System.out.print(def);
					String lastName=sc.next();
					System.out.print(yellow);
					System.out.print("Enter phone number : ");
					System.out.print(def);
					String contact=sc.next();
					System.out.print(yellow);
					System.out.print("Create a password : ");
					System.out.print(def);
					String password=sc.next();
					pro.register(email,firstName,lastName,password,contact);
					System.out.print(yellow);
					System.out.println("Your login for otp is: "+otp);
					System.out.print(def);
					otp();
					System.out.println("registered succesfully please login with your details : ");
				case 2:
					pro.login(pro.getEmail(),pro.getPassword(),pro.getContact());
					if(termi.equals("Success"))
					{
						choice=-1;
						return true;
					}
					else
					{
						choice=1;
					}
					break;
					
					
			}
		
			
		}
		return false;
		
	}

}