import java.util.Scanner;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract String m1(int a);
	abstract float m2(long l);
	
}
class Test
{
	static A x=new A()
	{
		String m1(int a)
		{	
			return sc.next();
		}
		float m2(long l)
		{
			return sc.nextFloat();
		}
	};
	public static void main(String[]arg)
	{
		System.out.println(x.m1(A.sc.nextInt()));
		System.out.println(x.m2(A.sc.nextLong()));
	}
}