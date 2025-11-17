import java.util.Scanner;
class A
{
	 A()
	{
		System.out.println("HELLO");
	}

}
class B extends A
{
	B(int a, int b)
	{
		System.out.println(a+" "+b);
	}
}
class C extends B
{
	C(float a)
	{
		super(10,20);
		System.out.println(a);
	}
}
class D extends C
{
	D()
	{
		super(12.5f);
	}
}
class E extends D
{
	E(float b)
	{
		System.out.println(b);
	}
	public static void main(String[]args)
	{
		new E(122.5f);
	}
}