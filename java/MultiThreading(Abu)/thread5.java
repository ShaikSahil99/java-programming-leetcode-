//import java.util.*;
/*class A implements Runnable
{
	synchronized void m1()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
	}
	public void run()					//Object level Locking
	{
		m1();
	}
	public static void main(String[]args)
	{
		A obj=new A();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
	}
}*/
		//or

class A 
{
	static synchronized void m1()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}
class B extends Thread						//class level locking
{
	public void run()
	{
		A x= new A();
		x.m1();
	}
	public static void main(String[]args)
	{
		B t1=new B();
		B t2=new B();
		t1.start();
		t2.start();
	}	
}