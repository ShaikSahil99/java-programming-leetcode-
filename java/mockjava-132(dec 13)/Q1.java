import java.util.*;
class T1 extends Thread
{
	static T1 t1=new T1();
	void m1()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+"  ");
		}
	}
	public void run()
	{
		m1();
	}
}
class T2 extends Thread
{
	static T2 t2=new T2();
	void m2()
	{
		for(int i=20;i<=100;i++)
		{
			System.out.print(i+"  ");
		}
	}
	void m1() 
	{
		for(char i='A';i<='Z';i++)
		{
			try
			{
				System.out.print(i+"  ");
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void run() 
	{
		T3.t3.suspend();
		m1();
		T3.t3.resume();
		m2();
	}
}
class T3 extends Thread 
{	
	static T3 t3=new T3();
	void m1()
	{
		for(char i='a';i<='z';i++)
		{
			System.out.print(i+"  ");
		}
	}
	public void run()
	{
		m1();
	}
}
class User
{
	public static void main(String[]arg) throws InterruptedException
	{
		
		T1.t1.start();
		T1.t1.join();
		T2.t2.start();
		T3.t3.start();
	}
}
