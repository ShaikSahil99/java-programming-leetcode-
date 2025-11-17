import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract int m1();
	abstract String m2(int a);
}
class B extends A
{
	int m1()
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
		System.out.println(obj.m1());
		System.out.println(obj.m2(sc.nextInt()));
	}
}