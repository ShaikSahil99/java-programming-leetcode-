import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	String a=sc.next();
	A()
	{
		System.out.println("Default Constructor Calling");
	}
	A(int a)
	{
		this();
		System.out.println(a+"  "+this.a);
	}
	String m1(float a)
	{	
		System.out.println(a+"  "+this.a);
		return sc.next();
	}
}
class B extends A
{
	int a=sc.nextInt();
	B()
	{
		super(sc.nextInt());
		System.out.println(this.a+"  "+super.a);
		System.out.println(super.m1(sc.nextFloat()));
	}
	String m1(float a)
	{
		System.out.println(a+"  "+super.a);
		System.out.println(super.m1(sc.nextFloat()));
		System.out.println(this.m1(sc.nextLong()));
		return sc.next();
	}
	String m1(long a)
	{
		return sc.next();
	}
	public static void main(String[]args)
	{
		B x=new B();	
		System.out.println(x.m1(sc.nextFloat()));
	}
}