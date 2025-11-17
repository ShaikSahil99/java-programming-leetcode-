import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	String m1(int a)
	{
		System.out.println(a);
		return sc.next();
	}
	class B
	{
		float m2(long l)
		{
			System.out.println("inner class Method m2");
			class C
			{
				char m3(int b)
				{
					System.out.println(b);
					return sc.next().charAt(0);
				}
			}	
			class D
			{
				long m4(String s)
				{
					System.out.println(s);
					return sc.nextLong();
				}
			}
			C c=new C();
			c.m3
			D d=new D();
			d.m4
			return sc.nextFloat();
		}
	}
	public static void main(String[]args)
	{	
		D x=new D();
		C y=new C();
			
	}
}