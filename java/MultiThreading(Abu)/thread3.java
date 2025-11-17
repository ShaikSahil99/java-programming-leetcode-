import java.util.*;
class A extends Thread
{
	void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			if(i==5)
			{
				C.t2.resume();
			}
		}
	}
	public void run()
	{
		m1();
	}
}
class B extends Thread
{
	void m1()
	{
		for(int i=15;i<=20;i++)
		{
			System.out.print(i+" ");
		}
	}
	public void run()
	{
		m1();
	}
}
class C
{
	static B t2;
	public static void main(String[]args)
	{
		A t1=new A();
		t2=new B();
		t1.start();
		t2.start();
		t2.suspend();
	}
}