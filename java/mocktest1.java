import java.util.*;
interface I
{
	static Scanner sc=new Scanner(System.in);
	default String m1(int a)
	{
		return sc.next();
	}
	int m2(float f);
}
interface I1
{
	default float m3(int a)
	{
		return I.sc.nextFloat();
	}
	char m4(long l);
}
abstract class A
{
	A(int a)
	{
		System.out.print(a);
		System.out.print("PC Calling");
	}
	String m5(boolean a)
	{
		return I.sc.next();
	}
	abstract float m6(char c);
}
class B extends A implements I,I1
{
	B()
	{
		super(sc.nextInt());
	}
	public int m2(float f)
	{
		return sc.nextInt();
	}
	public char m4(long l)
	{
		return sc.next().charAt(0);
	}
	float m6(char c)
	{
		return sc.nextFloat();
	}
}
class test
{
	I1 display(B obj)
	{
		System.out.print(obj.m1(I.sc.nextInt()));
		System.out.print(obj.m2(I.sc.nextFloat()));
		System.out.print(obj.m3(I.sc.nextInt()));
		System.out.print(obj.m4(I.sc.nextLong()));	
		System.out.print(obj.m5(I.sc.nextBoolean()));
		System.out.print(obj.m6(I.sc.next().charAt(0)));
		return obj;
	}
	public static void main(String[]args)
	{
		test x=new test();
		System.out.print(x.display(new B()));
	}
}