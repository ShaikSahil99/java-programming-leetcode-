import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			int c=i;
		}
	
	}
	public static void main(String[]arg)
	{
		A x=new A();
		Thread t1=new Thread(x);
		Thread t2=new Thread(x);
		Thread t3=new Thread(x);
		t1.start();
		System.out.println(t1.getName()+"  "+t1.isAlive());
		System.out.println(t2.getName()+"  "+t2.isAlive());
		System.out.println(t3.getName()+"  "+t3.isAlive());
		t1.setName("Hiii");
		t2.setName("byee");
		t3.setName("yooo");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.getName()+"  "+t1.isAlive());
		System.out.println(t2.getName()+"  "+t2.isAlive());
		System.out.println(t3.getName()+"  "+t3.isAlive());
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());		
	}
}
