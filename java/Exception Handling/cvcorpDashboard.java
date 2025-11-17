package CVCORP;
import mistakes.InvalidNameFormatException;
import mistakes.InvalidMobileNumberException;
import mistakes.InvalidGmailFormatException;
import mistakes.CourseNotFoundException;
import java.util.Scanner;
class Cvcorp
{	
	static void Username(String name) throws InvalidNameFormatException
	{
		
	        if(name.matches("[a-zA-Z]+")==true)
		{
			System.out.print("Enter Mobile Number :");
		}
		else 
		{
			throw new InvalidNameFormatException("by name should contain only Alphabetics");	
		}
	}
	static void MobileNum(String num) throws InvalidMobileNumberException
	{
		if(num.charAt(0)=='0')
		{
			throw new InvalidMobileNumberException("by '0' Invalid starting digit of MobileNumber");
		}
		else if(num.length()!=10)
		{
			throw new InvalidMobileNumberException("A Mobile Number must contains 10 digits");
		}
		else
		{
			System.out.print("Enter the Gmail  :");
		}
		
	}
	static void gmail(String mail) throws InvalidGmailFormatException
	{
		if(mail.contains("@")==false || mail.contains(".")==false)
		{
			throw new InvalidGmailFormatException("by Invalid Gmail Id Format");
		}
		else
		{
			System.out.print("Enter Course name  :");
		}
	}
	static void course(String course) throws CourseNotFoundException
	{
		if(course.equalsIgnoreCase("java")||course.equalsIgnoreCase("python"))
		{
			System.out.println("*********WELCOME TO CVCORP**********");
		}
		else
		{	
			throw new CourseNotFoundException("by Invalid Course Title");
		}
	}
	public static void main(String[]arg) throws Exception
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Name  :");
		Username(sc.next());
		MobileNum(sc.next());
		gmail(sc.next());
		course(sc.next());
	}
}




/*

package CVCORP;
import mistakes.InvalidNameFormatException;
import mistakes.InvalidMobileNumberException;
import mistakes.InvalidGmailFormatException;
import mistakes.CourseNotFoundException;
import java.util.Scanner;
class Cvcorp
{	
	static boolean Username(String name)
	{
	        if(name.matches("[a-zA-Z]+")==true)
		{
			System.out.println("Enter Mobile Num : ")
		}
		else
		{
		}
	}
	static int MobileNum(String num) 
	{
		if(num.charAt(0)=='0')
		{
			return -1;
		}
		if(num.length()!=10)
		{
			return 0;
		}
		return 1;
	}
	static boolean gmail(String mail)
	{
		if(mail.contains("@")==false || mail.contains(".")==false)
		{
			return false;
		}
		return true;
	}
	static boolean course(String course)
	{
		if(course.equalsIgnoreCase("java")||course.equalsIgnoreCase("python"))
		{
			return true;
		}
		else
		{	
			return false;
		}
	}
	public static void main(String[]arg) throws Exception
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Name  :");
		String name=sc.next();
		if(Username(name)==true)
		{
			System.out.println("Mobile Number  :");
			String num=sc.next();
			if(MobileNum(num)==1)
			{
				System.out.println("Enter the Gmail Id :");
				if(gmail(sc.next())==true)
				{
					System.out.println("Course  :");
					if(course(sc.next())==true)
					{
						System.out.println("\t\t\t\t\t********Welcome to CVCORP********");
					}
					else
					{
						throw new CourseNotFoundException("by Invalid Course Title");
					}
				}
				else
				{
					throw new InvalidGmailFormatException("by Invalid Gmail Id Format");
				}
			}
			else if(MobileNum(num)==-1)
			{
				throw new InvalidMobileNumberException("by '0' Invalid starting digit of MobileNumber");
			}
			else if(MobileNum(num)==0)
			{
				throw new InvalidMobileNumberException("A Mobile Number must contains 10 digits");
			}
		}
		else
		{
			throw new InvalidNameFormatException("by name should contain only Alphabetics");
		}
	}
}
*/