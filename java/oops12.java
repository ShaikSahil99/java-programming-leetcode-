import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	 A(int a)
	{
		System.out.print("HELLO");
		System.out.print(a);
	}

}
class B extends A
{
	B(float a)
	{
		super(sc.nextInt());
	}
	B()
	{
		this(sc.nextFloat());
	}
	public static void main(String[]args)
	{
		new B();
	}
}
