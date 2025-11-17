import java.util.*;
class A implements Runnable
{
	void m1()
	{
		for(int i=1;i<=20;i++)
		{
			Thread t=Thread.currentThread();
			if(t.getName().equals("hi"))
			{
				if(i%3==0)
				{
					System.out.println(i+" --> hi thread lo ki vacha frnds ");
				}
			}
			else if (t.getName().equals("bye"))
			{
				if(i%4==0)
				{
					System.out.println(i+" --> bye thread lo ki vacha frnds ");
				}
			}
		}
	}
	public void run()
	{
		m1();
	}
	public static void main(String[]args)
	{
		A x=new A();
		Thread t1=new Thread(x,"hi");
		Thread t2=new Thread(x,"bye");
			t1.start();
			t2.start();
	}
}
		