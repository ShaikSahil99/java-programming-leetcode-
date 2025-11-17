/* here Because join() ob t and t1 threads,both threads are waiting for each to complete their execution first.. But both threads are blocked and this is Called DeadLock  /*
import java.util.*;                //  use Executorservices and Callable Interface for better MultiTreading
class DeadLock extends Thread
{
	static Thread t;
	public void run() 
	{
		try
		{
			System.out.print("hii");
			t.join();
			System.out.print("hello");   // Execution Stopped here
		}
		catch(InterruptedException e)
		{
		}
	}
	public static void main(String[]arg) throws InterruptedException
	{
		t=Thread.currentThread();
		DeadLock t1=new DeadLock();
		t1.start();
		t1.join();
	}
}