import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	A(int a)
	{
	}
	A(float a)
	{
	}
	String m1()
	{
		return sc.next();
	}
	interface I implements A
	{
		int m2(float a);
		default float m3(char c)
		{
			return sc.nextFloat();
		}
		static long m3(String c)
		{
			return sc.nextLong();
		}
	}
	
	public static void main(String[]args)
	{
		I x=new I()
		{
			public int m2(float a)
			{
				return sc.nextInt();
			}
		};	
	}
}