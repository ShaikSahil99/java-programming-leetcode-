import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1(float a);
	abstract String m2(int a);
	boolean m3(int b)
	{
		return sc.nextBoolean();																																							
	}
}
class B extends A
{
	int m1(float a)
	{
		System.out.println("hiii");
		return 1;
	}
	String m2(int a)
	{
		System.out.println("yoooo");
		return "huuu";
	}
	public static void main(String[]aaa)
	{
		B obj=new B();
		System.out.println(obj.m1(sc.nextFloat()));
		System.out.println(obj.m2(sc.nextInt()));
		System.out.println(obj.m3(sc.nextInt()));
	}
}