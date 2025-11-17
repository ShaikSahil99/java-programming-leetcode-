import java.util.*;
class A extends Thread
{
	void m1()
	{
		int fc=0;
		for(int i=2;i<=10;i++)
		{
			fc=0;
			for(int j=1;j<=i;j++)
			{
				fc++;
			}
			if(fc==2)	
			{
				try
				{	
					Thread.sleep(1000);
					System.out.print(i+" ");
				}
				catch(InterruptedException e)
				{
				}
			}
		}
	}
	public void run()
	{
		m1();
	}	
}
class Test
{
	public static void main(String[]arg)
	{
		A obj=new A();
		obj.start();
	}
}