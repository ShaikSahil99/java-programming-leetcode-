import java.util.Scanner;
class A
{
	static Scanner in=new Scanner(System.in);
	String m1(int a)
	{
		System.out.println("Outer class method m1");
		return in.next();
	}
	static class B
	{
		static String m2(float a)
		{
			System.out.println("inner class method m2");
			return in.next();
		}
		String m3(long a)
		{
			System.out.println("inner class method m3");
			return in.next();
		}
	}
	public static void main(String[]args)
	{	
		A x=new A();
		B x1=new B();
		System.out.println(m2(A.in.nextFloat()));
		System.out.println(x1.m3(A.in.nextLong()));
	}
}