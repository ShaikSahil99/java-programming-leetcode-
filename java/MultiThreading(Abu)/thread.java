import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[]args)
	{
		A obj=new A();
		obj.start();
		//System.out.println(obj);
		//for(int i=11;i<=20;i++)
		//{
		//	System.out.print(i+"  ");
		//+}
	}
}

		//Or
	
class b implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[]args)
	{
		b obj=new b();
		Thread x=new Thread(obj);
		x.start();
	}
}