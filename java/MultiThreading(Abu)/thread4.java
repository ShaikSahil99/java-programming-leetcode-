import java.util.*;
class A extends Thread
{
	void m1()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.print(ch+"   ");
			if(ch=='G')
			{
				C.t2.resume();
				C.t1.suspend();
			}
		}
		C.t2.resume();
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
		for(char ch='a';ch<='z';ch++)
		{
			System.out.print(ch+"   ");
			if(ch=='g')
			{
				C.t1.resume();
				C.t2.suspend();
			}
			 
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
	static A t1;
	public static void main(String[]args)
	{
		t1=new A();
		t2=new B();
		t1.start();
		t2.start();
		t2.suspend(); 
	}
}
	