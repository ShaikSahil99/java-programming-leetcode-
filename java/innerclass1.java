import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	private int a=sc.nextInt();
	A()
	{
		this(sc.next());
	}
	String m1(int b)
	{
		System.out.println("Method of outer class");
		return sc.next();
	}
	A(String s)
	{
		System.out.println("PC of outer class");
	}
	static class B
	{
		int m2(float f)
		{
			System.out.println("Method of inner class B "+f);
			return sc.nextInt();
		}
	}
	class C
	{
		long m3(char c)
		{
			System.out.println("Method of inner class C "+c);	
			return sc.nextLong();
		}
	}
	public static void main(String[]arg)	
	{
		A x=new A();
		B x1=new B();
		A.C x2=x.new C();
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x1.m2(sc.nextFloat()));
		System.out.println(x2.m3(sc.next().charAt(0)));
	}
}

      