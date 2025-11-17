import java.util.Scanner;
interface I1
{
	Scanner sc = new Scanner(System.in);
	String m1(long l);
	default String m2(float f)
	{
		return sc.next();
	}	
}
interface I2 extends I1
{
	long m3(int a);
	default int m4(boolean b)
	{
		System.out.println("defined method of I2");
		return sc.nextInt();
	} 
}
abstract class A implements I2
{
	abstract char m5(int a);
	long m6(char a)
	{
		return sc.nextLong();
	}
	static A x=new A()
	{
		
		public String m1(long l)
		{
			return sc.next();
		}
		public long m3(int a)
		{
			return sc.nextLong();
		}	
		char m5(int a)
		{
			return sc.next().charAt(0);
		}
		float m7(String s)
		{
			return sc.nextFloat();
		}
		
	};
	public static void main(String[]arg)
	{
		System.out.println(x.m1(sc.nextLong()));
		System.out.println(x.m3(sc.nextInt()));
		System.out.println(x.m5(sc.nextInt()));
		A.A y=x.new A()
		{
			public String m1(long l)
			{
				return sc.next();
			}
			public long m3(int a)
			{
				return sc.nextLong();
			}	
			char m5(int a)
			{
				return sc.next().charAt(0);
			}
		};
		System.out.println(y.m7(sc.next()));	
	}
}
