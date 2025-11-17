import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(String s);
	String m2(int a)
	{
		return sc.next();
	}
	A(String str)
	{	
		System.out.print("1st P Constructor of class A");
	}
	A(float f)
	{
		System.out.print("2nd P Constructor of class A");
	}
	A()
	{
		System.out.print("Default Constructor of class A");
	}
	class B
	{
		String m4(long l)
		{
			return sc.next();
		}
	}
}
interface I
{
	long m3(char c);
	default float m4(boolean b)
	{
		return A.sc.nextFloat();
	}
}
class Test
{
	public static void main(String[]arg)
	{
		A.B z=x.new B();
		System.out.print(z.m4(A.sc.nextLong()));
	}
}