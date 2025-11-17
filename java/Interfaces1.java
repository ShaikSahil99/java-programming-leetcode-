import java.util.*;
interface A
{
	static Scanner sc=new Scanner(System.in);
	int y=sc.nextInt();
	String m1(int a);
	float m2(long l);
}
class B implements A
{
	public String m1(int a)
	{
		System.out.println(a+" ");
		return sc.next();
	}
	public float m2(long l)
	{
		System.out.println(l+" ");
		return sc.nextFloat();
	}
	public static void main(String[]arg)
	{
		B x=new B();
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m2(sc.nextLong()));
		System.out.println(A.y);
	}
}