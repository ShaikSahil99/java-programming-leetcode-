import java.util.*;
interface I1
{
	Scanner sc=new Scanner(System.in);
	String m1(int a);
	static int m2(String a)
	{
		System.out.println("DefinedStaticMethod M2");
		return sc.nextInt();
	}
	default float m3(int a)
	{
		System.out.println("DefinedDefaultMethod M3");
		return sc.nextFloat();
	}
}
interface I2
{
	Scanner st=new Scanner(System.in);
	int m4(String a);
	static String m5(int a)
	{
		System.out.println("DefinedStaticMethod M5");
		return sc.next();
	}
	default int m6(float a)
	{
		System.out.println("DefinedDefaultMethod M6");
		return sc.nextInt();
	}
}
abstract class A
{
	abstract char m7(long a);
	static long m8(float a)
	{
		System.out.println("DefinedStaticMethod M8");
		return sc.nextLong();
	}
	A(int a)
	{
		System.out.println(a);
		System.out.println("Parameterized Constructor of class A");
	}
}
class B extends A implements I1,I2
{
	static B obj=new B();
	public String m1(int a)
	{
		System.out.println("Overridden method of I1");
		return sc.next();
	}
	public int m4(String a)
	{
		System.out.println("Overridden method of I2");
		return sc.nextInt();
	}
	char m7(long a)
	{
		System.out.println("Overridden method of A");
		return sc.next().charAt(0);
	}
	String m9(char c)
	{
		return sc.next().charAt(0);
	}
	B()
	{
		super(sc.nextInt());
	}
}
class Test
{
	public static void main(String[]arg)
	{
		B.obj.m1(sc.nextInt());
	}
}