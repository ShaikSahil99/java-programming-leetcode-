import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float m2(int a)
	{
		return sc.nextFloat();
	}
	A(String a,long l)
	{
		System.out.println(a);
		System.out.println(l);
	}
	A()
	{
		System.out.println("Def Constr");
	}
	abstract class B extends A
	{
		B()
		{
			super(sc.next(),sc.nextLong());
		}
		abstract String m3(char a);
		float m4(double d)
		{
			return sc.nextFloat();
		}
		String m5(int a)
		{
			return sc.next();
		}
	}
	
	public static void main(String[]arg)
	{
		B x=new B()
		{
			String m3(char a)
			{
				return sc.next();
			}
		};
		System.out.println(x.m3(sc.next().charAt(0)));
		System.out.println(x.m4(sc.nextDouble()));
		System.out.println(x.m5(sc.nextInt()));
	}
}
