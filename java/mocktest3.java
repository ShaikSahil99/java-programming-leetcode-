import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	String m1(int a)
	{
		return sc.next();
	}
}
class B
{
	static A x=new A();
	float m2(long a)
	{
		return A.sc.nextFloat();
	}
}
class test
{
	public static void main(String[]args)
	{
		
		System.out.print(B.x.m1(A.sc.nextInt()));
		B obj=new B();
		System.out.print(obj.m2(A.sc.nextLong()));
	}
}
