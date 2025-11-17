import java.util.*;
class QueueExample
{
	public static void main(String[] args)
	{	
		Queue q=new PriorityQueue(Comparator.reverseOrder());
		q.poll();
		System.out.print(q);
	}
}