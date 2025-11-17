import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			if()
		}
		System.out.println();
	}
	
}
class B extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.print(i+" ");
			 
		}
		System.out.println();
	}
	
}	 
class C extends Thread
{
	public void run()
	{
		for(int i=40;i<=50;i++)
		{
			System.out.print(i+" ");
			 
		}
		System.out.println();
	}	
}
class test
{
	 
	public static void main(String[]args) throws InterruptedException
	{
		A t1=new A();
		B t2=new B();
		C t3=new C();
		t1.start();
		t2.start();
		t3.start();
	}
}