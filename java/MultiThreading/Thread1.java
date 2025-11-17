import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	Test.obj1.resume();
	}
	
}
class B extends Thread
{
	public void run()
	{
		for(int i=10;i<=20;i++)
		{
			System.out.print(i+" ");
		}
			
	}
}
class Test
{
	static 	A obj=new A();
	 static B obj1=new B();
public static void main(String[]args) throws InterruptedException
{
	
	obj.start();
	obj1.start();
	obj1.suspend();
}
}
