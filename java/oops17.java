import java.util.*;
class Insta
{
	static Scanner sc=new Scanner(System.in);
	private String userId=sc.next();
	private String Pswrd=sc.next();
	void SignIn(String e,String f)
	{
		if(e.equals(userId) && f.equals(Pswrd))
		{
			System.out.println("IncorrectPassword");
			System.out.print("Press "+"1 "+"for "+" ForgotPassword:");
			int k=sc.nextInt();
			if(k==1)
			{
				System.out.println("EnterOTP"+" "+"received" +" "+"on"+" "+"YourNumber");
				int otp=sc.nextInt();
				System.out.println("OTP "+"Verified"+" Successfully");
				System.out.println("Enter "+"New "+"Passwrod");
				SetValuePswrd(sc.next());
				System.out.println("Updated"+" Successfully");
			}
		}
		else if(e.equals(userId) && !f.equals(Pswrd))
		{
			System.out.println("IncorrectPassword");
			System.out.print("Press "+"1 "+"for "+" ForgotPassword:");
			int k=sc.nextInt();
			if(k==1)
			{
				System.out.println("EnterOTP"+" "+"received" +" "+"on"+" "+"YourNumber");
				int otp=sc.nextInt();
				System.out.println("OTP "+"Verified"+" Successfully");
				System.out.println("Enter "+"New "+"Passwrod");
				SetValuePswrd(sc.next());
				System.out.println("Updated"+" Successfully");
			}
			
		}
		else if(!e.equals(userId) && f.equals(Pswrd))
		{
			System.out.println("Incorrect....UserID");
			System.out.println("Press.....1.....to..... Change....UserId....");
			int k=sc.nextInt();
			if(k==1)
			{
				System.out.println("EnterOTP......received....on.....YourMobileNumber");
				int otp=sc.nextInt();
				System.out.println("OTP....Verified....Successfully");
				System.out.println("Enter....New....UserID");
				SetValueId(sc.next());
				System.out.println("Updated.....Successfully");
			}
		}
		else if(!e.equals(userId) && !f.equals(Pswrd))
		{
			System.out.println("Incorrect....UserID....&...Password");
			System.out.print("Press...1...to....Update:");
			int k=sc.nextInt();
			if(k==1)
			{
				System.out.println("EnterOTP....received...on....YourNumber");
				int otp=sc.nextInt();
				System.out.println("OTP.....Verified....Successfully");
				System.out.println("Enter....New....User_Id..........Password");
				SetValue(sc.next(),sc.next());
				System.out.println("Updated.....Successfully");	
			}
		}
	}
	void SetValueId(String c)
	{
		this.userId=c;
	}
	void SetValuePswrd(String d)
	{
		this.Pswrd=d;
	}
	void SetValue(String c, String d)
	{
		this.userId=c;
		this.Pswrd=d;
	}
	String GetuserId()
	{
		return userId;
	}
	String GetPswrd()
	{
		return Pswrd;
	}
}
class User extends Insta
{
	public static void main(String[]args)
	{
	
		System.out.println("Signup.......for......NewID.....&...NewPassword:");
		System.out.println("Enter...New....UserId....&...Password");
		Insta obj=new Insta();
		System.out.println("SignedUp.....Successfully");
		System.out.println("SignIn......using.....ID.....&......Password");
		obj.SignIn(sc.next(),sc.next());	
	}
}
      