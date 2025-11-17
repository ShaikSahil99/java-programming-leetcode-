Package sample;
import java.util.*;
public class Pair
{
	public static void main(String []args)
	{
		Queue q=new PriorityQueue<>();
		q.offer(10);
		q.offer(50);
		q.offer(70);
		q.offer(20);
		q.offer(80); 
		q.offer(30);
		try
		{
			q.offer("hii");
		}
		catch(ClassCastException e)
		{
			
		}
	}

}
