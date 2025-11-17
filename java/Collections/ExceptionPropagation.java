//    Exception Propagation
import java.util.Scanner;
class A
{
	public static void m1()
	{
		System.out.print(10/0);
	}
	public static void main(String[]arg)
	{
		m1();
	}
}