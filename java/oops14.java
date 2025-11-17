import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	A()
	{
		System.out.print("heooo");
	}
	 A(boolean a)
	{
		System.out.println("HELLO");
		System.out.println(a);
	}
	String m1(int a)
	{
		System.out.print(a);
		return sc.next();
	}

}
class B extends A
{
	String a=sc.next();
	B()
	{
		super();
		super(sc.nextBoolean());
		System.out.println(super.a);
		System.out.println(m1(sc.nextInt())+"  "+super.m1(sc.nextInt()));
	}
	String m1(int a)
	{
		System.out.println(super.m1(sc.nextInt()));
		System.out.println(a+" "+this.a+" "+super.a);
		return sc.next();
	}
	public static void main(String[]args)
	{
		B obj=new B();
		System.out.print(obj.m1(sc.nextInt()));
	}
}