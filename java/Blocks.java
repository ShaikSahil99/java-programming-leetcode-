import java.util.*;
class Blocks
{
	Blocks(int a)
	{
		System.out.println("Yooo I am Constructor");
	}
	static Scanner sc=new Scanner(System.in);
	static
	{
		System.out.println("Hi There I am Static Block");
	}
	
	{
		System.out.println("Hello there I am Instance Block");
	}
	public static void main(String[]arg)
	{
		Blocks x=new Blocks(10);
	}
}

