import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	A(int a)
	{	
		System.out.println("PC of class A");
	}
	String m1(float a)
	{
		return sc.next();
	}
}
abstract class B extends A
{
	B(long l)
	{
		super(sc.nextInt());
	}
	float m2(String s)
	{
		return sc.nextFloat();
	}
	abstract int m3(double d);
	abstract float m4(char ch);
}
class C extends B
{
	C()
	{
		super(sc.nextLong());
	}
	float m2(String s)
	{
		return sc.nextFloat();
	}
	int m3(double d)
	{
		return sc.nextInt();
	}
	float m4(char ch)
	{
		return sc.nextFloat();
	}	
	public static void main(String[]arg)
	{
		C x=new C();
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(x.m2(sc.next()));
		System.out.println(x.m3(sc.nextDouble()));
		System.out.println(x.m4(sc.next().charAt(0)));
	}
}