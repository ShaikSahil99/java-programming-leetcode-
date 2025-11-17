import java.util.Scanner;
class A
{
	int n=sc.nextInt();
	static Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.println("hello");
	}
	A(String a)
	{
		System.out.println(a);
	} 
	A(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	A(boolean a, String s, long l,int k)
	{
		System.out.println(a);
		System.out.println(s);
		System.out.println(l);
		System.out.println(k);
	}
	public static void main(String[]args)
	{
	new A();
	new A(sc.next());
	new A(sc.nextInt(),sc.nextInt());
	new A(sc.nextBoolean(),sc.next(),sc.nextLong(),sc.nextInt());
	System.out.println(new A().a);
	}
}
    