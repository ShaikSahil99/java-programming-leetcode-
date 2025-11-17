import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	String a=sc.next();
	A()
	{
		System.out.println("Hiiii i am dc");
	}
	A(int a)
	{
		this();
	}
	String m1(float a)
	{
		return sc.next();	
	}
}
class B extends A
{
	int a=sc.nextInt();
	B()
	{
		super(sc.nextInt());
		System.out.println(super.a+"  "+this.a);
		System.out.println(super.m1(sc.nextFloat()));
		System.out.println(this.m1(sc.nextFloat()));
	}
	String m1(float a)
	{
		System.out.println(super.a+"   "+this.a);
		System.out.println(super.m1(sc.nextFloat()));
		System.out.println(this.m1(sc.nextInt()));
		return sc.next();	
	}
	String m1(int a)
	{
		return sc.next();	
	}
	public static void main(String[]arg)
	{
		B x=new B();
	}
}



























