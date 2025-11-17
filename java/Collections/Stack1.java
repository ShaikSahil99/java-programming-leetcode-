import java.util.*;
class A
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Queue s=new LinkedList<>();
		LinkedList l=new LinkedList<>();
	        
		s.add(70);
		s.add(20);
		s.add("hiii");
		System.out.println(s.poll());
		l.add(90);
		l.add(20);
		l.add("jiii");
		System.out.println(l.pollFirst());
		System.out.println(s);
		System.out.print(l);

	}
}