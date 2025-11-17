import java.util.*;
class A extends Thread
{
	String m1(int a)
	{
		return "hii";
	}
	int m2(float a)
	{
		return 1;
	}
	public void run()
	{
		System.out.print("User frndly msgs");
	}
	public static void main(String[]arg)
	{
		A x=new A();
		x.start();
		System.out.println(x.m1(22));
		System.out.println(x.m2(55.2f));
	}
}