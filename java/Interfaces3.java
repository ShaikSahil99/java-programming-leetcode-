import java.util.Scanner;
interface I1
{
	Scanner sc = new Scanner(System.in);
	String m1(long l);
	static String m2(float f)
	{
		return sc.next();
	}	
}
interface I2
{
	long m3(int a);
	default void m4(boolean b)
	{
		System.out.println("defined method of I2");
	} 
}
interface I3
{
	boolean m5(char ch);
	default long m6(boolean b)
	{	
		System.out.println("defined method of I3");
		return I1.sc.nextLong();
	}
}
abstract class A implements I1,I2,I3
{
	A(String k)
	{
		System.out.println("pc of Ab class ");
	}
	abstract float m7();
	void m8(char h)	
	{
		System.out.println("def method of ab class");
	}
}
class B extends A
{
	B(){super(sc.next());}
	public String m1(long l)
	{
		System.out.println("m1 method overriden "+l);
		return sc.next();
	}
	public long m3(int a)
	{
		System.out.println("m3 method overriden "+a);
		return sc.nextLong();
	}
	public boolean m5(char ch)
	{
		System.out.println("m5 method overriden "+ch);
		return sc.nextBoolean();
	}
	float m7()
	{
		System.out.println("m7 method overriden ");
		return sc.nextFloat();
	}
}
class C extends A
{
	C(){super(sc.next());}
	public String m1(long l)
	{
		System.out.println("m1 method overriden "+l);
		return sc.next();
	}
	public long m3(int a)
	{
		System.out.println("m3 method overriden "+a);
		return sc.nextLong();
	}
	public boolean m5(char ch)
	{
		System.out.println("m5 method overriden "+ch);
		return sc.nextBoolean();
	}
	float m7()
	{
		System.out.println("m7 method overriden ");
		return sc.nextFloat();
	}

}
class D extends A
{
	private int k = 5454;
	void setval(int k)
	{
		this.k= k;
	}
	int getval()
	{
		return k;
	}
	 D(){super(sc.next());}
	public String m1(long l)
	{
		System.out.println("m1 method overriden "+l);
		return sc.next();
	}
	public long m3(int a)
	{
		System.out.println("m3 method overriden "+a);
		return sc.nextLong();
	}
	public boolean m5(char ch)
	{
		System.out.println("m5 method overriden "+ch);
		return sc.nextBoolean();
	}
	float m7()
	{
		System.out.println("m7 method overriden ");
		return sc.nextFloat();
	}

}
class test
{
	static void display(A obj)
	{
		System.out.println(obj.m1(I1.sc.nextLong()));
		System.out.println(I1.m2(I1.sc.nextFloat()));
		System.out.println(obj.m3(I1.sc.nextInt()));
		obj.m4(I1.sc.nextBoolean());
		System.out.println(obj.m5(I1.sc.next().charAt(0)));
		System.out.println(obj.m6(I1.sc.nextBoolean()));
		System.out.println(obj.m7());
		obj.m8(I1.sc.next().charAt(0));	
	}
	public static void main(String args[])
	{
		int n = I1.sc.nextInt();
		if(n==1)
		{
			display(new B());
		}
		else if(n==2)
		{	
			display(new C());
		}
		else if(n==3)
		{
			D x = new D();
			if(x.getval()==I1.sc.nextInt())
			{	
				display(x);
			}	
			else
			{
				System.out.println("invalid pin");
			}
		}
	}
}