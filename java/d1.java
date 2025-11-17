import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	boolean a;
	int b;
	A(boolean c,int d)
	{
		a=c;
		b=d;	
		System.out.print(a+" "+b);
	}  
	A(A x)
	{
		System.out.print(x.a+" "+x.b);
	}
	boolean m1(String c)
	{
		return sc.nextBoolean();
	}
	A()
	{
	}
	public static void main(String[]args)
	{

	System.out.print(new A(new A(new A().m1(sc.next()),sc.nextInt())));
	
	}
}