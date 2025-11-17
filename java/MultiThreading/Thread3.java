import java.util.*;
class A extends Thread
{
	static A x=new A();
	public void run()
	{
		m1();
	}
	void m1() throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			if(i==5)
			{
				x.wait();
				
			}
		}
	}
}
class B extends Thread
{
	static B y=new B();
	public void run() 
	{
		for(int i=50;i<=60;i++)
		{
			System.out.print(i+" ");
		}
		A.x.notify();
	}
}
class Test
{
	public static void main(String[]arg) throws InterruptedException
	{
		
		
		A.x.start();
		B.y.start();
	}
}
