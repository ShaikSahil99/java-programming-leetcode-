import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	A()
	{
		System.out.println("Default Constructor calling");
	}
	 A(boolean a)
	{
		this();
		System.out.println(a+" "+this.a);
	}
	String m1(int a)
	{
		System.out.println(a+" "+this.a);
		return sc.next();
	}

}
class B extends A
{
	String a=sc.next();
	B()
	{
		super(sc.nextBoolean());
		System.out.println(super.m1(sc.nextInt()));
		System.out.println(a+" "+super.a);
	}
	String m1(Float a)
	{
		System.out.println(a);
		return sc.next();
	}
	String m1(int a)
	{
		System.out.println(super.m1(sc.nextInt()));
		System.out.println(a+" "+this.a+" "+super.a);
		System.out.println(this.m1(sc.nextFloat()));
		return sc.next();
	}
	public static void main(String[]args)
	{
		B obj=new B();
		System.out.print(obj.m1(sc.nextInt()));
	}
}