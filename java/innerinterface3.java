import java.util.Scanner;
class A
{
	static Scanner in=new Scanner(System.in);
	A()
	{
		this(in.next());
	}
	A(String s)
	{
		System.out.println("Constructor1 of class A");
	}
	A(int a)
	{
		System.out.println("Constructor2 of class B");
	}
	String m1(int a)
	{
		System.out.println("outer interface method m1");
		return in.next();
	}
	interface I1
	{
		long m2(String s);
		default float m3(long l)
		{
			System.out.println("outer interface method m2");
			return in.nextFloat();
		}
		static char m4(float f)
		{
			System.out.println("inner interface method m4");
			return in.next().charAt(0);
		}	
	}
	public static void main(String[]arg)
		{
			A x=new A();		
			A x1=new A(in.nextInt());
			System.out.println(x.m1(in.nextInt()));
			I1 y=new I1()
			{
				public long m2(String s)
				{
					return in.nextLong();
				}	
			};
			System.out.println(y.m2(in.next()));
			System.out.println(y.m3(in.nextLong()));
			System.out.println(I1.m4(in.nextFloat()));
			
		}
}	
		