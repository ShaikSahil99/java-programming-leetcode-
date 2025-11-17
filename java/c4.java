import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	A()
	{
		System.out.println("hello");
		new A(sc.nextBoolean(),sc.next(),sc.nextLong());
	}
	A(String a)
	{
		System.out.println(a);
	} 
	A(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
		new A(sc.next());
	}
	A(boolean a, String s, long l)
	{
		System.out.println(a);
		System.out.println(s);
		System.out.println(l);
		new A(sc.nextInt(),sc.nextInt());
	}
	public static void main(String[]args)
	{
	new A();
	}
}
    