//Complete abstraction
import java.util.Scanner;
abstract class abs7
{
	static Scanner sc = new Scanner(System.in);
	abstract void m1(int a);
	abstract void m2(float a);
	abstract void m3(String a);
	abs7(int a)
	{
		System.out.print(a);
	}
}
class B extends abs7
{
	B()
	{
		super(sc.nextInt());
	}
	void m1(int a)
	{
		System.out.print("CLASS B");
		System.out.print(a);
	}
	void m2(float a)
	{
		System.out.print(a);
	}
	void m3(String a)
	{
		System.out.print(a);
	}
}
class C extends abs7
{
	C()
	{
		super(sc.nextInt());
	}
	void m1(int a)
	{
		System.out.print("CLASS C");
		System.out.print(a);
	}
	void m2(float a)
	{
		System.out.print(a);
	}
	void m3(String a)
	{
		System.out.print(a);
	}
}
class D extends abs7
{
	D()
	{
		super(sc.nextInt());
	}
	void m1(int a)
	{
		System.out.print("CLASS D");
		System.out.print(a);
	}
	void m2(float a)
	{
		System.out.print(a);
	}
	void m3(String a)
	{
		System.out.print(a);
	}
}	
class test
{
	static Scanner sc = new Scanner(System.in);
	abs7 display(abs7 obj)
	{
		obj.m1(sc.nextInt());
		obj.m2(sc.nextFloat());
		obj.m3(sc.next());
		return obj;
	}		
	public static void main(String []args)
	{
		test obj = new test();
		System.out.println("Enter abs7 or B or C or D");
		char x = new java.util.Scanner(System.in).next().charAt(0);
		switch (x)
		{
			case 'B' : 
				System.out.print(obj.display(new B()));
				break;
			case 'C' : 
				System.out.print(obj.display(new C()));
				break;
			case 'D' : 
				System.out.print(obj.display(new D()));
				break;
		
		}
	}
}
