import java.util.*;
public class QueueExample
{
	public static void main(String[] args)
	{	
		Queue q=new PriorityQueue(Comparator.reverseOrder());
		q.add("20");
		q.add("10"); 
		q.add("30");
		q.add("50");
		System.out.print(q);
	}
}