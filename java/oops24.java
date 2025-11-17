import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	A(int a)
	{
		System.out.println("PC of class A");
	}
	int m1(float a)
	{
		return sc.nextInt();
	}
	abstract String m2(int a);
	abstract long m3(char ch);
}
class B
{
	static Scanner sc=new Scanner(System.in);
	B()
	{
		this(sc.nextBoolean());
	}
	float m4(String s)
	{
		return sc.nextFloat();
	}
	B(boolean a)
	{
		System.out.print("PC of class B");
	}
	
}
class C extends A
{
	C()
	{
		super(sc.nextInt());
	}
	String m2(int a)
	{
		return sc.next();
	}
	long m3(char ch)
	{
		return sc.nextLong();
	}
	public static void main(String[]arg)
	{
		C x=new C();
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(x.m2(sc.nextInt()));
		System.out.println(x.m3(sc.next().charAt(0)));
		B y=new B();
		System.out.println(y.m4(sc.next()));
	}
} 