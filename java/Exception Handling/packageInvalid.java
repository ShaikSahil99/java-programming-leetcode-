package Invalid;
import mistakes.InvalidLoginException;
import java.util.*;
class Gmail
{
	static Scanner sc=new Scanner(System.in);
	static void validate(String a,String b) throws InvalidLoginException
	{
		
	}
	public static void main(String[]args) throws InvalidLoginException
        {
		System.out.println("Enter Login ID and Password");
		String a=sc.next();
		String b=sc.next();
		if(a.equals("Sahil")&&b.equals("123@123")) 
		{
			System.out.println("Welcome to Gmail");
		}
		if(a.equals("Sahil") && b.equals("123@123"))
		{
			throw new InvalidLoginException("by Invalid ID and Password....");
		}
		else if(!a.equals("Sahil")&&b.equals("123@123"))
		{
			throw new InvalidLoginException("by Invalid Id....");
		}
		else if(a.equals("Sahil")&& !b.equals("123@123"))
		{
			throw new InvalidLoginException("by Invalid Password....");
		}
    }
}
      