import java.util.Scanner;
import java.util.InputMismatchException;
class A
{
	static Scanner sc=new Scanner(System.in);
	String m1(int a,int b)
	{
		String k="Done bro";
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)   //Exception is the super base class of all exceptions like ArithmeticException.....etc
		{
			System.out.println("Don't divide by Zero");
		}
		return k;
	}
	boolean m2(int a)
	{
		boolean c=true;
		try
		{
			int b=sc.nextInt();
		}
		catch(InputMismatchException e)      //Fully Name Qualified approach of InputMisMatchException
		{	
			c=false;
		}
		return c;
	}
	public static void main(String[]arg)
	{
		A x=new A();
		
		System.out.println(x.m1(sc.nextInt(),sc.nextInt()));
		System.out.println(x.m2(sc.nextInt()));
	}
}