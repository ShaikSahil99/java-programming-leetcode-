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
	
}
class Test
{
	public static void main(String[]arg)
	{
		A obj=new A();
		Thread t1=new Thread(obj);   // Creation of new Thread
		t1.start();
		obj.start();
	}
}