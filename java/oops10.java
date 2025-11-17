import java.util.Scanner;
class A
{
	 A(int a)
	{
		System.out.print("HELLO");
		System.out.print(a);
	}
}
class B extends A
{
		
	B()
	{
		super(10);
		System.out.print("WORLD");
	
	}
	public static void main(String[]args)
	{
		new B();
	}
}

      
      