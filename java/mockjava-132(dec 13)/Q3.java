import java.util.*;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	String m1(int a);
	long m2(char a);
	default char m3(float a)
	{
		return sc.next().charAt(0);
	}
	interface I2
	{
		int m4(float a);
		long m5(long a);
		default String m6(float a)
		{
			return sc.next();
		}
	}
}
class Test
{
	public static void main(String[]args)
	{
		I1 x=new I1()
		{
			public String m1(int a)	
			{
				return I1.sc.next();
			}
			public long m2(char a)
			{		
				return I1.sc.nextLong();
			}
		};
		System.out.println(x.m1(I1.sc.nextInt()));
		System.out.println(x.m2(I1.sc.next().charAt(0)));
		System.out.println(x.m3(I1.sc.nextFloat()));	
		I1.I2 y=new I1.I2()
		{
			public int m4(float a)
			{
				return I1.sc.nextInt();
			}
			public long m5(long a)
			{
				return I1.sc.nextLong();
			}
		};
		System.out.println(y.m4(I1.sc.nextFloat()));
		System.out.println(y.m5(I1.sc.nextLong()));
		System.out.println(y.m6(I1.sc.nextFloat()));
	}
}


	